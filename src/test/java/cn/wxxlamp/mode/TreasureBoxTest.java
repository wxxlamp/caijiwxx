package cn.wxxlamp.mode;

import cn.wxxlamp.model.TreasureBox;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author wxxlamp
 * @date 2020/12/31~15:37
 */
public class TreasureBoxTest {

    @Test
    public void testHash() {
        String excepted = "86dbdf834c32f31aa7e5c3a62d9e75cda45d54cdd3e6b16183e21f45137497e6";
        TreasureBox treasureBox = createTreasureBox();
        Assert.assertEquals(treasureBox.getCurHash(), excepted);
    }

    private TreasureBox createTreasureBox() {
        TreasureBox treasureBox = new TreasureBox();
        treasureBox.setNumber(0);
        treasureBox.setTimeStamp(111L);
        treasureBox.setMagicNumber(3);
        treasureBox.setPreHash("0");
        return treasureBox;
    }
}
