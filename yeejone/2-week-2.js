//冒泡排序

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