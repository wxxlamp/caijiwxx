package cn.wxxlamp.model;

import cn.wxxlamp.util.EncryptUtils;

/**
 * 宝箱实体类
 * @author wxxlamp
 * @date 2020/12/31~15:00
 */
public class TreasureBox {

    /**
     * 宝箱编号
     */
    private Integer number;

    /**
     * 开启宝箱的时间戳
     */
    private Long timeStamp;

    /**
     * 上个宝箱的hash值，
     * 第一个宝箱的hash值为0，
     * 采用sha256方式加密
     */
    private String preHash;

    /**
     * 当前宝箱的hash值
     */
    private String curHash;
    /**
     * 神秘数字
     */
    private Long magicNumber;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public String getCurHash() {
        String allAttribute = this.number.toString() + this.timeStamp.toString()
                + this.preHash + this.magicNumber.toString();
        this.curHash = EncryptUtils.string2Sha256(allAttribute);
        return curHash;
    }

    public void setCurHash(String curHash) {
        this.curHash = curHash;
    }

    public Long getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(Long magicNumber) {
        this.magicNumber = magicNumber;
    }
}
