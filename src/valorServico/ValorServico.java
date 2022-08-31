package valorServico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		// variaveis
		double remuneracao, custo, hora, cargaHoraria;

		// objetos
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");

		// entrada
		System.out.println("Calculo do valor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = scanner.nextDouble();
		System.out.print("Custo Operacional mensal: ");
		custo = scanner.nextDouble();
		System.out.print("Carga horaria mensal de trabalho: ");
		cargaHoraria = scanner.nextDouble();
		scanner.close();

		// processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;

		// saida
		System.out.println("Valor da hora: " + formatador.format(hora));

	}

}
