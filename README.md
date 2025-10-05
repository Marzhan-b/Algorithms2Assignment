# Kadane's Algorithm Benchmark

## Overview
Kadane’s Algorithm finds the **maximum sum subarray** in a single pass through the array.  
It tracks:
- `currentSum` — sum of the current subarray
- `maxSum` — maximum sum found so far

**Example:**
Array: [-2,1,-3,4,-1,2,1,-5,4]
Max Subarray: [4,-1,2,1]
Sum: 6


---

## Usage
Run the benchmark via CLI:

mvn clean compile exec:java -Dexec.mainClass="cli.BenchmarkRunner" -Dexec.args="[array_size] [input_type]"

[array_size] — size of the array, e.g., 1000
[input_type] — random, sorted, reverse, nearly-sorted

Complexity Analysis

| Case         | Time Complexity | Notes                 |
| ------------ | --------------- | --------------------- |
| Best Case    | Ω(n)            | All elements positive |
| Average Case | Θ(n)            | Random elements       |
| Worst Case   | O(n)            | All elements negative |
Space Complexity: O(1) — constant extra memory.

Benchmark Results

| Array Size | Elapsed Time (ns) |
| ---------- | ----------------- |
| 198        | 0                 |
| 1,998      | 0                 |
| 3,998      | 1,344,900         |
| 9,998      | 1,537,000         |
| 19,998     | 16,002,500        |
| 99,999     | 43,159,900        |

Observations

Elapsed time grows linearly with array size, confirming O(n) time complexity

Comparisons and assignments are minimal; main metric is elapsed time

Space usage is constant (O(1)) — memory-efficient

Edge cases (empty or single-element arrays) handled correctly


<<<<<<< HEAD

=======
Benchmark Graph (PNG)

![Kadane Benchmark](https://quickchart.io/chart?c={

type:'line',
data:{
labels:['198','1998','3998','9998','19998','99999'],
datasets:[{
label:'Elapsed Time (ns)',
data:[0,0,1344900,1537000,16002500,43159900],
fill:false,
borderColor:'rgb(75, 192, 192)',
tension:0.1
}]
},
options:{
plugins:{legend:{display:true, position:'top'}},
scales:{
y:{title:{display:true, text:'Elapsed Time (ns)'}},
x:{title:{display:true, text:'Array Size'}}
}
}
})
>>>>>>> b4be2c3 (docs: add Kadane benchmark, table and graph)


Notes

Use this implementation for large arrays — much faster than naive O(n²) approaches

<<<<<<< HEAD
Benchmark data collected using CLI runner in nanoseconds
=======
Benchmark data collected using CLI runner in nanoseconds
>>>>>>> b4be2c3 (docs: add Kadane benchmark, table and graph)
