package mx.edu.utng.asociaciones3;

import java.util.ArrayList;
import java.util.List;





public class tarjetaAnimada extends tarjeta{
	
	private List<imagen> imagens;
	private List<fondo> fondos;
	private List<dedicatoria> dedicatorias;
	

	public tarjetaAnimada(List<remitente> remitentes,
			List<destinatario> destinatarios, List<imagen> imagens, List<fondo> fondos) {
		
		super(remitentes, destinatarios);
		this.dedicatorias = new ArrayList<dedicatoria>();
		this.imagens = imagens;
		this.fondos = fondos;
		// TODO Auto-generated constructor stub
	}

	
}
