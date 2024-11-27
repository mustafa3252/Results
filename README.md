# Automated Test Generation using EvoSuite

This repository contains the source code and experimental results for automated test generation using EvoSuite on two Java programs: `Triangle.java` and `SortHeap.java`. The experiments evaluate the impact of different search algorithms on the effectiveness of test generation, focusing on branch coverage and test suite quality.

---

## Repository Structure

. ├── results │ ├── heapsort │ │ ├── RandomSearch │ │ │ ├── run_1 │ │ │ │ ├── statistics.csv │ │ │ │ └── GeneratedTests/ │ │ │ ├── run_2 │ │ │ │ ├── statistics.csv │ │ │ │ └── GeneratedTests/ │ │ │ └── ... │ │ ├── ONE_PLUS_ONE_EA │ │ │ ├── run_1 │ │ │ │ ├── statistics.csv │ │ │ │ └── GeneratedTests/ │ │ │ └── ... │ │ ├── NSGAII │ │ │ ├── run_1 │ │ │ │ ├── statistics.csv │ │ │ │ └── GeneratedTests/ │ │ │ └── ... │ │ └── ... │ └── triangle │ ├── RandomSearch │ │ ├── run_1 │ │ │ ├── statistics.csv │ │ │ └── GeneratedTests/ │ │ └── ... │ ├── StandardGA │ │ ├── run_1 │ │ │ ├── statistics.csv │ │ │ └── GeneratedTests/ │ │ └── ... │ ├── DynaMOSA │ │ ├── run_1 │ │ │ ├── statistics.csv │ │ │ └── GeneratedTests/ │ │ └── ... │ └── ... └── src ├── heapsort │ ├── SortHeap.java │ ├── evosuite.jar │ └── run_evosuite.sh └── triangle ├── Triangle.java ├── evosuite.jar └── run_evosuite.sh 
 
## Replicate

To replicate, 
1. Navigate to Src Folder
2. then to the corresponding directory, either triangle or heapsort
3. within that director, is a run_evosuite.sh script 
4. make it excecutable using chmod +x run_evosuite.sh command
5. Now staying inside that directory, use ./run_evosuite.sh command to run the experiment