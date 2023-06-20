public class JosephusMain {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0].toString());
        int M = Integer.parseInt(args[1].toString());

        // || = or
        // && = and
        if(N == 0 && M > 0){
            System.out.println("1");
            return;
        }
        else if(N == 0 || M ==0){
            System.out.println("Requirements not met");
            return;
        }
        RingBuffer circle = new RingBuffer(N);
        Queue queue = new Queue();
        Node temp = circle.head;
        int counter = 1;

        while(queue.count < N){
            while(counter != M){
                if( temp.next.dead == false){
                    counter++;
                    temp = temp.next;
                }
                else{
                    temp = temp.next;
                }

            }
            temp.dead = true;
            queue.enqueue(temp.key);
            counter = 0;
        }
        while(queue.count > 1){
            System.out.println(queue.dequeue());
        }
        System.out.print("This is the CHOSEN ONE : ");
        System.out.println(queue.dequeue());


    }
}