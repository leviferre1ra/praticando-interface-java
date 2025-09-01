package Application;

import Entities.Contract;
import Entities.Installment;
import Services.ContractService;
import Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número do contrato: ");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor do contrato");
        Double totalValue = sc.nextDouble();

        Contract obj = new Contract(date, totalValue, number);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);


        System.out.println("Parcelas:");
        for(Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
