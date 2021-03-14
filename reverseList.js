/**链表反转；
方法一：设定两个变量分别存取当前遍历节点的pre和next，然后修改pre和当前节点的指向；
pHead为当前结点，如果当前结点为空的话，直接返回；
pHead为当前结点，pre为当前结点的前一个结点，next为当前结点的下一个结点；
需要完成的目标是将pre-->pHead-->next1-->next2-->··· ···-->end反转为pre<--pHead<--next1<--next2<--··· ···<--end；
pre结点可以用来反转方向，为了避免反转之后链表断开，用next结点暂时保存next1结点；
先用next保存pHead的下一个结点信息，保证单链表不会断裂；
保存之后，让pHead从指向next变成指向pre；
到此，完成了pre到pHead的反转，即pre<--pHead;
将pre，pHead，next依次向后移动一个结点。
循环操作，直到pHead为null，此时pre就是链表的最后一个结点，链表反转完毕，pre为反转后链表的第一个结点。
输出pre就是反转之后所得的链表。

方法二：将链表的存入数组，然后再构建新的反转链表（不推荐）
**/
function objEmpty( obj ) {
	for(let name  in obj){
		return false;
	}else{
		return true;
	}
}

function reverseList(pHead){

	var pre = null,next = null;
	if(objEmpty(list)){
		return 
	}

	while(pHead != null){
		next = pHead.next;
		pHead.next = pre;
		pre =pHead;
		pHead=next;
	}
	return pre;
}