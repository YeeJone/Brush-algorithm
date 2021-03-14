//堆排序 （不稳定） 平均时间复杂度O(nlogn);

//比较当前节点和子节点的大小
function heapify(array,currentX,len){
	var left = currentX*2+1;
	var right = currentX*2+2;
	var largestIndex = currentX;

	if(left<len && array[left]>array[largestIndex]){
		largestIndex = left
	}

	if(right<len && array[right]>array[largestIndex]){
		largestIndex = right;
	}

	if(largestIndex != currentX){
		let temp = array[currentX];
		array[currentX] = array[largestIndex];
		array[largestIndex] = temp;
		heapify(array, largestIndex, len);//交换后还需比较改变后子节点是否为大小堆
	}
}

function heap(array){
	var heapSize = array.length;

	//构建堆的过程
	for(let i= Math.floor(heapSize/2);i>=0;i--){
		heapify(array,i,heapSize);
	}

	//堆排序
	for(let i = heapSize-1;i>=1;i--){
		let temp = array[0];
		array[0]=array[i];
		array[i] = temp;
		heapify(array,0,--heapSize);
	}

	return array;
}

console.log(heap([1,2,3,4,5,6,10,15,85,7,8]))