/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.cprg352.lab2.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Determines the age of a person on their next birthday.
 * @author Lisa Jowett
 */
public class AgeCalculatorServlet extends HttpServlet 
{
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String ageInput = request.getParameter("age");

        if (ageInput != null)
        {
            try 
                {
                    int age = Integer.parseInt(ageInput);

                    age++;

                    String message = String.format("You will be %d after your next birthday.", age);

                    request.setAttribute("message", message);
                }
            catch (Exception ex)
                {
                    request.setAttribute("message", "Please enter a number.");
                }
            }
        else
            {
                request.setAttribute("message", "Age input is missing. Please enter your age.");
            }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);    
    }
}
