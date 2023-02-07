package ficheros.dao;

import java.util.List;
import ficheros.modelos.Employees;
public interface IEmployeesDao {

		public Employees leerUno(String mployees_id);
		public List<Employees> leerTodos();
		public int actializar(Employees employees);
		public int delete(Employees employees);
		public int delete(String employees_id);
		public Employees insert(Employees employees);//para generar id
}
