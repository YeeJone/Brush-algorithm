//快排

var example = [12,23,15,11,10,45,95,36,28,88];

function quickSort(theArray) {

	function sort(start, arrayLength){
		let right = arrayLength-1,
			left = start,
			keyVal = theArray[start];
		if((arrayLength - start) > 1){
			while(left<right){
				for(;right>left;right--){
					if(theArray[right]<keyVal){
						theArray[left]=theArray[right];
						left++;
						break;
					}
				}
				for(;right>left;left++){
					if(theArray[left]>keyVal){
						theArray[right]=theArray[left];
						right--;
						break;
					}
				}
			}
			theArray[left] = keyVal;
			sort(0,left);
			sort(left + 1,arrayLength)//这里的起始值最好写left+1，不要写right，更为的直观明确
		}
	}
	sort(0,theArray.length)
	return theArray;
}
console.log(quickSort(example));