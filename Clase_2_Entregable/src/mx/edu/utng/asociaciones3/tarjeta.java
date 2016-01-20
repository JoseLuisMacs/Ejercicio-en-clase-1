package mx.edu.utng.asociaciones3;

import java.util.List;



public class tarjeta {
	private String tipo;
	
	private int nroDestinatario;
	private List<remitente> remitentes;
	private List<destinatario> destinatarios;
	dedicatoria []dedicatorias = new dedicatoria[1];
	
	public tarjeta( List<remitente> remitentes, List<destinatario> destinatarios){
		this.remitentes = remitentes;
		this.destinatarios = destinatarios;
	
		// TODO Auto-generated constructor stub
	}
	
	
	public void adicionarRemitente (remitente remitente){
		
	}
	
public void adicionarDestinatario (destinatario destinatario){
		
	}

/**
 * @return the tipo
 */
public String getTipo() {
	return tipo;
}

/**
 * @param tipo the tipo to set
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}

/**

/**
 * @return the infoDestinatario
 */
public int getNroDestinatario() {
	return nroDestinatario;
}
/**
 * @param infoDestinatario the infoDestinatario to set
 */
public void setNroDestinatario(int nroDestinatario) {
	this.nroDestinatario = nroDestinatario;
}
	
}
