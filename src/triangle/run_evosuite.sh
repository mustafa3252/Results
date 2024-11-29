#!/bin/bash

export JAVA_HOME=/usr/lib/jvm/java-11-openjdk/
export PATH=$JAVA_HOME/bin:$PATH

# Verify the Java version being used
echo "Using Java version:"
java -version

# Compile the Java files
echo "Compiling Java files..."
javac *.java
if [ $? -ne 0 ]; then
    echo "Compilation failed."
    exit 1
fi
echo "Compilation successful."

# Variables
CLASS_NAME="Triangle" # Fully qualified class name
PROJECT_DIR="."       # Directory containing compiled class files
CRITERION="branch"    # Coverage criterion
EVOSUITE_JAR="evosuite-master-1.2.1-SNAPSHOT.jar" # EvoSuite JAR file
ALGORITHMS=("RANDOM_SEARCH" "STANDARD_GA" "DYNAMOSA") # List of algorithms
RUNS=10                # Number of runs for each algorithm
BASE_RESULTS_DIR="evosuite-results" # Base directory for results
OUTPUT_VARIABLES="criterion,Coverage,Total_Goals,Covered_Goals,Size,Length,MutationScore"

# Ensure the results directory exists
mkdir -p $BASE_RESULTS_DIR

# Compile the Java file
echo "Compiling Java files..."
javac -d . Triangle.java

if [ $? -ne 0 ]; then
  echo "Compilation failed. Exiting."
  exit 1
fi

echo "Compilation successful."

# Loop through each algorithm
for ALGO in "${ALGORITHMS[@]}"; do
  # Create directories for the algorithm
  ALGO_DIR="${BASE_RESULTS_DIR}/${ALGO}"
  mkdir -p $ALGO_DIR
  echo "Running algorithm: $ALGO"

  # Run the algorithm 10 times
  for ((i=1; i<=RUNS; i++)); do
    RUN_DIR="${ALGO_DIR}/run_${i}" # Unique directory for each run
    mkdir -p $RUN_DIR

    echo "  Run $i..."

    # Check if the algorithm is DynaMOSA
    if [[ "$ALGO" == "DYNAMOSA" ]]; then
      echo "    Using DynaMOSA with conditional flags..."
      java -jar $EVOSUITE_JAR \
        -class $CLASS_NAME \
        -projectCP $PROJECT_DIR \
        -criterion $CRITERION \
        -Dalgorithm=$ALGO \
        -Dtest_dir=$RUN_DIR \
        -Doutput_variables=$OUTPUT_VARIABLES
    else
      # Use the default command for other algorithms
      java -jar $EVOSUITE_JAR \
        -class $CLASS_NAME \
        -projectCP $PROJECT_DIR \
        -criterion $CRITERION \
        -generateTests \
        -Dalgorithm=$ALGO \
        -Dtest_dir=$RUN_DIR \
        -Doutput_variables=$OUTPUT_VARIABLES
    fi

    if [ $? -ne 0 ]; then
      echo "    Error during run $i of $ALGO. Skipping test execution."
      echo "Run $i: Test generation failed" >> "${RUN_DIR}/test_run_success"
      continue
    fi

    echo "    Test generation completed for run $i."
  done
done

echo "All algorithms completed."
