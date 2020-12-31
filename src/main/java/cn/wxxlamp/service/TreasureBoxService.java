package cn.wxxlamp.service;

import cn.wxxlamp.model.TreasureBox;

/**
 * 用于神秘数字的生成和计算
 * @author wxxlamp
 * @date 2020/12/31~15:58
 */
public class TreasureBoxService {

    public TreasureBox[] createTreasureBoxes(Integer boxNum, String beginStr) {
        int loops = boxNum;
        TreasureBox[] treasureBoxes = new TreasureBox[loops];
        for (int i = 0; i < loops; i++) {
            TreasureBox treasureBox = new TreasureBox();
            treasureBox.setNumber(i + 1);
            treasureBox.setPreHash(i == 0 ? "0" : treasureBoxes[i-1].getCurHash());
            treasureBox.setTimeStamp(System.currentTimeMillis());
            for (int j = 0; j < Integer.MAX_VALUE; j++) {
                treasureBox.setMagicNumber(j);
                if (treasureBox.getCurHash().startsWith(beginStr)) {
                    break;
                }
            }
            treasureBoxes[i] = treasureBox;
        }
        return treasureBoxes;
    }

    public Integer[] getMagicNumsFromTreasureBox(TreasureBox[] treasureBoxes) {
        Integer[] magicNums = new Integer[treasureBoxes.length];
        for (int i = 0; i < magicNums.length; i++) {
            magicNums[i] = treasureBoxes[i].getMagicNumber();
        }
        return magicNums;
    }

    public void printMagicNums(Integer[] magicNums) {
        for (Integer magicNum : magicNums) {
            System.out.print(magicNum + " ");
        }
    }
}
