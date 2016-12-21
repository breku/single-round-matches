package com.brekol.srm162.div1;

public class PaperFold {

    public int numFolds(int[] paper, int[] box) {

        return getNumFolds(box[0], box[1], paper[0], paper[1], 0);

    }

    private int getNumFolds(int boxWidth, int boxHeight, double paperWidth, double paperHeight, int currentFolds) {

        if (currentFolds > 8) {
            return -1;
        }

        if ((paperWidth <= boxWidth && paperHeight <= boxHeight) || (paperHeight <= boxWidth && paperWidth <= boxHeight)) {
            return currentFolds;
        }


        final int numFoldsLeft = getNumFolds(boxWidth, boxHeight, paperWidth / 2, paperHeight, currentFolds + 1);
        final int numFoldsRight = getNumFolds(boxWidth, boxHeight, paperWidth, paperHeight / 2, currentFolds + 1);

        if (numFoldsLeft > -1 && numFoldsRight > -1) {
            return Math.min(numFoldsLeft, numFoldsRight);
        } else if (numFoldsLeft == -1) {
            return numFoldsRight;
        } else {
            return numFoldsLeft;
        }

    }
}
