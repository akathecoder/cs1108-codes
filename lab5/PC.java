// Write a JAVA program to implement the Producer & consumer Problem (Semaphore)

package lab5;

// Driver class
class PC {

  public static void main(String args[]) {
    // creating buffer queue
    Q q = new Q();

    // starting consumer thread
    new Consumer(q);

    // starting producer thread
    new Producer(q);
  }
}
