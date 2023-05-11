import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;    

public class HiddenFirst extends HttpServlet {  
	 public void doGet(HttpServletRequest request, HttpServletResponse response){  
 	  	try{    
  	 		response.setContentType("text/html");  
   			PrintWriter out = response.getWriter();  
   			
   			String n1=request.getParameter("Uname");
   			String n2=request.getParameter("desg");
   			out.print("Welcome "+n1+"!");
   			
   			out.print("<form action='hidden2'>");
   			out.println("Age: <input type='text' name='age'><br><br>");
   			out.println("Address: <input type='text' name='add'><br><br>");
   			out.println("<input type='hidden' name='Uname1' value='"+n1+"'>");
   			out.println("<input type='hidden' name='desg1' value='"+n2+"'>");
   			out.println("<input type='submit' value='Go'>");
   			out.print("</form>");
   			out.close();
   			
 	  	}
 	  	catch(Exception e) {
 	  		System.out.println(e);
 	  	}
	 }
}
   			
   			