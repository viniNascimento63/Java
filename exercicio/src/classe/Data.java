package classe;
public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data() {
		/*
		dia = 1;
		mes = 1;
		ano = 1970;
		*/
		this(1, 1, 1970);
	}
	
	public String obterDataFormatada() {
		String data = dia + "/" + mes + "/" + ano;
		return data;
	}
}
