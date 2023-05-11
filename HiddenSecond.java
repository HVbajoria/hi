import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;    

public class HiddenSecond extends HttpServlet {  
	 public void doGet(HttpServletRequest request, HttpServletResponse response){  
 	  	try{    
  	 		response.setContentType("text/html");  
   			PrintWriter out = response.getWriter();  
   			
   			String n1=request.getParameter("Uname1");
   			String n2=request.getParameter("desg1");
   			String n3=request.getParameter("age");
   			String n4=request.getParameter("add");
   			out.println("Welcome to the team! "+n1+", You are a "+n2+" . Your age is "+n3+".<br>");
   			out.println("\n\nWe are glad to onboard you.\nYour address is "+n4);
   			
   			
 	  	}
 	  	catch(Exception e) {
 	  		System.out.println(e);
 	  	}
	 }
}
   			
   			