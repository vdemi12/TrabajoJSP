<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.User"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    //Usuario de la base de datos
    String dbuser = "victor";
    //Contraseña de la base de datos
    String dbpassword = "12345";
    //Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajofinal", dbuser, dbpassword);
    AuthService auth = new AuthService(pool.getConnection());

    try {
        User user = auth.register(name, surname, username, password);
        response.sendRedirect("login.jsp");
    } catch (Exception e) {  
        out.print("Este usuario ya existe, por favor introduzca uno diferente");
    }
%>