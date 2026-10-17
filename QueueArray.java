class Queue{
    int[] arr;
    int front,rear,size;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }
    void Enqueue(int data){
        if(rear == size - 1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            arr[rear] = data;
            System.out.println("Enqueued " + data);
        }
    }
    void Dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
        }
        else{
            int data = arr[front];
            System.out.println("Dequeued " + data);
            front++;
        }
    }
    void display(){
        if(front > rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = front; i <= rear; i++){
                System.out.println("Displaying elements " + arr[i]);
            }
        }
    }


}
class QueueArray{
    public static void main(String[] args){
        Queue q = new Queue(4);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);

        q.display();

        q.Dequeue();
        q.Dequeue();
        
        q.display();

    }
}