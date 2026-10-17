class MinHeap {
    int[] heap;
    int size;
    int capacity;

   
    MinHeap(int capacity) {
        this.capacity = capacity;
        size = 0;
        heap = new int[capacity];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }


    int leftChild(int i) {
        return 2 * i + 1;
    }

    int rightChild(int i) {
        return 2 * i + 2;
    }


    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        while (current != 0 && heap[parent(current)] > heap[current]) {
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;
            current = parent(current);
        }
    }
   void delete() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return;
        }

        heap[0] = heap[size - 1];
        size--;

        heapify(0);
    }

    // Heapify Down
    void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest])
            smallest = left;

        if (right < size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            
            heapify(smallest);
        }
    }
    void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap H = new MinHeap(10);

        H.insert(30);
        H.insert(40);
        H.insert(50);
        H.insert(60);
        H.insert(70);

        System.out.println("Min Heap:");
        H.display();
        H.delete();

        System.out.println("After deleting root:");
        H.display();
    }
}