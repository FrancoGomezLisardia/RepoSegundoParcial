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
		int frame []= {};
		frame[1]=10;
		frame[2]=9;
		frame[3]=8;
		if (frame[1]==10) {
			return true;
		}else {
			return false;
		}
	}

}
