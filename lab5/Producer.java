// Write a JAVA program to implement the Producer & consumer Problem (Semaphore)

package lab5;

// Producer class
class Producer implements Runnable {

  Q q;

  Producer(Q q) {
    this.q = q;
    new Thread(this, "Producer").start();
  }

  public void run() {
    for (int i = 0; i < 5; i++) q.put(i); // producer put items
  }
}
