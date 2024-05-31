package OperacionesFicheros.Objetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ClaseParaQueNoSalteException extends ObjectOutputStream{

	public ClaseParaQueNoSalteException(OutputStream out) throws IOException {
		super(out);
	}
	
	protected ClaseParaQueNoSalteException() throws IOException, SecurityException {
		super();
	}
	protected void writeStreamHeader() throws IOException{
		
	}
}
