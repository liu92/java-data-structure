package com.data.structure.algorithms;

/**
 * 98. 验证二叉搜索树
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *    节点的左子树只包含小于当前节点的数。
 *    节点的右子树只包含大于当前节点的数。
 *    所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 *
 * @ClassName: Solution
 * @Description:
 * @Author: lin
 * @Date: 2020/10/26 23:10
 * History:
 * @<version> 1.0
 */
public class Solution {
    private long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNodeTest root){
        if(null == root){
            return  true;
        }
        // 访问左子树
        if(!isValidBST(root.left)){
            return  false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，
        // 说明不满足BST(Binary Sort Tree)，返回 false；否则继续遍历。
        if(root.val <= pre){
            return  false;
        }

        pre = root.val;

        //访问右子树
        return  isValidBST(root.right);
    }
}
