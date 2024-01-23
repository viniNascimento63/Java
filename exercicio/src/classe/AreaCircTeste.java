package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
    	AreaCirc a1 = new AreaCirc(10);
    	double area1 = a1.area();
    	
    	AreaCirc a2 = new AreaCirc(5);
    	double area2 = a2.area();
    	
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(AreaCirc.area(5));
    }
}
