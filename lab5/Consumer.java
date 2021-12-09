// Write a JAVA program to implement the Producer & consumer Problem (Semaphore)

package lab5;

// Consumer class
class Consumer implements Runnable {

  Q q;

  Consumer(Q q) {
    this.q = q;
    new Thread(this, "Consumer").start();
  }

  public void run() {
    for (int i = 0; i < 5; i++) q.get(); // consumer get items
  }
}
