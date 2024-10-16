package imposto;

public class Tax {
	
    private double calculateTaxPayment(double yearServicePayment) {
        double paymentMonth = yearServicePayment / 12;
        if (paymentMonth < 3000) {
            return 0;
        } else if (paymentMonth >= 3000 && paymentMonth < 5000) {
            return 0.10 * yearServicePayment;
        } else {
            return 0.20 * yearServicePayment;
        }
    }
	
    private double calculateTaxService(double yearService) {
        return 0.15 * yearService;
    }

    private double calculateTaxGainEquity(double yearGainEquity) {
        return 0.20 * yearGainEquity;
    }
	
	public double calculatedTax(Person person){
		
        double impostoSalario = calculateTaxPayment(person.getPaymentPerYear());
        double impostoServico = calculateTaxService(person.getPaymentServicePerYear());
        double impostoGanhoCapital = calculateTaxGainEquity(person.getRentYearGainPerEquity());

        return impostoSalario + impostoServico + impostoGanhoCapital;
	}
	
    public double calculateAbatament(Person person, double taxBrute) {
    	
        double spendingAll = person.getSpendingMedicinal() + person.getSpendingSchool();
        double maxDedutivel = 0.30 * taxBrute;
        return Math.min(maxDedutivel, spendingAll);
    }
	
    public void generateReport(Person person) {
    	double impostoSalario = calculateTaxPayment(person.getPaymentPerYear());
        double impostoServico = calculateTaxService(person.getPaymentServicePerYear());
        double impostoGanhoCapital = calculateTaxGainEquity(person.getRentYearGainPerEquity());
        
        double impostoBruto = impostoSalario + impostoServico + impostoGanhoCapital;
        double abatimento = calculateAbatament(person, impostoBruto);
        double impostoDevido = impostoBruto - abatimento;

        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
        System.out.println("* CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoGanhoCapital);
        System.out.println("* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", 0.30 * impostoBruto);
        System.out.printf("Gastos dedutíveis: %.2f\n", person.getSpendingMedicinal() + person.getSpendingSchool());
        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
        System.out.printf("Abatimento: %.2f\n", abatimento);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);
    }
    

}