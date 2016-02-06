package comp.aw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ces")
public class ces extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TestClass tc;
    public ces() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String frm = "<html><body><form NAME='form1' METHOD='GET' > <br> ";
		frm += "send rederection demo <br>";
		frm += "<input type = submit name = light value= '0'>Off</input><br>";
		frm += "<input type = submit name = light value ='1'>On</input>";
		frm += "</form>";
		out.println(frm);
		
		String cmd = request.getParameter("light");
		if (cmd == null ) return;
		int cmd1 = Integer.parseInt(cmd);
		response.getWriter().println(cmd1);
		tc = new TestClass();
		tc.abc(cmd1);
		
	out.println("</body></html>");

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
