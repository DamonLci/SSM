package Org.Shopping.Tools;

public class RegularStr {
    /**
     * 手机号正则表达式规则
     */
    public static final String TEL="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
    /**
     * 学号正则表达式
     */
    public static final String SNO="^0?141010[0-9]\\d{4}$";
    /**
     * 6~16位数字和字母密码规则
     */
    public static final String PASS="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
    /**
     * 邮箱验证规则
     */
    public static final String Emails="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
}
