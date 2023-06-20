public class Queue extends SLL{

    public int dequeue(){
        Node next_in_queue = head.next;
        int key = head.key;
        head = null;
        head = next_in_queue;
        count--;
        return key;
    }
        public void enqueue(int k)
        {
        super.insert(k);
        }

}
