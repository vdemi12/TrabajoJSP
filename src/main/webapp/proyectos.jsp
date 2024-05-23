<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.User"%>
<%@page import="users.Idea"%>
<%@page import="users.Proyecto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="users.UsersService"%>
<%@page import="views.homeview"%>
<%@page import="views.proyectosview"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <script src="assets/js/color-modes.js"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Enlace a Bootstrap CSS -->
    <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/dashboard/">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">

    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <style>
    body{
        background: url("./assets/img/imagen3.jpg") no-repeat center top;
        background-size: cover;
      }
      header{
        background: url("./assets/img/imagen3.jpg") no-repeat center top;
        background-size: cover;
      }
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        width: 100%;
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }

      .btn-bd-primary {
        --bd-violet-bg: #712cf9;
        --bd-violet-rgb: 112.520718, 44.062154, 249.437846;

        --bs-btn-font-weight: 600;
        --bs-btn-color: var(--bs-white);
        --bs-btn-bg: var(--bd-violet-bg);
        --bs-btn-border-color: var(--bd-violet-bg);
        --bs-btn-hover-color: var(--bs-white);
        --bs-btn-hover-bg: #6528e0;
        --bs-btn-hover-border-color: #6528e0;
        --bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);
        --bs-btn-active-color: var(--bs-btn-hover-color);
        --bs-btn-active-bg: #5a23c8;
        --bs-btn-active-border-color: #5a23c8;
      }

      .bd-mode-toggle {
        z-index: 1500;
      }

      .bd-mode-toggle .dropdown-menu .active .bi {
        display: block !important;
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="assets/css/dashboard.css" rel="stylesheet">
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        User user = (User)session.getAttribute("user");
        ArrayList<Proyecto> proyectos = null;
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
          proyectos = userSvc.requestAllproyectos("Nombre ASC");
        }
        out.print(new homeview());
        if(user!=null) out.print(user.getUsername());
        out.print(new proyectosview());
    %>
    
    <% 
                      if (proyectos != null) {
                          for (int i = 0; i < proyectos.size(); i++) {
                              out.print(String.format(
                                      "<tr>" +
                                      "    <td>%s</td>" +
                                      "    <td>%d</td>" +
                                      "    <td>%s</td>" +
                                      "    <td>%s</td>" +
                                      "    <td><a href=\"modificarproyecto.jsp?nombre=" + proyectos.get(i).getNombre() + "&participantes=" + proyectos.get(i).getParticipantes() + "&proceso=" + proyectos.get(i).getProceso() + "&importancia=" + proyectos.get(i).getImportancia() + "\" class=\"btn btn-secondary\">Editar</a> <a href=\"#\" onclick=\"confirmarEliminacionProyecto('" + proyectos.get(i).getNombre() + "')\" class=\"btn btn-secondary\">Eliminar</a></td>" +
                                      "</tr>", proyectos.get(i).getNombre(),
                                      proyectos.get(i).getParticipantes(),
                                      proyectos.get(i).getProceso(),
                                      proyectos.get(i).getImportancia()));
                          }
                      }

                  %>
                  
                </tbody>
              </table>
            </div>
            <div class="text-end" >
              <a href="addproyecto.jsp"> 
                <button class="btn btn-primary" type="submit" >Añadir</button>
              </a>
            </div>
          </main>
        </div>
      </div>
          <!-- Bootstrap JavaScript y dependencias -->
          <script src="assets/js/bootstrap.bundle.min.js"></script>
          <script src="https://cdn.jsdelivr.net/npm/chart.js@4.3.2/dist/chart.umd.js" integrity="sha384-eI7PSr3L1XLISH8JdDII5YN/njoSsxfbrkCTnJrzXt+ENP5MOVBxD+l6sEG4zoLp" crossorigin="anonymous"></script><script src="dashboard.js"></script></body>
           <script type="text/javascript">
              function confirmarEliminacionProyecto(nombre) {
                  if (confirm("¿Estás seguro de que deseas eliminar este proyecto?")) {
                      window.location.href = "eliminarproyecto.jsp?nombre=" + nombre;
                  }
              }
          </script>
           <script>
              window.addEventListener("pageshow", function (event) {
                  if (event.persisted) {
                      window.location.reload();
                  }
              });
          </script>
    
</body>
</html>