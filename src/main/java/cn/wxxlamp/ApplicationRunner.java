package cn.wxxlamp;

import cn.wxxlamp.model.TreasureBox;
import cn.wxxlamp.service.TreasureBoxService;

/**
 * 主方法运行类
 * @author wxxlamp
 * @date 2020/12/31~15:36
 */
public class ApplicationRunner {

    /**
     * 箱子的数目
     */
    private static final Integer BOX_NUM = 10;

    /**
     * hash值前五位的状态
     */
    private static final String BEGIN_STR = "00000";

    public static void main(String[] args) {
        TreasureBoxService treasureBoxService = new TreasureBoxService();
        TreasureBox[] treasureBoxes = treasureBoxService.createTreasureBoxes(BOX_NUM, BEGIN_STR);
        Long[] magicNums = treasureBoxService.getMagicNumsFromTreasureBox(treasureBoxes);
        treasureBoxService.printMagicNums(magicNums);
    }
}
