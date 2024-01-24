package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        // Atribuição por valor (tipos primitivos)
        double a = 2;
        double b = a;

        a++;
        b--;
        System.out.println("a: " + a + "\nb: " + b);

        // Atribuição por referência (objetos)
        Data d1 = new Data(6, 3, 2001);
        Data d2 = d1;

        d1.dia = 14;
        d2.mes = 11 ;
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltar_data_para_valor_padrao(d1);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

    static void voltar_data_para_valor_padrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
