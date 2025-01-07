/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.proyectoaa2.ev02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Usuario;

/**
 *
 * @author xabid
 */
@WebServlet(name = "SVbeneficiarios", urlPatterns = {"/SVbeneficiarios"})
public class SVbeneficiarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SVbeneficiarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SVbeneficiarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
            throws ServletException, IOException {
        
        list<Usuarios> listaUsuario = new Arraylist<>();
        listaUsuarios.add(new Usuario("123","Daniel","Pedreros","444444"));
        listaUsuarios.add(new Usuario("456","Carlos","Pedreros","777777"));
        listaUsuarios.add(new Usuario("566","Danilo","Pedreros","2145455"));
        
         HttpSession misesion = request.getSession();
         misesion.setAttribute("ListaUsuarios", listaUsuarios);
        
         response.sendRedirect("mostrarUsuarios.jsp");
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
            throws ServletException, IOException {
         
        
         String dni = request.getParameter("dni");
         String nombre = request.getParameter("nombre");
         String apellido = request.getParameter("apellido");
         String telefono = request.getParameter("telefono");

         System.out.println("Dni es: " + dni);
         System.out.println("Nombre es: " + nombre);
         System.out.println("Apellido es: " + apellido);
         System.out.println("Telefono es: " + telefono);
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
