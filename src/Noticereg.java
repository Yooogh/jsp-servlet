import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/notice-reg")
public class Noticereg extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //한글 출력을 위한 UTF-8 인코딩
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
//        1. textarea 정상 출력을 위해 필요
//        2. servlet filter에서 처리
//        request.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        //값을 넘겨 받음
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        //DB나 파일로 넣어서 처리 가능
        //여기선 바로 출력
        out.println(title);
        out.println(content);



    }
}
