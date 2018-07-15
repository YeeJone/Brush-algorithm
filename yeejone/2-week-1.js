//洗牌算法

function shuffle (array){
	if(!array.length || array.length == 1){
		return array
	}else{
		for(let i = 0;i<array.length;i++){
			let radomIndex = Math.floor(Math.random()*array.length);
			let radomItem = array[radomIndex];
			array[radomIndex]=array[i];
			array[i] = radomItem;
		}
	}

	return array;
}

let example = [1,2,3,4,5,6,7,8,9];
console.log(shuffle(example));