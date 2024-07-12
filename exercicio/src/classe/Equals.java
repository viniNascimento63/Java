package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.nome = "Ravi";
        user1.email = "rav1@email.com";

        Usuario user2 = new Usuario();
        user2.nome = "Ravi";
        user2.email = "rav1@email.com";

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));
    }
}
