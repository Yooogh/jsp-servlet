import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "add2", value = "/add2")
public class add2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //배열로 받음
        String[] num_ = request.getParameterValues("num");

        int result = 0;

        for (int i=0; i<num_.length; i++) {
            int num = Integer.parseInt(num_[i]);
            result += num;
        }

        response.getWriter().printf("result is %d\n", result);
    }
}
