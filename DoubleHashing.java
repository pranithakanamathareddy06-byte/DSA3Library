class DoubleHashing{

    int[] table;
    int size;

    public DoubleHashing(int size) {
        this.size = size;
        table = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    // First hash function
    int hash1(int key) {
        return key % size;
    }

    // Second hash function
    int hash2(int key) {
        int R = 12;  
        return (1 + key) % 12;
    }

    void insert(int key) {
        int index = hash1(key);

        if (table[index] == -1) {
            table[index] = key;
        } else {
            int i = 1;
            while (i < size) {
                int newIndex = (index + i * hash2(key)) % size;

                if (table[newIndex] == -1) {
                    table[newIndex] = key;
                    return;
                }
                i++;
            }
            System.out.println("Hash Table is Full");
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " --> " + table[i]);
        }
    }

    public static void main(String[] args) {
        DoubleHashing ht = new DoubleHashing(10);

        ht.insert(23);
        ht.insert(43);
        ht.insert(13);
        ht.insert(27);

        ht.display();
    }
}