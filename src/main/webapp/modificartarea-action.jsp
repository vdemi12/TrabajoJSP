<%-- index.jsp (proyecto Incrementa5) --%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.UsersService"%>
<%@page import="users.User"%>
<%@page import="users.Idea"%>
<%@page import="users.Tarea"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Enlace a Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //Usuario de la base de datos
        String dbuser = "victor";
        //Contraseña de la base de datos
        String dbpassword = "12345";
        //Pool de conexiones a la base de datos
        ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajofinal", dbuser, dbpassword);
        UsersService tareas = new UsersService(pool.getConnection());
        String nombre = request.getParameter("nombre");
        String usuario = request.getParameter("usuario");
        String proceso = request.getParameter("proceso");
        String importancia = request.getParameter("importancia");
        Tarea newTareaData = new Tarea(nombre, usuario, proceso, importancia);
        if(tareas.updatetarea(newTareaData)==1){
            response.sendRedirect("tareas.jsp");
        }
        else{
            response.sendRedirect("tareas.jsp?error=No ha sido posible editar la inforamción");
        }


    %>

    <!-- Bootstrap JavaScript y dependencias -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>