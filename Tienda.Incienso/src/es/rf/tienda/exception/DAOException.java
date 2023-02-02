package es.rf.tienda.exception;

public class DAOException extends Exception {
	DAOException(){}
	public DAOException(String msj) {
		super("DAO: " + msj);
	}
}
