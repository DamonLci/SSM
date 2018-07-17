package Org.Shopping.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter{
    private FilterConfig config;
    //初始化配置参数
    private static final String INIT_PARAM_ENCODE="encode";
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String encode = config.getInitParameter(INIT_PARAM_ENCODE);
        if(encode != null && !encode.isEmpty())
        {
            req.setCharacterEncoding(encode);

        }

        chain.doFilter(request, response);

        if(encode != null && !encode.isEmpty())
        {
            resp.setCharacterEncoding(encode);
        }
    }
    //初始化方法
    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}