package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//web.xml에서 설정하지 않고 어노테이션으로 매핑 완
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest
                        , ServletResponse servletResponse
                        , FilterChain filterChain)
                        throws IOException, ServletException {
        System.out.println("before filter");
        servletRequest.setCharacterEncoding("UTF-8");
//        다음 필터, 서블릿 실행 전 실행할 작업
        filterChain.doFilter(servletRequest, servletResponse);
//        다음 필터, 서블릿 실행 후 실행할 작업
        System.out.println("after filter");
    }

    @Override
    public void destroy() {

    }
}
