package users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import crud.CRUD;

public class UsersService implements CRUD<User, Idea, Tarea, Proyecto>{

    Connection conn;
    public UsersService(Connection conn){
        this.conn = conn;
    }
    @Override
    public ArrayList<User> query(String column, String value) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'query'");
    }

    @Override
    public ArrayList<User> query(String column, long value) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'query'");
    }

    private ArrayList<User> _requestAll(String sql) throws SQLException{
        //Creamos el array que vamos a devolver
        ArrayList<User> result = new ArrayList<User>();
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();   

        // Ejectuamos la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorremos cada uno de los registro devueltos por la consulta
        while(querySet.next()) {
            //Obtenemos los datos del Individuo
            int id = querySet.getInt("id");
            String name = querySet.getString("name");
            String surname = querySet.getString("surname");
            String username = querySet.getString("username");
            result.add(new User(id, name, surname, username));
        } 
        //Cerramos la consulta
        statement.close();

        //Devolvemos el array de individuoes
        return result;
    }

    private ArrayList<Idea> _requestAllideas(String sql) throws SQLException{
        //Creamos el array que vamos a devolver
        ArrayList<Idea> result = new ArrayList<Idea>();
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();   

        // Ejectuamos la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorremos cada uno de los registro devueltos por la consulta
        while(querySet.next()) {
            //Obtenemos los datos del Individuo
            String nombre = querySet.getString("Nombre");
            String creador = querySet.getString("Creador");
            String tipo = querySet.getString("Tipo");
            String importancia = querySet.getString("Importancia");
            result.add(new Idea(nombre, creador, tipo, importancia));
        } 
        //Cerramos la consulta
        statement.close();

        //Devolvemos el array de individuoes
        return result;
    }

    private ArrayList<Tarea> _requestAlltareas(String sql) throws SQLException{
        //Creamos el array que vamos a devolver
        ArrayList<Tarea> result = new ArrayList<Tarea>();
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();   

        // Ejectuamos la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorremos cada uno de los registro devueltos por la consulta
        while(querySet.next()) {
            //Obtenemos los datos del Individuo
            String nombre = querySet.getString("Nombre");
            String usuario = querySet.getString("Usuario");
            String proceso = querySet.getString("Proceso");
            String importancia = querySet.getString("Importancia");
            result.add(new Tarea(nombre, usuario, proceso, importancia));
        } 
        //Cerramos la consulta
        statement.close();

        //Devolvemos el array de individuoes
        return result;
    }

    private ArrayList<Proyecto> _requestAllproyectos(String sql) throws SQLException{
        //Creamos el array que vamos a devolver
        ArrayList<Proyecto> result = new ArrayList<Proyecto>();
        //Construimos la consulta a realizar
        Statement statement = this.conn.createStatement();   

        // Ejectuamos la consulta
        ResultSet querySet = statement.executeQuery(sql);
        // Recorremos cada uno de los registro devueltos por la consulta
        while(querySet.next()) {
            //Obtenemos los datos del Individuo
            String nombre = querySet.getString("Nombre");
            int participantes = querySet.getInt("NºParticipantes");
            String proceso = querySet.getString("Proceso");
            String importancia = querySet.getString("Importancia");
            result.add(new Proyecto(nombre, participantes, proceso, importancia));
        } 
        //Cerramos la consulta
        statement.close();

        //Devolvemos el array de individuoes
        return result;
    }

    @Override
    public ArrayList<User> requestAll(String tabla, String sortedBy) throws SQLException{
        String sql = String.format("SELECT id, name, surname, username FROM %s",tabla +(sortedBy.length()>0?(" ORDER BY "+sortedBy):""));
        return this._requestAll(sql);
    }

    @Override
    public ArrayList<Idea> requestAllideas(String sortedBy) throws SQLException{
        String sql = String.format("SELECT Nombre, Creador, Tipo, Importancia FROM ideas" +(sortedBy.length()>0?(" ORDER BY "+sortedBy):""));
        return this._requestAllideas(sql);
    }

    @Override
    public ArrayList<Tarea> requestAlltareas(String sortedBy) throws SQLException{
        String sql = String.format("SELECT Nombre, Usuario, Proceso, Importancia FROM tareas" +(sortedBy.length()>0?(" ORDER BY "+sortedBy):""));
        return this._requestAlltareas(sql);
    }

    @Override
    public ArrayList<Proyecto> requestAllproyectos(String sortedBy) throws SQLException{
        String sql = String.format("SELECT Nombre, NºParticipantes, Proceso, Importancia FROM proyectos" +(sortedBy.length()>0?(" ORDER BY "+sortedBy):""));
        return this._requestAllproyectos(sql);
    }

    @Override
    public User requestById( long id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestById'");
    }

    @Override
    public long createidea(Idea model) throws SQLException {
            String Nombre = model.getNombre();
            String Creador = model.getCreador();
            String Tipo = model.getTipo();
            String Importancia = model.getImportancia();

            Statement statement = this.conn.createStatement(); 

            String sql = String.format("INSERT INTO ideas(Nombre, Creador, Tipo, Importancia) VALUES ('%s','%s','%s','%s')", Nombre, Creador, Tipo, Importancia);
            // Ejecución de la consulta
            int affectedRows = statement.executeUpdate(sql);
            //Cerramos la consulta
            statement.close();
            
            if (affectedRows == 0)
                throw new SQLException("Creating idea failed, no rows affected.");
            else
                return affectedRows;
    }
    @Override
    public long createtarea(Tarea model) throws SQLException {
            String Nombre = model.getNombre();
            String Usuario = model.getUsuario();
            String Proceso = model.getProceso();
            String Importancia = model.getImportancia();

            Statement statement = this.conn.createStatement(); 

            String sql = String.format("INSERT INTO tareas(Nombre, Usuario, Proceso, Importancia) VALUES ('%s','%s','%s','%s')", Nombre, Usuario, Proceso, Importancia);
            // Ejecución de la consulta
            int affectedRows = statement.executeUpdate(sql);
            //Cerramos la consulta
            statement.close();
            
            if (affectedRows == 0)
                throw new SQLException("Creating tarea failed, no rows affected.");
            else
                return affectedRows;
    }
    @Override
    public long createproyecto(Proyecto model) throws SQLException {
            String Nombre = model.getNombre();
            Integer Participantes = model.getParticipantes();
            String Proceso = model.getProceso();
            String Importancia = model.getImportancia();

            Statement statement = this.conn.createStatement(); 

            String sql = String.format("INSERT INTO proyectos(Nombre, NºParticipantes, Proceso, Importancia) VALUES ('%s','%d','%s','%s')", Nombre, Participantes, Proceso, Importancia);
            // Ejecución de la consulta
            int affectedRows = statement.executeUpdate(sql);
            //Cerramos la consulta
            statement.close();
            
            if (affectedRows == 0)
                throw new SQLException("Creating proyecto failed, no rows affected.");
            else
                return affectedRows;
    }

    @Override
    public int update(User object) throws SQLException {
        //Obtenemos los datos del individuo para actualizar
        //en la base de datos
        long id = object.getId();
        String name = object.getName();
        String surname = object.getSurname();
        String username = object.getUsername();
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("UPDATE users SET name = '%s', surname = '%s', username = '%s' WHERE id='%d'", name, surname, username, id);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }

    @Override
    public int updateidea(Idea object) throws SQLException {
        //Obtenemos los datos del individuo para actualizar
        //en la base de datos
        String nombre = object.getNombre();
        String creador = object.getCreador();
        String tipo = object.getTipo();
        String importancia = object.getImportancia();
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("UPDATE ideas SET  Creador = '%s', Tipo = '%s', Importancia = '%s' WHERE Nombre = '%s'", creador, tipo, importancia, nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Creating idea failed, no rows affected.");
        else
            return affectedRows;
    }

    @Override
    public int updatetarea(Tarea object) throws SQLException {
        //Obtenemos los datos del individuo para actualizar
        //en la base de datos
        String nombre = object.getNombre();
        String usuario = object.getUsuario();
        String proceso = object.getProceso();
        String importancia = object.getImportancia();
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("UPDATE tareas SET Usuario = '%s', Proceso = '%s', Importancia = '%s' WHERE Nombre = '%s'", usuario, proceso, importancia, nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Creating tarea failed, no rows affected.");
        else
            return affectedRows;
    }

    @Override
    public int updateproyecto(Proyecto object) throws SQLException {
        //Obtenemos los datos del individuo para actualizar
        //en la base de datos
        String nombre = object.getNombre();
        Integer participantes = object.getParticipantes();
        String proceso = object.getProceso();
        String importancia = object.getImportancia();
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("UPDATE proyectos SET NºParticipantes = '%d', Proceso = '%s', Importancia = '%s' WHERE Nombre = '%s'", participantes, proceso, importancia, nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Creating proyecto failed, no rows affected.");
        else
            return affectedRows;
    }

    @Override
    public boolean deleteidea(String nombre) throws SQLException {
        
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("DELETE FROM ideas WHERE nombre = '%s'", nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Deleting idea failed, no rows affected.");
        else
            return true;
    }

    @Override
    public boolean deletetarea(String nombre) throws SQLException {
        
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("DELETE FROM tareas WHERE nombre = '%s'", nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Deleting tarea failed, no rows affected.");
        else
            return true;
    }

    @Override
    public boolean deleteproyecto(String nombre) throws SQLException {
        
        //Creamos la consulta
        Statement statement = this.conn.createStatement(); 

        String sql = String.format("DELETE FROM proyectos WHERE nombre = '%s'", nombre);
        // Ejecución de la consulta
        int affectedRows = statement.executeUpdate(sql);
        //Cerramos la consulta
        statement.close();
        //Devolvemos excepción si ha habido un error
        //o si no se ha actualizado ningún registro
        //y en caso contrario devolvemos el número de
        //registros que se han actualizado
        if (affectedRows == 0)
            throw new SQLException("Deleting proyecto failed, no rows affected.");
        else
            return true;
    }

    
    
}
