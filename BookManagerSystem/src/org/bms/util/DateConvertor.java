package org.bms.util;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @ClassName DateConvertor
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/16 上午10:11
 * @Version 1.0
 **/
public class DateConvertor extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map<String, Object> context, Object value, Class toType) {
        //将字符串转日期 java.util.Date
        //context 是ogml上下文对象
        //value需要转换的值
        //type转换的类型
        SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");
        if(toType!=Date.class){
            String da=((String []) value)[0];
            try {
                return df.parse(da);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else{
            Date da=(Date) value;
            return df.format(da);

        }
        return null;
    }
}
