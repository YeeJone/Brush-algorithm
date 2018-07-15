//选择排序

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