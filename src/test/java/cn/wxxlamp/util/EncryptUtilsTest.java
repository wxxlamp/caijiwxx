package cn.wxxlamp.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * 密码工具{@link EncryptUtils}的测试类
 * @author wxxlamp
 * @date 2020/12/31~15:21
 */
public class EncryptUtilsTest {

    @Test
    public void testString2Sha256() {
        String source = "1111111";
        String target = "2558a34d4d20964ca1d272ab26ccce9511d880579593cd4c9e01ab91ed00f325";
        Assert.assertEquals(target,EncryptUtils.string2Sha256(source));
    }
}
