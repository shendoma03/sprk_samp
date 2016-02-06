package comp.aw;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;

import java.io.IOException;

@WebServlet("/dd")
public class dd extends HttpServlet {
	TestClass tc;
	private static final long serialVersionUID = 1L;
	
    public dd() {
        super();
        tc = new TestClass();
        
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String cmd = request.getParameter("button");
		
		int cmd1 = Integer.parseInt(cmd);
		
		tc.abc(cmd1);
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>"+cmd1+"</h1></body></html>");
		
	}

}
