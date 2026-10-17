public class InfixExpression {
    public static void main(String[] args) {

        String s = "(A + B * C) / (D - E)";

        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
