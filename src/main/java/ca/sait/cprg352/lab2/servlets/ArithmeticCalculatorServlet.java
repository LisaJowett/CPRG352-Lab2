/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.cprg352.lab2.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lisaj
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet 
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
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String inputOne = request.getParameter("input1");
        String inputTwo = request.getParameter("input2");
        
        String operand = request.getParameter("button");

        if(inputOne != null && inputTwo != null)
            {
                try
                    {
                        if (operand.equals("+"))
                            {
                                int input1 = Integer.parseInt(inputOne);
                                int input2 = Integer.parseInt(inputTwo);
                                int result = input1 + input2;
                                request.setAttribute("message", "Result: " + result);
                            }

                        if (operand.equals("-"))
                            {
                                int input1 = Integer.parseInt(inputOne);
                                int input2 = Integer.parseInt(inputTwo);
                                int result = input1 - input2;
                                request.setAttribute("message", "Result: " + result);
                            }
                        if (operand.equals("*"))
                            {
                                int input1 = Integer.parseInt(inputOne);
                                int input2 = Integer.parseInt(inputTwo);
                                int result = input1 * input2;
                                request.setAttribute("message", "Result: " + result);
                            }
                        if (operand.equals("%"))
                            {
                                int input1 = Integer.parseInt(inputOne);
                                int input2 = Integer.parseInt(inputTwo);
                                int result = input1 % input2;
                                request.setAttribute("message", "Result: " + result);
                            }
                    }

                catch(Exception e)
                    {
                        request.setAttribute("message", "Result: Invalid");
                    }
            }

                else
                    {
                        request.setAttribute("message", "Result: Invalid");
                    } 
 
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
    }
}

 