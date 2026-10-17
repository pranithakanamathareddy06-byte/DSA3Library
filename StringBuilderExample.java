public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        sb.insert(5," ");
        sb.replace(0,5,"Hi");
        sb.reverse();
        System.out.println(sb);
    }
}