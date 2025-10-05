# Kadane’s Algorithm — Implementation, Optimization & Performance Benchmark

##  Overview
This project implements **Kadane’s Algorithm** — a linear-time algorithm for finding the **maximum subarray sum** in an array of integers.  
It includes both **baseline** and **optimized** implementations, along with a **performance benchmarking framework**, **edge-case handling**, and **comprehensive test coverage**.

The project focuses on:
- Clean algorithm design
- Performance instrumentation
- Experimental validation
- Code quality and reproducibility

## 📁 Project Structure
````
├── src/
│ ├── main/java/
│ │ ├── algorithms/KadaneAlgorithm.java
│ │ ├── metrics/PerformanceTracker.java
│ │ └── cli/BenchmarkRunner.java
│ └── test/java/
│ └── algorithms/KadaneTest.java
├── docs/
  └── plots/
│   ├── report.pdf
│   ├── Дизайн без названия.png
├── kadane-results.csv
├── README.md
└── pom.xml 
````

---

## _Implementation Details_

**1. KadaneAlgorithm.java**

Implements both baseline and optimized versions

Handles edge cases:
Empty array
Single-element array
All-negative elements

****2. PerformanceTracker.java****

Tracks key runtime metrics:
Comparisons
Array accesses
Swaps (if any)
Memory allocations
Execution time (in ms)

**3. BenchmarkRunner.java**
Runs automated benchmarks for different input sizes
Writes results to kadane-results.csv
Prints per-trial metrics to the console

**4. KadaneTest.java**

Comprehensive JUnit5 test suite covering:
Empty input
Single-element input
All negative numbers
Mixed positive/negative values
Large random datasets


📊 Asymthotic Complexity:

| Case         | Time Complexity | Space Complexity | Explanation                                   |
| ------------ | --------------- | ---------------- | --------------------------------------------- |
| Best Case    | O(n)            | O(1)             | Single pass, no extra space                   |
| Average Case | O(n)            | O(1)             | Linear scans and constant auxiliary variables |
| Worst Case   | O(n)            | O(1)             | No early termination possible                 |

🧠 Performance Metrics

| Metric                 | Description                                        |
| ---------------------- | -------------------------------------------------- |
| **Comparisons**        | Number of comparison operations (`>` or `<`)       |
| **Array Accesses**     | Number of times array elements are read or written |
| **Memory Allocations** | Extra heap allocations beyond input                |
| **Runtime (ms)**       | Wall-clock time per trial                          |

🧪 Experimental Results
# Benchmark setup:

Input sizes: n = 100, 1,000, 2,000, 5,000, 10,000
Trials: 5 per input
Environment: Java 17, Windows 11, Maven

| n      | Avg. Runtime (ms) | Comparisons | Array Accesses |
| ------ | ----------------: | ----------: | -------------: |
| 100    |               0.5 |         201 |            200 |
| 1,000  |               1.2 |       2,001 |          2,000 |
| 2,000  |               2.5 |       4,001 |          4,000 |
| 5,000  |               6.3 |      10,001 |         10,000 |
| 10,000 |              12.4 |      20,001 |         20,000 |

## 📊 Performance Plots
### n vs Comparisons
![n vs Comparisons](docs/plots/![Дизайн без названия.png](docs/plots/%D0%94%D0%B8%D0%B7%D0%B0%D0%B9%D0%BD%20%D0%B1%D0%B5%D0%B7%20%D0%BD%D0%B0%D0%B7%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F.png)


**🔍 Analysis and Discussion**

Both comparisons and array accesses increase linearly with input size, confirming theoretical complexity.

The optimized version reduced runtime by ~25% due to minimized conditional checks and loop unrolling.

Memory footprint remains constant — only primitive variables are used.

The PerformanceTracker helped correlate algorithmic operations with real execution time.



🧰 Running the Project
▶️ Compile and Run Benchmark

mvn clean compile exec:java -Dexec.mainClass="cli.BenchmarkRunner"

🧪 Run Unit Tests
mvn test
Output example:

Benchmark KadaneAlgorithm (n=10000, trials=5)
Trial 1: time=12 ms, comparisons=20001, accesses=20000
Trial 2: time=11 ms, comparisons=19987, accesses=20000
...

**_🌟 Future Improvements_**

Integrate JMH (Java Microbenchmark Harness) for more precise measurements

Add Divide and Conquer version for comparison

Include visualization of subarray segments in GUI

Extend metrics with GC time and heap usage

Add CSV to graph auto-generator

**_🏁 Conclusion_**

This project demonstrates how Kadane’s Algorithm achieves true O(n) performance in both theory and practice.
The results confirm its efficiency, scalability, and simplicity — making it one of the most elegant algorithms for subarray analysis.
With integrated benchmarking, metrics, and visualization, this project bridges the gap between theoretical computer science and empirical software performance.
