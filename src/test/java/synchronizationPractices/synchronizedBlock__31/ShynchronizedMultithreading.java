package synchronizationPractices.synchronizedBlock__31;


// A Sender class
class Sender {
    public void SenderMsg(String msg) {
        System.out.println("\nSending a Message: " + msg);
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// A Sender class for sending a message using Threads
class SenderWThreads extends Thread {
    private String msg;
    Sender sd;

    // Receiver method to receive a message object and a message to be sent
    SenderWThreads(String m, Sender obj) {
        msg = m;
        sd = obj;
    }

    public void run() {
        // Checks that only one thread sends a message at a time.
        synchronized (sd) {
            // synchronizing the sender object
            sd.SenderMsg(msg);
        }
    }
}

// Driver Code
public class ShynchronizedMultithreading {
    public static void main(String args[]) {
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hola ", sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to Javatpoint website ", sender);

        // Start two threads of SenderWThreads type
        sender1.start();
        sender2.start();

        // wait for threads to end
        try {
            sender1.join();
            sender2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
