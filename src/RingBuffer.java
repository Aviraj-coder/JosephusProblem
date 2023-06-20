public class RingBuffer {
    int size;
    Node head;
    Node tail;

    RingBuffer(int s){
        if(s ==0)
            return;
        for(int i = 0; i < s; i++){
            Node new_person = new Node(i);
            if( i == 0){
                head = new_person;
                tail = head;
            }
            else{
            tail.next = new_person;
            tail = new_person;
            tail.next = head;
        }
    }

    }
}
