package crud;

import java.sql.SQLException;
import java.util.ArrayList;

/** CRUD
 * Interfaz que contiene los métodos necesarios para
 * obtener y modificar información de Jugadores en la base de datos
 */
public interface CRUD<T,P,S,L> {

    /** query
     * Realiza una consulta filtrando por la columna cuyo valor coincida con el
     * suministrado
     * @param column Columna por la que filtrar
     * @param value Valor de la columna para filtrar
     * @return Devuelve una lista con los registros encontrados
     * @throws SQLException
     */
    public ArrayList<T> query( String column, String value) throws SQLException;

    /** query
     * Realiza una consulta filtrando por la columna cuyo valor coincida con el
     * suministrado
     * @param column Columna por la que filtrar
     * @param value Valor de la columna para filtrar
     * @return Devuelve una lista con los registros encontrados
     * @throws SQLException
     */
    public ArrayList<T> query( String column, long value) throws SQLException;

    /** requestAll
     * Obtiene todos los registros de un modelo de la 
     * base de datos
     * @param sortedBy columna por la que se ordenará la consulta
     * @param direction dirección de ordenación (ASC, DESC)
     * @return una lista con los registros encontrados
     * @throws SQLException
     */
    public ArrayList<T> requestAll(String tabla, String sortedBy) throws SQLException;
    public ArrayList<P> requestAllideas(String sortedBy) throws SQLException;
    public ArrayList<S> requestAlltareas(String sortedBy) throws SQLException;
    public ArrayList<L> requestAllproyectos(String sortedBy) throws SQLException;

    /** requestById
     * Obtiene un registro del modelo dado su clave primaria
     * @param id
     * @return
     * @throws SQLException
     */
    public T requestById(long id) throws SQLException;

    /** Create
     * Crear un registro en la base de datos para el modelo en cuestión
     * @param model
     * @return
     * @throws SQLException
     */
    public long createidea( P model) throws SQLException;
    public long createtarea( S model) throws SQLException;
    public long createproyecto( L model) throws SQLException;

    /** update
     * Actualiza la información de un registro de la base de datos
     * para el modelo en cuestión
     * @param object
     * @return
     * @throws SQLException
     */
    public int update(T object) throws SQLException;
    public int updateidea(P object) throws SQLException;
    public int updatetarea(S object) throws SQLException;
    public int updateproyecto(L object) throws SQLException;

    /** delete
     * Elimina un registro del modelo dado su nombre
     * @param id
     * @return
     * @throws SQLException
     */
    public boolean deleteidea(String nombre) throws SQLException;
    public boolean deletetarea(String nombre) throws SQLException;
    public boolean deleteproyecto(String nombre) throws SQLException;
}
