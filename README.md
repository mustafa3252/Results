# Automated Test Generation using EvoSuite 

This repository contains the source code and experimental results for automated test generation using EvoSuite on two Java programs: `Triangle.java` and `SortHeap.java`. The experiments evaluate the impact of different search algorithms on the effectiveness of test generation, focusing on branch coverage and test suite quality.

## Repository Structure

├── README.md
├── results
│   ├── heapsort
│   │   ├── statistics.csv
│   │   ├── generated_tests
│   │       ├── RANDOM_SEARCH
│   │       │   ├── run_1
│   │       │   │   ├── SortHeap_ESTest.java
│   │       │   │   ├── SortHeap_ESTest_scaffolding.java
│   │       │   ├── ...
│   │       ├── NSGAII
│   │       │   ├── run_1
│   │       │   │   ├── SortHeap_ESTest.java
│   │       │   │   ├── SortHeap_ESTest_scaffolding.java
│   │       │   ├── ...
│   │       ├── ONE_PLUS_ONE_EA
│   │           ├── run_1
│   │           │   ├── SortHeap_ESTest.java
│   │           │   ├── SortHeap_ESTest_scaffolding.java
│   │           ├── ...
│   ├── triangle
│      ├── statistics.csv
│      ├── generated_tests
│          ├── RANDOM_SEARCH
│          │   ├── run_1
│          │   │   ├── Triangle_ESTest.java
│          │   │   ├── Triangle_ESTest_scaffolding.java
│          │   ├── ...
│          ├── STANDARD_GA
│          │   ├── run_1
│          │   │   ├── Triangle_ESTest.java
│          │   │   ├── Triangle_ESTest_scaffolding.java
│          │   ├── ...
│          ├── DYNAMOSA
│              ├── run_1
│              │   ├── Triangle_ESTest.java
│              │   ├── Triangle_ESTest_scaffolding.java
│              ├── ...
└── src
    ├── heapsort
    │   ├── SortHeap.java
    │   ├── evosuite-master-1.2.1-SNAPSHOT.jar
    │   └── run_evosuite.sh
    └── triangle
        ├── Triangle.java
        ├── evosuite-master-1.2.1-SNAPSHOT.jar
        └── run_evosuite.sh

## Contents

The `results/` directory contains the experimental results for each program and search algorithm.

The `src/` directory contains the source code, EvoSuite JAR, and scripts to run the experiments.

## How to Reproduce the Experiments

You can reproduce the experiment using the `run_evosuite.sh` script. This script assumes that **Java JDK 11** or later and **Bash shell** (for running `.sh` scripts on Unix/Linux systems) is available. 

#### Steps

1. **Navigate to the Source Directory**

   For `Triangle.java`:

   ```
   cd src/triangle
   ```

   For `SortHeap.java`:

   ```
   cd src/heapsort
   ```

2. **Make the Script Executable**

   ```
   chmod +x run_evosuite.sh
   ```

3. **Run the Experiment Script**

   ```
   ./run_evosuite.sh
   ```

   This script will:

   1. Compile the Java source file.

   2. Run EvoSuite ten times for each specified search algorithm.

   3. Store the generated tests and statistics in the corresponding directories under `evosuite_results/`. 

## Script Details

The `run_evosuite.sh` script automates the test generation process. Below is an overview of its functionality:

- **Compilation**

  Compiles the Java source file to generate the `.class` file:

  ```
  javac -d . <SourceFile>.java
  ```

- **EvoSuite Execution**

  The `run_evosuite.sh` script automates the process of compiling a Java program and generating test suites using EvoSuite with different search algorithms. It first compiles the specified Java source file (e.g., `Triangle.java`), then iterates over a predefined list of algorithms (such as `RANDOM_SEARCH`, `STANDARD_GA`, and `DYNAMOSA`), running EvoSuite multiple times for each algorithm to account for randomness. For each run, it executes EvoSuite with the specified algorithm and stores the generated tests in organized directories under `evosuite_results/`, it adds the statistics for the run in `evosuite_report/statistics.csv` file, facilitating easy comparison and analysis of the algorithms' performance in achieving branch coverage and test suite effectiveness.

