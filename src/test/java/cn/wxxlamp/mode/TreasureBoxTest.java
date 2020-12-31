package cn.wxxlamp.mode;

import cn.wxxlamp.model.TreasureBox;
import org.junit.Assert;
import org.junit.Test;

/**
 * {@link TreasureBox}中hash方法的测试类
 * @author wxxlamp
 * @date 2020/12/31~15:37
 */
public class TreasureBoxTest {

    @Test
    public void testHash() {
        String excepted = "88c0413bfef1d0570a8a6f9c780a8d2c9e90c4d107551d62bf3cec9ff1f5b634";
        TreasureBox treasureBox = createTreasureBox();
        Assert.assertEquals(treasureBox.getCurHash(), excepted);
    }

    private TreasureBox createTreasureBox() {
        TreasureBox treasureBox = new TreasureBox();
        treasureBox.setNumber(0);
        treasureBox.setMagicNumber(3L);
        treasureBox.setPreHash("0");
        return treasureBox;
    }
}
