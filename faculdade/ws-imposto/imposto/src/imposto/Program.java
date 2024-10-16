package imposto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a renda anual com salário: R$ ");
        double paymentPerYear = scanner.nextDouble();
        
        System.out.print("Informe a renda anual com prestação de serviços: R$ ");
        double paymentServicePerYear = scanner.nextDouble();
        
        System.out.print("Informe a renda anual com ganho de capital: R$ ");
        double rentYearGainPerEquity = scanner.nextDouble();
        
        System.out.print("Informe os gastos médicos: R$ ");
        double spendingMedicinal = scanner.nextDouble();
        
        System.out.print("Informe os gastos educacionais: R$ ");
        double spendingSchool = scanner.nextDouble();
        
        Person person = new Person(paymentPerYear, paymentServicePerYear, rentYearGainPerEquity, spendingMedicinal, spendingSchool);

        Tax tax = new Tax();
        tax.generateReport(person);

        scanner.close();
    }
}