class SeparateChainingHash {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node[] table;
    private int size;

    public SeparateChainingHash(int size) {
        this.size = size;
        table = new Node[size];
    }

    public void insert(int key) {
        int index = key % size;

        Node newNode = new Node(key);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node temp = table[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> ");
            Node temp = table[i];

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SeparateChainingHash h = new SeparateChainingHash(10);
        h.insert(25);
        h.insert(35);
        h.insert(45);
        h.display();
    }
}