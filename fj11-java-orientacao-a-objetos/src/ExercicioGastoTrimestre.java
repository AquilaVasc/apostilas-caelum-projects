
public class ExercicioGastoTrimestre {
	public static void main(String[] args) {
		int gastoDeJaneiro = 15000;
		int gastoDeFevereiro = 23000;
		int gastoDeMarco = 17000;
		
		int totalDoTrimestre = gastoDeJaneiro + gastoDeFevereiro + gastoDeMarco;
		double mediaMensalDeGastos = totalDoTrimestre / 3;
		System.out.println(totalDoTrimestre);
		System.out.println(mediaMensalDeGastos);
	}
}