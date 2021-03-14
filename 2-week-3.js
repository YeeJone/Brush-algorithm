//选择排序(不稳定) 平均时间复杂度O(n^2)
// 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。 
// 选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。

function selectSort(array){
	for(let i = 0;i<array.length;i++){
		let minIndex = i;
		for(let j = i;j<array.length;j++){
			if(array[j]<array[minIndex]){
				let temp;
				temp = array[minIndex];
				array[minIndex] =array[j];
				array[j]= temp
			}
		}
	}
	return array;
}

let example =[12,5,2,3,65,24,12,45,58];
console.log(selectSort(example));