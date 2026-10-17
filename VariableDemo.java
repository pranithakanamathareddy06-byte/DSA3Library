public class VariableDemo {
    static int staticCount = 0;
    int instanceCount = 0;
    public void incrementCounts() {
        int localCounter = 5;
        instanceCount++;
        staticCount++;
        localCounter++;
        System.out.println("instanceCount: " + instanceCount);
        System.out.println("staticCount: " + staticCount);
        System.out.println("localCounter: " + localCounter);
    }
    public static void main(String[] args){
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();
        obj1.incrementCounts();
        System.out.println("----");
        obj2.incrementCounts();
    }
}