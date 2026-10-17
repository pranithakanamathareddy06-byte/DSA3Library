class Pair<K,V>{
    private K key;
    private V value;
    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public void display(){
        System.out.println(key + " : " + value);
    }
}
   public class PairDemo{
    public static void main(String[] args){
        Pair<String, Integer> p = new Pair<>("Age",25);
        p.display();
    }
}