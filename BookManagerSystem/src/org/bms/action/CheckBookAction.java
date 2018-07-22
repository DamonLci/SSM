package org.bms.action;

import com.opensymphony.xwork2.ModelDriven;
import org.bms.bean.BookBean;
import org.bms.service.IBookService;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * @ClassName CheckBookAction
 * @Description TODO
 * @Author Wu Yimin
 * @Date 2018/7/22 下午5:46
 * @Version 1.0
 **/
public class CheckBookAction  implements ModelDriven{
    private IBookService bookService;
    private BookBean bookBean =new BookBean();
    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String execute(){
        String res="";
        res=bookService.queryByName(bookBean.getBookName());
        ObjectMapper om=new ObjectMapper();
        try {

            result=om.writeValueAsString(res);
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @Override
    public Object getModel() {
        return bookBean;
    }
}
