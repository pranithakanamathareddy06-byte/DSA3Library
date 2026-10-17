class LinearProbing{
    private int[] table;
    private int size;
    public LinearProbing(int size){
        this.size = size;
        table = new int[size];
    }
    public void insert(int key){
        int index = key % size;
        while(table[index] != -1){
             index = (index + 1) % size;
        }
        table[index] = key;
    }
        public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }

    public static void main(String[] args){
         LinearProbing h = new LinearProbing(10);
        h.insert(25);
        h.insert(35);
        h.insert(45);
        h.display();




        
    }
}