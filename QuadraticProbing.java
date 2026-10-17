class QuadraticProbing{

    int[] table;
    int size;

    public QuadraticProbing(int size) {
        this.size = size;
        table = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    int hash(int key) {
        return key % size;
    }


    void insert(int key) {
        int index = hash(key);

        if (table[index] == -1) {
            table[index] = key;
        } else {
            int i = 1;
            while (i < size) {
                int newIndex = (index + i * i) % size;

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
        QuadraticProbing ht = new QuadraticProbing(10);

        ht.insert(23);
        ht.insert(43);
        ht.insert(13);
        ht.insert(27);

        ht.display();

    }
}