package com.brekol.srm602.div1;

/**
 * Created by brekol on 13.12.16.
 */
public class TypoCoderDiv1 {

    public int getmax(int[] D, int X) {


        MyTree myTree = createMyTree(D, X);
        return findMax(myTree);

    }

    private int findMax(MyTree myTree) {

        if (myTree.end) {
            return 0;
        } else {
            if (myTree.left == null && myTree.right == null) {
                return myTree.jumps;
            } else {
                int leftMax = findMax(myTree.left);
                int rightMax = findMax(myTree.right);
                return Math.max(leftMax, rightMax);
            }
        }
    }

    private MyTree createMyTree(int[] d, int x) {
        MyTree tree = new MyTree();
        tree.value = x;
        init(tree, d, 0);
        return tree;
    }

    private int init(MyTree myTree, int[] d, int i) {
        int leftJumps = 0;
        int rightJumps = 0;
        if (i < d.length) {
            myTree.left = new MyTree();
            if (Math.min(myTree.value, myTree.value + d[i]) >= 2200) {
                myTree.left.end = true;
            } else {
                if (myTree.value < 2200 && myTree.value + d[i] >= 2200) {
                    myTree.left.jumps += myTree.jumps + 1;
                    leftJumps = myTree.left.jumps;
                } else {
                    myTree.left.jumps += myTree.jumps;
                }
                myTree.left.value = myTree.value + d[i];
                init(myTree.left, d, i + 1);
            }
        }
        if (i < d.length) {
            myTree.right = new MyTree();
            if (Math.min(myTree.value, myTree.value - d[i]) >= 2200) {
                myTree.right.end = true;
            } else {

                if (myTree.value >= 2200 && myTree.value - d[i] < 2200) {
                    myTree.right.jumps += myTree.jumps + 1;
                    rightJumps = myTree.right.jumps;
                } else {
                    myTree.right.jumps += myTree.jumps;
                }
                myTree.right.value = myTree.value - d[i];
                if (myTree.right.value < 0) {
                    myTree.right.value = 0;
                }
                init(myTree.right, d, i + 1);
            }
        }
        return Math.max(leftJumps, rightJumps);
    }

    private class MyTree {
        int value;
        int jumps = 0;
        boolean end = false;
        MyTree left;
        MyTree right;
    }
}
