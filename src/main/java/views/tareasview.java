package views;

public class tareasview {
    public tareasview(){

    }
    
    @Override
    public String toString() {
        return "</li>"+
        "</ul>"+
        "<ul class=\"navbar-nav flex-row d-md-none\">"+
          "<li class=\"nav-item text-nowrap\">"+
            "<button class=\"nav-link px-3 text-white\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#sidebarMenu\" aria-controls=\"sidebarMenu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">"+
              "<svg class=\"bi\"><use xlink:href=\"#list\"/></svg>"+
            "</button>"+
         " </li>"+
        "</ul>"+
      "</header>"+
      
      "<div class=\"container-fluid\">"+
        "<div class=\"row\">"+
          "<div class=\"sidebar border border-right col-md-3 col-lg-2 p-0 bg-body-tertiary\">"+
            "<div class=\"offcanvas-md offcanvas-end bg-body-tertiary\" tabindex=\"-1\" id=\"sidebarMenu\" aria-labelledby=\"sidebarMenuLabel\">"+
              "<div class=\"offcanvas-header\">"+
                "<h5 class=\"offcanvas-title\" id=\"sidebarMenuLabel\">Company name</h5>"+
                "<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" data-bs-target=\"#sidebarMenu\" aria-label=\"Close\"></button>"+
              "</div>"+
              "<div class=\"offcanvas-body d-md-flex flex-column p-0 pt-lg-3 overflow-y-auto\">"+
                "<ul class=\"nav flex-column\">"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2 active\" aria-current=\"page\" href=\"home.jsp\">"+
                      "<svg class=\"bi\"><use xlink:href=\"#house-fill\"/></svg>"+
                      "Inicio"+
                    "</a>"+
                  "</li>"+
                "</ul>"+
                "<hr class=\"my-3\">"+
                "<ul class=\"nav flex-column mb-auto\">"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2\" href=\"profile.jsp\">"+
                    "<i class=\"bi bi-person-circle\"></i>"+
                      "Mi perfil"+
                    "</a>"+
                  "</li>"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2\" href=\"ideas.jsp\">"+
                    "<i class=\"bi bi-lightbulb\"></i>"+
                      "Ideas"+
                    "</a>"+
                  "</li>"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2\" href=\"tareas.jsp\">"+
                    "<i class=\"bi bi-clipboard2-check\"></i>"+
                      "Tareas"+
                    "</a>"+
                  "</li>"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2\" href=\"proyectos.jsp\">"+
                    "<i class=\"bi bi-terminal\"></i>"+
                      "Proyectos"+
                    "</a>"+
                  "</li>"+
                  "<li class=\"nav-item\">"+
                    "<a class=\"nav-link d-flex align-items-center gap-2\" href=\"logout.jsp\">"+
                      "<svg class=\"bi\"><use xlink:href=\"#door-closed\"/></svg>"+
                      "Cerrar sesión"+
                    "</a>"+
                  "</li>"+
                "</ul>"+
              "</div>"+
            "</div>"+
          "</div>"+
      
          "<main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">"+
            "<div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">"+
              "<h1 class=\"h2\">Tareas</h1>"+
            "</div>"+
      
          
      
            "<h2>Listado de tareas</h2>"+
            "<div class=\"table-responsive small\">"+
              "<table class=\"table table-striped table-sm\">"+
                "<thead>"+
                  "<tr>"+
                    "<th scope=\"col\">Nombre</th>"+
                    "<th scope=\"col\">Usuario</th>"+
                    "<th scope=\"col\">Proceso</th>"+
                    "<th scope=\"col\">Importancia</th>"+
                    "<th scope=\"col\">Modificaciones</th>"+
                  "</tr>"+
                "</thead>"+
                "<tbody>";
    }
}
