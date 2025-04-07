
package eva2_5_queue;


public class EVA2_5_QUEUE {

    
    public static void main(String[] args) {
       
        MyQueue queue = new MyQueue();
        queue.push(100);
        queue.push(200);
        queue.push(300);
        queue.push(400);
        queue.push(500);
        try{
            System.out.println("Peek" + queue.pop());
        }catch (Exception ex){
           ex.printStackTrace();
        }
        queue.printList();
    }
    
}
