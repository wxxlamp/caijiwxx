package cn.wxxlamp.service;

import cn.wxxlamp.model.TreasureBox;
import org.junit.Assert;
import org.junit.Test;

/**
 * 对部分运行结果进行测试
 * {@link TreasureBoxService}的测试类
 * @author wxxlamp
 * @date 2020/12/31~16:56
 */
public class TreasureBoxServiceTest {

    @Test
    public void testMagicNumber() {
        TreasureBoxService treasureBoxService = new TreasureBoxService();
        TreasureBox[] treasureBox = treasureBoxService.createTreasureBoxes(10, "00000");
        for (TreasureBox box : treasureBox) {
            Assert.assertTrue(box.getCurHash().startsWith("00000"));
        }
    }

}