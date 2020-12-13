# 树的 BFS（宽度优先搜索）

⬜️ 未完成  ✅ 已完成    

✅  [103. 二叉树的锯齿形层次遍历](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)  
✅  [102. 二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)  
✅  [107. 二叉树的层次遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)  
✅  [637. 二叉树的层平均值](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/)   
✅  [111. 二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/)   
✅  [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)   
  
## 总结  
上面几道题，都是通过 BFS 来进行解答的  
关于 BFS ，写多了就会发现，如出一辙，就是双层遍历，最朴实的方法就是申明两个数组变量，用来存储当前层的节点和下一层的节点，外层循环用来遍历二叉树的层数，内层循环用来遍历每层的节点，这样就可以实现二叉树的广搜。  
上面朴实的方法，在空间利用率上可以做一点优化...**利用队列先进先出** 的原理，使用一个队列数组即可代替上面的「两个数组变量」。  
在每层遍历的时候，对当前层的节点做出队列操作，对下一层的节点做入队列操作，这样就能减少空间的消耗  
**关键代码**  
```js  
  const q = [] // 队列 q
  q.push(root)

  while(!!q.length) { // 当队列长度为 0 时，说明下层再无叶子结点，已遍历至最后的一层
      const currentLenght = q.length // 保存当前队列长度
        for(let i = 0;i < currentLenght; i++) { // 遍历当前层节点
          const currentNode = q.shift() // 通过出队列的方式获取当前节点
          if(currentNode.left) q.push(currentNode.left) //将下一层节点进行入队列操作
          if(currentNode.right) q.push(currentNode.right) 
      }
  }
```
