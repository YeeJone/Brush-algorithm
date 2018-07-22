//二分查找
/**
1. 是一种在有序数组中查找某一特定元素的搜索算法；
2. 搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；
   如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
   如果在某一步骤数组为空，则代表找不到
**/

function binarySearch(arr,target,start,end){
	if(start > end){
		return -1
	}
	let mid = parseInt((end+start+1)/2);
	if(arr[mid]>target){
		return binarySearch(arr,target,start,mid-1)
	}
	if(arr[mid] < target){
		return binarySearch(arr,target,mid+1,end)
	}
	return mid
}

let example = [1,2,3,4,5,6,7,8,9,10]

console.log(binarySearch(example,2,0,9))