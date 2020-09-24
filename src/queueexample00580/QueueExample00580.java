/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample00580;

/**
 *
 * @author Enubs
 */
public class QueueExample00580 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue<String> strQ = new ArrayQueue<>(8);

        try {
            strQ.enqueue("[4]");
            strQ.enqueue("[8]");
            strQ.enqueue("[9]");
            strQ.enqueue("[7]");
            strQ.enqueue("[5]");
            strQ.enqueue("[3]");
            strQ.enqueue("[2]");
            strQ.enqueue("[6]");

            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            strQ.dequeue();
            
            //strQ.dequeue();

            System.out.println(strQ.size());
            System.out.println(strQ.first());
        } catch (FullQueueException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
