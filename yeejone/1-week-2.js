//归并排序(稳定) 平均时间复杂度O(nlogn) 
// 归并排序是一种分治算法。其思想是将原始数组从中间切分成较小的左右两个数组，再将左右两个数组分别从中间切分成更小的数组，
// 直到每个小数组只有一个元素，接着将小数组归并成较大的数组，在归并过程中也会完成排序，直至原始数组完全合并并完成排序。


const example = [12,23,15,11,10,45,95,36,28,88];

function merge(left, right) {
    var result = [];
    while (left.length && right.length) {
      if (left[0] < right[0])
      	result.push(left.shift());
    else
      result.push(right.shift());
  }

  return result.concat(left, right);
}

function mergeSort(a) {
	if (a.length === 1)
    	return a;

	var work = [];
    for (var i = 0, len = a.length; i < len; i++)
    	work.push([a[i]]);

    work.push([]); // 如果数组长度为奇数

    for (var lim = len; lim > 1; lim = ~~((lim + 1) / 2)) {
    	for (var j = 0, k = 0; k < lim; j++, k += 2) 
      		work[j] = merge(work[k], work[k + 1]);

    	work[j] = []; 
    }

    return work[0];
}

console.log(mergeSort(example));