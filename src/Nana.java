import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet("/hi")
public class Nana extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //한글 출력을 위한 UTF-8 인코딩
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //1.
        //printStream
//        OutputStream os = response.getOutputStream();
//        PrintStream out = new PrintStream(os,true);
//        out.println("Hello Servlet!");

        //2.
        //printWriter : 다국어 문자 출력은 writer 계열(다국어 코드 가능) 사용!
//        PrintWriter out2 = response.getWriter();
//        out2.println("얄루");

        //3.
        //기본값 사용하기
        PrintWriter out = response.getWriter();
        //임시변수
        String cnt_ = request.getParameter("cnt");

        //기본값
        int cnt = 100;
        //null값 및 빈문자열 처리
        if(cnt_ != null && !cnt_.equals(""))
            cnt = Integer.parseInt(cnt_);

        for (int i=0; i<cnt; i++)
            out.println((i+1) + " :안녕 servlet~ <br>");

        //4. 사용자 입력

    }
}
