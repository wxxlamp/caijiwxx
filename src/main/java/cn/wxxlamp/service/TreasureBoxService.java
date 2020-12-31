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
            for (long j = 0; j < Long.MAX_VALUE; j++) {
                treasureBox.setMagicNumber(j);
                if (treasureBox.getCurHash().startsWith(beginStr)) {
                    break;
                }
            }
            treasureBoxes[i] = treasureBox;
        }
        return treasureBoxes;
    }

    public Long[] getMagicNumsFromTreasureBox(TreasureBox[] treasureBoxes) {
        Long[] magicNums = new Long[treasureBoxes.length];
        for (int i = 0; i < magicNums.length; i++) {
            magicNums[i] = treasureBoxes[i].getMagicNumber();
        }
        return magicNums;
    }

    public void printMagicNums(Long[] magicNums) {
        for (Long magicNum : magicNums) {
            System.out.print(magicNum + " ");
        }
    }
}
