package topicos.ivan;

public class topicos {

	public int puntoFramePleno(int i, int j, int k) {
		
		return i+j+k;
	}

	public int mostrarPrimerTiro(int primerTiro) {
		
		return primerTiro;
	}

	public int puntajePrimerYSegundoTiro(int primerTiro, int segundoTiro) {
		
		return primerTiro+segundoTiro;
	}
	
	public boolean reconocerFrame() {
		int frame []= {10,9,8};
		boolean resultado=false;
		if (frame[1]==10) {
			resultado=true;
		}
          return resultado;
}
	}
