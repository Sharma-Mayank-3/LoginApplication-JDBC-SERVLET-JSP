package com.login.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.LoginDao;
import com.login.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	LoginDao loginDao;
	
	public void init() {
		loginDao = new LoginDao();
	}
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pass = request.getParameter("password");
		
		try {
			Employee emp = loginDao.validate(user, pass);
			
			if(emp != null) {
				request.setAttribute("employee", emp);
				request.getRequestDispatcher("view/Login-Success.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("view/Login-Fail.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
