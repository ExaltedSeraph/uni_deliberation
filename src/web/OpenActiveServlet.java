package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/listEtud","/ajouterEtud"})

public class OpenActiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OpenActiveServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getServletPath()!=null) {
			if(request.getServletPath().equals("/listEtud")){	 
				request.setAttribute("EtudOpen", "open");
				request.setAttribute("AllEtud", "active");
				this.getServletContext().getRequestDispatcher("/all_students.jsp").forward(request, response);
			}
			if(request.getServletPath().equals("/ajouterEtud")){	 
				request.setAttribute("EtudOpen", "open");
				request.setAttribute("AddEtud", "active");
				this.getServletContext().getRequestDispatcher("/add_student.jsp").forward(request, response);
			}


		}
	}
}


