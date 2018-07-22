//线性查找

function lineSearch(arr,target){
	if(!arr){
		return -1;
	}
	for(let i=0;i<arr.length;i++){
		if(arr[i] == target){
			return i
		}
	}
	return -1;
}

let example = [1,2,56,85,4,59,65];
console.log(lineSearch(example,65))