package com.Leo.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Entity;

import com.Leo.DAO.ProductoDao;
import com.google.gson.Gson;
import com.leonardo.model.Productoss;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Productoss pr = new Productoss();
		ProductoDao prd = new ProductoDao();

		String id = null;
		String nombrepr = null;
		String preciopr = null;
		String cantidadpr = null;
		String totalpr = null;
		
		try {
			 id = request.getParameter("Id");
			 nombrepr = request.getParameter("Nproductos");
			 preciopr = request.getParameter("Pproductos");
			 cantidadpr = request.getParameter("Cproductos");
			 totalpr = request.getParameter("Tproductos");
			
			 pr.setId(Integer.parseInt(id));
				pr.setNombreProducto(nombrepr);
				pr.setPrecioProducto(Double.parseDouble(preciopr));
				pr.setCantidadProducto(Integer.parseInt(cantidadpr));
				pr.setTotalProducto(Double.parseDouble(totalpr));
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		String action = request.getParameter("btn");
		
		if(action.equals("Guardar")){
			pr.setId(Integer.parseInt(id));
			pr.setNombreProducto(nombrepr);
			pr.setPrecioProducto(Double.parseDouble(preciopr));
			pr.setCantidadProducto(Integer.parseInt(cantidadpr));
			pr.setTotalProducto(Double.parseDouble(totalpr));
			
			prd.agregarDatos(pr);
			
		
		
		}else if(action.equals("Actualizar")){
		
			pr.setId(Integer.parseInt(id));
			pr.setNombreProducto(nombrepr);
			pr.setPrecioProducto(Double.parseDouble(preciopr));
			pr.setCantidadProducto(Integer.parseInt(cantidadpr));
			pr.setTotalProducto(Double.parseDouble(totalpr));
			
			prd.actualizarDatos(pr);
		}else if(action.equals("Eliminar")) {
	         pr.setId(Integer.parseInt(id));
prd.eliminarDatos(pr);

	}
		
			response.sendRedirect("index.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		ProductoDao prdao = new ProductoDao();
		
		Gson json = new Gson();		
				
		try {
			
			response.getWriter().append(json.toJson(prdao.productoLista()));
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
		
		
	}

}
