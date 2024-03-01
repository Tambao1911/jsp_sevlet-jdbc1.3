package com.tambao.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tambao.model.UserModel;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 4494736402351977102L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModle = new UserModel();
		userModle.setFullName("Phạm Văn Tâm");
		
		request.setAttribute("model", userModle);
		
		//trả về  views
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
