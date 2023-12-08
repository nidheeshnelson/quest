package DoPostMethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoPostMethod
 */
@WebServlet("/DoPostMethod")
public class DoPostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DoPostMethod() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		PrintWriter obj=response.getWriter();
	
		obj.print("<h1>"+name+"</h1>");
		obj.print("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Home</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"./css/bootstrap.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"evergreen.css\">\r\n" + 
				"</head>\r\n" + 
				"<body style=\"background-image: url(./Canvas\\ Prints\\ to\\ Match\\ Any\\ Home\\'s\\ Decor\\ _\\ Society6.jfif);\">\r\n" + 
				"    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n" + 
				"        <a class=\"navbar-brand\" href=\"./evergreen.html\">EverGreen</a>\r\n" + 
				"        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"          <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"        </button>\r\n" + 
				"      \r\n" + 
				"        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n" + 
				"          <ul class=\"navbar-nav mr-auto\">\r\n" + 
				"            <li class=\"nav-item active\">\r\n" + 
				"              <a class=\"nav-link\" href=\"./home.html\">Home <span class=\"sr-only\">(current)</span></a>\r\n" + 
				"            </li>\r\n" + 
				"            <li class=\"nav-item active\">\r\n" + 
				"                <a class=\"nav-link\" href=\"./signin.html\">Sign in <span class=\"sr-only\">(current)</span></a>\r\n" + 
				"              </li>\r\n" + 
				"              <li class=\"nav-item active\">\r\n" + 
				"                <a class=\"nav-link\" href=\"./signup.html\">Sign up <span class=\"sr-only\">(current)</span></a>\r\n" + 
				"              </li>\r\n" + 
				"            <li class=\"nav-item dropdown\">\r\n" + 
				"              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n" + 
				"                More\r\n" + 
				"              </a>\r\n" + 
				"              <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n" + 
				"                <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n" + 
				"                <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n" + 
				"                <div class=\"dropdown-divider\"></div>\r\n" + 
				"                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n" + 
				"              </div>\r\n" + 
				"            </li>\r\n" + 
				"            \r\n" + 
				"          </ul>\r\n" + 
				"          <form class=\"form-inline my-2 my-lg-0\">\r\n" + 
				"            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n" + 
				"            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n" + 
				"          </form>\r\n" + 
				"        </div>\r\n" + 
				"      </nav>\r\n" + 
				"\r\n" + 
				"      <div id=\"carouselExampleCaptions\" class=\"carousel slide\">\r\n" + 
				"        <div class=\"carousel-indicators\">\r\n" + 
				"          <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n" + 
				"          <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n" + 
				"          <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"carousel-inner\">\r\n" + 
				"          <div class=\"carousel-item active\">\r\n" + 
				"            <img src=\"./butterflies-1127666_1920.jpg\" class=\"d-block w-100\" alt=\"./butterflies-1127666_1920\">\r\n" + 
				"            <div class=\"carousel-caption d-none d-md-block\">\r\n" + 
				"              <h5>Butterflies</h5>\r\n" + 
				"              <p>Some representative placeholder content for the first slide.</p>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"          <div class=\"carousel-item\">\r\n" + 
				"            <img src=\"./flowers-276014_1920.jpg\" class=\"d-block w-100\" alt=\"./flowers-276014_1920\">\r\n" + 
				"            <div class=\"carousel-caption d-none d-md-block\">\r\n" + 
				"              <h5>flowers</h5>\r\n" + 
				"              <p>Some representative placeholder content for the second slide.</p>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"          <div class=\"carousel-item\">\r\n" + 
				"            <img src=\"./pexels-pixabay-326055.jpg\" class=\"d-block w-100\" alt=\"./pexels-pixabay-326055\">\r\n" + 
				"            <div class=\"carousel-caption d-none d-md-block\">\r\n" + 
				"              <h5>Pixels</h5>\r\n" + 
				"              <p>Some representative placeholder content for the third slide.</p>\r\n" + 
				"            </div>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"        <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n" + 
				"          <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n" + 
				"          <span class=\"visually-hidden\">Previous</span>\r\n" + 
				"        </button>\r\n" + 
				"        <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n" + 
				"          <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n" + 
				"          <span class=\"visually-hidden\">Next</span>\r\n" + 
				"        </button>\r\n" + 
				"      </div>\r\n" + 
				"\r\n" + 
				"      \r\n" + 
				"      <div class=\"container\">\r\n" + 
				"        <h1>Mission for Nature</h1>\r\n" + 
				"        <div>\r\n" + 
				"        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis unde distinctio sit labore qui maxime nostrum nulla beatae maiores repellendus totam earum, nam quasi, commodi dolor fuga deserunt quam repellat.\r\n" + 
				"        Dolorum nemo placeat beatae itaque nobis. Unde excepturi necessitatibus eaque iste animi sequi expedita iusto ipsam ipsum? Consequuntur consectetur, dolores provident veritatis praesentium sed tenetur nisi, officia nostrum enim quae.\r\n" + 
				"        Corrupti cumque, reiciendis consectetur repellendus eius sit labore laudantium pariatur sequi nulla quod ad dolore sapiente! Corporis distinctio dolores placeat quae aut. Voluptates, iste quis quasi fugiat maxime tempora impedit!\r\n" + 
				"        Voluptatum, reiciendis. Accusamus porro facere voluptate consectetur in quos possimus. Nemo laborum maiores veritatis voluptas. Explicabo commodi perferendis quos magnam tempora placeat similique. Nesciunt ab blanditiis, error accusantium obcaecati suscipit?\r\n" + 
				"        Explicabo deleniti adipisci iure distinctio doloribus, illo, dignissimos provident natus ipsum voluptatum quo id, laborum delectus inventore optio eum. Accusamus, et. Vero exercitationem illo optio quod qui unde reprehenderit voluptatem.\r\n" + 
				"        Odit, nisi voluptatibus animi voluptatum excepturi, inventore aperiam commodi quod numquam, mollitia quas hic ex odio quos illum ducimus nobis qui reprehenderit? Culpa, cupiditate repellendus! Placeat, atque. Culpa, neque quas.\r\n" + 
				"        Ut ullam dolore voluptate ipsam odit dicta ad quaerat, totam omnis eveniet voluptatibus soluta repellendus ex iste a, quae rerum repudiandae. Totam a et, neque optio tenetur architecto at distinctio?\r\n" + 
				"        Repellendus, reprehenderit quia. Illo labore, perspiciatis tenetur est necessitatibus quasi. Corporis perferendis odio placeat, et animi quos similique exercitationem dolorem, possimus fugit numquam facere ea blanditiis repellat dolorum ad harum.\r\n" + 
				"        Doloribus facilis asperiores quae doloremque eaque ipsam nobis officia veritatis dolor. Minima soluta harum eius rem porro cumque similique maxime sapiente, dignissimos omnis aliquam deserunt non voluptatum eum voluptate inventore.\r\n" + 
				"        Quisquam quas debitis doloremque fugit odit aliquid accusantium cumque! Excepturi a perspiciatis, deleniti iusto laborum ipsa culpa eum sapiente placeat perferendis nesciunt aut fugiat quaerat reprehenderit possimus enim ipsum recusandae!</p>\r\n" + 
				"      \r\n" + 
				"      </div></div>\r\n" + 
				"      \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n" + 
				"    <script src=\"./js/bootstrap.js\"></script>\r\n" + 
				"</body>\r\n" + 
				"</html>");
}
}
