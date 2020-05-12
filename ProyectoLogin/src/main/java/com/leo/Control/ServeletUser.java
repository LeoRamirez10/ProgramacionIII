package com.leo.Control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leo.DAO.HistorialDao;
import com.leo.DAO.UsuarioDao;
import com.leo.model.TbHistorial;
import com.leo.model.TbUsuariop;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String usu = request.getParameter("Usuario");
		String contra = request.getParameter("Contra");
		String cerrarSesion = request.getParameter("btnCerrar");
		
		if (cerrarSesion!=null) {
			
			if(cerrarSesion.equals("CERRAR")) {
		HttpSession cerrarSessiones = (HttpSession) request.getSession();		
		cerrarSessiones.invalidate();  
		
			response.sendRedirect("index.jsp");
			}
			
			
		}else {
		
		
		TbUsuariop usuario =  new TbUsuariop();
		UsuarioDao usuDao = new UsuarioDao();
		
		usuario.setUsuario(usu);
		usuario.setContrasenia(contra);
		
	int verificarusuario = usuDao.ingresoUsuario(usuario).size();
		
	if (verificarusuario==1) {
		TbHistorial histo = new TbHistorial();
		HistorialDao histodao = new HistorialDao();
		Date fecha = new Date();
		
		histo.setFecha(fecha);
		usuario.setIdUsuarios(usuario.getIdUsuarios());
		histo.setTbUsuariop(usuario);
		histodao.agregarDatosHistorial(histo);
		
		
		
		HttpSession seccion = request.getSession(true);
		seccion.setAttribute("Usuario", usu);
		
		response.sendRedirect("Principal.jsp");
		
	}else {
		
		System.out.println("Error");
	}
		}
	//response.sendRedirect("index.jsp");
	
	}

}
