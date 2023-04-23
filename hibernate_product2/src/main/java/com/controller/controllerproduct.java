package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.productdao;
import com.product.*;
/**
 * Servlet implementation class controllerproduct
 */
@WebServlet("/register")
public class controllerproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private productdao productDao;
       
       public void init() {
    	   productDao=new productdao();
       }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String name = request.getParameter("uname");
        String price = request.getParameter("uprice");
        String country = request.getParameter("ucountry");
        String aboutit = request.getParameter("uabout");
        
       
        
        product user = new product();
        user.setName(name);
        user.setPrice(price);
        user.setCountry(country);
        user.setAboutit(aboutit);

        productDao.saveUser(user);

      
	
	}
	}


