import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class Calc extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String x_ = request.getParameter("x");
        String y_ = request.getParameter("y");
        //operator 값을 받아옴!
        String op = request.getParameter("operator");

        int x = 0;
        int y = 0;

        if(!x_.equals("")) x = Integer.parseInt(x_);
        if(!y_.equals("")) y = Integer.parseInt(y_);

        //초기화
        int result = 0;

        //operator 값이 덧셈이면 더하고 아니면 뺌
        if(op.equals("덧셈"))
            result = x+y;
        else
            result = x-y;

        response.getWriter().printf("result is %d\n", result);
    }
}
