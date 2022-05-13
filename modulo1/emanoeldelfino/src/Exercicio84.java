import java.util.Scanner;

public class Exercicio84 {
	static final int NUM = 2;
	public static void main(String[] args) {
		int[] accountsCode = new int[NUM];
		float[] accountsBalance = new float[NUM];
		float bankAsset, value;
		boolean existingAccReg;
		int option, accountCode, movIndex = -1;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < NUM; i++) {
			do {
				System.out.printf("\nCódigo da conta %d: ", i + 1);
				accountsCode[i] = Integer.parseInt(sc.nextLine());

				existingAccReg = false;
				for (int j = 0; j < i && !existingAccReg; j++) {
					if (accountsCode[i] == accountsCode[j]) existingAccReg = true;
				}

				if (existingAccReg) {
					System.out.println("Código da conta inválido: Conta já informada.");
				}
				if (accountsCode[i] < 0) {
					System.out.println("Código da conta inválido: Valor negativo.");
				}
			} while (existingAccReg || accountsCode[i] < 0);

			do {
				System.out.print("Saldo da conta: R$ ");
				accountsBalance[i] = Float.parseFloat(sc.nextLine().replace(",", "."));

				if (accountsBalance[i] < 0) {
					System.out.println("Saldo inválido: A conta não pode ter um saldo negativo.");
				}
			} while (accountsBalance[i] < 0);
		}

		do {
			System.out.println("\ni. Efetuar depósito;");
			System.out.println("ii. Efetuar saque;");
			System.out.println("iii. Consultar o ativo bancário (ou seja, o somatório dos saldos de todos os clientes);");
			System.out.println("iv. Finalizar o programa.");

			System.out.print("\nOpção (1 a 4): ");
			option = Integer.parseInt(sc.nextLine());

			if (option == 1 || option == 2) {
				System.out.print("Código da conta: ");
				accountCode = Integer.parseInt(sc.nextLine());

				if (accountCode < 0) {
					System.out.println("Código de conta inválido.");
					continue;
				} 

				movIndex = -1;
				for (int i = 0; i < NUM && movIndex == -1; i++) {
					if (accountCode == accountsCode[i]) movIndex = i;
				}

				if (movIndex >= 0) {
					do {
						System.out.println("Saldo da conta:");
						System.out.printf("\nValor do %s: R$ ", option == 1 ? "depósito" : "saque");
						value = Float.parseFloat(sc.nextLine().replace(",", "."));
						if (value <= 0) {
							System.out.println("Inválido: valor menor ou igual a zero.");
						}
					} while (value <= 0);
					if (option == 1) {
						accountsBalance[movIndex] += value;
					} else {
						if (accountsBalance[movIndex] >= value) {
							accountsBalance[movIndex] -= value;
						} else {
							System.out.println("Saldo insuficiente para o saque.");
						}
					}
				} else {
					System.out.println("Conta não encontrada.");
				}
			} else if (option == 3) {
				bankAsset = 0;
				for (int i = 0; i < NUM; i++) {
					bankAsset += accountsBalance[i];
				}
				System.out.printf("\nAtivo bancário de R$ %.2f.\n", bankAsset);
			} else if (option == 4) {
				System.out.println("Finalizando...");
			 } else {
				System.out.println("Opção inválida!");
			 }
		} while (option != 4);

		System.out.println();

		sc.close();
	}
}
