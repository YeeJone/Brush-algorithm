//快排（不稳定）平均时间复杂度O(nlogn) 最坏时间复杂度：n^2
// 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
// 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
// 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
// 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
// 5）重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。

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