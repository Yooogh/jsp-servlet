import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "add", value = "/add")
public class add extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//
//        PrintWriter out = response.getWriter();
//
//        int x = Integer.parseInt(request.getParameter("x"));
//        int y = Integer.parseInt(request.getParameter("y"));
//
//        int result = x + y;
//        out.println(result);

//        문제풀이
        String x_ = request.getParameter("x");
        String y_ = request.getParameter("y");

        int x = 0;
        int y = 0;
        if(!x_.equals(""))
            x = Integer.parseInt(x_);
        if(!y_.equals(""))
            y = Integer.parseInt(y_);

        int result = x + y;

        response.getWriter().printf("result is %d\n", result);
    }
}
