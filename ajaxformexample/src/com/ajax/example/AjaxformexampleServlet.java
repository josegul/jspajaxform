package com.ajax.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AjaxformexampleServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		String fname= req.getParameter("firstname");
		String lname= req.getParameter("lastname");
		String email= req.getParameter("emailid");
		String password= req.getParameter("pwd");
		String Encrypted=UtilsSecure.encrypt(password);
		String Decrypted = UtilsSecure.decrypt(Encrypted);
		out.println("<br/><br/>First Name = "+fname+"<br/><br/>Last Name = "+lname+"<br/><br/>Email = "+email+"<br/><br/>Password Encrypted = "+Encrypted+"<br/><br/>Password Decrypted = "+Decrypted);
	}
}
