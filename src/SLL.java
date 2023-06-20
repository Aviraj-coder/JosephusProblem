public class SLL {
    Node head;
    int count = 0;

    public void insert(int val){
        if(count == 0){
            Node newNode = new Node(val);
            head = newNode;
        }
        else{
            Node newNode = new Node(val);
            newNode.next = null;
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;

    }
    public Node search(int k_element){
        Node temp = head;
        int c = 0;
        while(k_element != c){
            temp = temp.next;
                    c++;
        }

        return temp; // Would not let Code run without return?
    }
        public void delete(int k_element){
        Node temp = head;
        Node temp_current = null;
        int count = 0;
            while(count != k_element){
                temp_current = temp;
                temp = temp.next;
            }
            if(count == k_element){
                Node next = temp.next;
                temp = null;
                temp_current.next = temp;
            }


        }

        public void print(){
        if( head == null){
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.key);
                    current = current.next;
        }
        System.out.println(current);

        }
        public int max(Node first){
        int max = head.key;
        Node current = head.next;
        while(current != null){
            if(current.key > max){
                max = current.key;
            }
            current = current.next;
            }
        System.out.print("The Node with the maximum value is " + max);
            return max; // Would not let code run without return?
        }
}