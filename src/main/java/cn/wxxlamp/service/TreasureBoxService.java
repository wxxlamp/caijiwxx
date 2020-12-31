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
                    System.out.println("第 " + treasureBox.getNumber() + " 个宝箱开启完成，神秘数字是：" + j);
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
        System.out.println("所有宝箱的神秘数字依次如下：");
        for (Long magicNum : magicNums) {
            System.out.print(magicNum + " ");
        }
    }
}
