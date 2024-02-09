### Binary Search
<p style="text-align: justify; font-size:17px;font-weight: 400;">Binary search with only sorted elements. At first we need to ensure that the array we're searching element is sorted in ascending or descending order</p>

```java
public static boolean findElement(int[] nums, int target)
{
	int lengthOfArray = nums.length;
	int left = 0, right = lengthOfArray-1;
	while(left <= right){
		int mid = left + (right - left)/2;
		if(nums[mid] == target){
			return true;
		}
		if(nums[mid] > target){
			right = mid-1;
		}
		else{
			left = mid + 1;
		}
	}
	return false;
}
```
</p>
<h2>BFS / DFS / Flood Fill<h2>
<h2>Tree Traversal<h2>
<h2>Hash Tables<h2>
<h2>Linked List, stacks, queues, two pointer, sliding window<h2>
<h2>Binary Heaps<h2>
<h2>Dynamic Programming<h2>
<h2>Union Find<h2>
<h2>Ad hoc / String manipulation<h2>
<h2>Trie, Segment Tree / Fenwick Trees, Bitmask<h2>