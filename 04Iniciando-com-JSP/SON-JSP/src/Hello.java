

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		
//		String name = request.getParameter("name");
//		String lastName = request.getParameter("lastname");
//		
//		out.println("Olá " + name + " "+ lastName);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		request.setAttribute("name","José Malcher JR");
		request.setAttribute("numbers", numbers);
		request.setAttribute("age", 18);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String body = request.getReader().lines().reduce("", (acc,actual)->acc+actual);
//		System.out.println(body);
		
//		JSONObject json = formatJson(request.getReader());
//		System.out.println(json.toString());
//		System.out.println(json.get("lastName"));
		
//		JSONObject json = new JSONObject();
//		int i = 10;
//		for(int a = 0 ; a < i; a++) {
//			json.put("count", a);
//		}
//		json.put("teste", 50);
//		
//		response.setContentType("application/json");
//		response.getWriter().write(json.toString());
	}
	
	private JSONObject formatJson(BufferedReader reader) {
		StringBuffer bs = new StringBuffer();
		String line = null;
		
		try {
			while((line = reader.readLine()) != null) {
				bs.append(line);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		JSONObject json = new JSONObject(bs.toString());
		return json;
	}

}
