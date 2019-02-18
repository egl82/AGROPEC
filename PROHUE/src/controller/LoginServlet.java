package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.InicioSesionDAO;
import modelo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("nombre");
        String pass = request.getParameter("password");
        
        
        Usuario usu = new Usuario();
        usu.setNombre(uname);
        usu.setPassword(pass);
        
        
        InicioSesionDAO inicioSesionDAO = new InicioSesionDAO();

        try {
            String autenticar = inicioSesionDAO.autenticar(usu);

            if (autenticar.equals("Admin_Rol")) {
                System.out.println("Accediendo a la página de Administrador");
                HttpSession session = request.getSession();
                session.setAttribute("admin", uname);
                request.setAttribute("uname", uname);
                 request.getRequestDispatcher("jsp/VistaAdmin.jsp").forward(request, response);
//                response.sendRedirect("jsp/VistaAdmin.jsp");

            } else if (autenticar.equals("Usuario_Rol")) {
                System.out.println("Accediendo Pagina de usuario");
                HttpSession session = request.getSession();
                session.setAttribute("usuario", uname);
                request.setAttribute("nombre", uname);
                request.getRequestDispatcher("jsp/VistaUsuario.jsp").forward(request, response);
//                response.sendRedirect("jsp/VistaUsuario.jsp");
            } else {
                response.sendRedirect("jsp/error.jsp");
            }

       
        } catch (Exception ex) {
        	System.out.println("ERROR SERVLET "+ ex);
        	
        }

}
    
    
    
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

}
