/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-21 10:33:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Ideas_002dJsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connectionpool.ConnectionPool;
import users.User;
import users.Idea;
import java.util.ArrayList;
import users.UsersService;
import views.homeview;
import views.ideasview;

public final class ideas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <script src=\"assets/js/color-modes.js\"></script>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    <!-- Enlace a Bootstrap CSS -->\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/dashboard/\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@docsearch/css@3\">\n");
      out.write("\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("      .bd-placeholder-img {\n");
      out.write("        font-size: 1.125rem;\n");
      out.write("        text-anchor: middle;\n");
      out.write("        -webkit-user-select: none;\n");
      out.write("        -moz-user-select: none;\n");
      out.write("        user-select: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (min-width: 768px) {\n");
      out.write("        .bd-placeholder-img-lg {\n");
      out.write("          font-size: 3.5rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .b-example-divider {\n");
      out.write("        width: 100%;\n");
      out.write("        height: 3rem;\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\n");
      out.write("        border-width: 1px 0;\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .b-example-vr {\n");
      out.write("        flex-shrink: 0;\n");
      out.write("        width: 1.5rem;\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .bi {\n");
      out.write("        vertical-align: -.125em;\n");
      out.write("        fill: currentColor;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .nav-scroller {\n");
      out.write("        position: relative;\n");
      out.write("        z-index: 2;\n");
      out.write("        height: 2.75rem;\n");
      out.write("        overflow-y: hidden;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .nav-scroller .nav {\n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: nowrap;\n");
      out.write("        padding-bottom: 1rem;\n");
      out.write("        margin-top: -1px;\n");
      out.write("        overflow-x: auto;\n");
      out.write("        text-align: center;\n");
      out.write("        white-space: nowrap;\n");
      out.write("        -webkit-overflow-scrolling: touch;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .btn-bd-primary {\n");
      out.write("        --bd-violet-bg: #712cf9;\n");
      out.write("        --bd-violet-rgb: 112.520718, 44.062154, 249.437846;\n");
      out.write("\n");
      out.write("        --bs-btn-font-weight: 600;\n");
      out.write("        --bs-btn-color: var(--bs-white);\n");
      out.write("        --bs-btn-bg: var(--bd-violet-bg);\n");
      out.write("        --bs-btn-border-color: var(--bd-violet-bg);\n");
      out.write("        --bs-btn-hover-color: var(--bs-white);\n");
      out.write("        --bs-btn-hover-bg: #6528e0;\n");
      out.write("        --bs-btn-hover-border-color: #6528e0;\n");
      out.write("        --bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);\n");
      out.write("        --bs-btn-active-color: var(--bs-btn-hover-color);\n");
      out.write("        --bs-btn-active-bg: #5a23c8;\n");
      out.write("        --bs-btn-active-border-color: #5a23c8;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .bd-mode-toggle {\n");
      out.write("        z-index: 1500;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .bd-mode-toggle .dropdown-menu .active .bi {\n");
      out.write("        display: block !important;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = (User)session.getAttribute("user");
        ArrayList<Idea> ideas = null;
        if(user==null){
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0); // Proxies.
            response.sendRedirect("login.jsp");
        }
        else{
          //Usuario de la base de datos
          String dbuser = "victor";
          //Contraseña de la base de datos
          String dbpassword = "12345";
          //Pool de conexiones a la base de datos
          ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajofinal", dbuser, dbpassword);
          UsersService userSvc = new UsersService(pool.getConnection());
          ideas = userSvc.requestAllideas("Nombre ASC");
        }
        out.print(new homeview());
        if(user!=null) out.print(user.getUsername());
        out.print(new ideasview());
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");
 
                      if(ideas!=null){
                        for(int i = 0; i <ideas.size(); i++){
                            out.print(String.format(
                                    "<tr>"+
                                    "    <td>%s</td>"+
                                    "    <td>%s</td>"+
                                    "    <td>%s</td>"+
                                    "    <td>%s</td>"+
                                    "    <td><a href=\"modificaridea.jsp?nombre="+ideas.get(i).getNombre()+"&creador="+ideas.get(i).getCreador()+"&tipo="+ideas.get(i).getTipo()+"&importancia="+ideas.get(i).getImportancia()+"\" class=\"btn btn-secondary\">Editar</a> <a href=\"eliminaridea.jsp?nombre="+ideas.get(i).getNombre()+"\" class=\"btn btn-secondary\">Eliminar</a></td>"+
                                    "</tr>", ideas.get(i).getNombre(),
                                    ideas.get(i).getCreador(),
                                    ideas.get(i).getTipo(),
                                    ideas.get(i).getImportancia()));
                        }
                      }
                  
      out.write("\n");
      out.write("                  \n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-end\" >\n");
      out.write("              <a href=\"addidea.jsp\"> \n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\" >Añadir</button>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </main>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("          <!-- Bootstrap JavaScript y dependencias -->\n");
      out.write("          <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/chart.js@4.3.2/dist/chart.umd.js\" integrity=\"sha384-eI7PSr3L1XLISH8JdDII5YN/njoSsxfbrkCTnJrzXt+ENP5MOVBxD+l6sEG4zoLp\" crossorigin=\"anonymous\"></script><script src=\"dashboard.js\"></script></body>\n");
      out.write("           <script>\n");
      out.write("              window.addEventListener(\"pageshow\", function (event) {\n");
      out.write("                  if (event.persisted) {\n");
      out.write("                      window.location.reload();\n");
      out.write("                  }\n");
      out.write("              });\n");
      out.write("          </script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
