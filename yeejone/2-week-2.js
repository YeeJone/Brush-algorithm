//冒泡排序(稳定) 平均时间复杂度O(n^2) 最好情况O(n)
// 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
// 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
// 针对所有的元素重复以上的步骤，除了最后一个。
// 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。


function bubbleSort(array){
	for(let i = array.length-1;i>0;i--){
		for(let j =0;j<i;j++){
			let temp;
			if(array[j]>array[j+1]){
				temp = array[j];
				array[j] = array[j+1];
				array[j+1]  =temp;
			}
		}
	}
	return array
}

let example =[1,5,8,6,2,3,4,8,5];
console.log(bubbleSort(example));