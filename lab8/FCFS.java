// Write a JAVA programs to simulate disk scheduling algorithms
// First Come First Serve

package lab8;

class FCFS {

  static int size = 8;

  static void runFCFS(int arr[], int head) {
    int seek_count = 0;
    int distance, cur_track;

    for (int i = 0; i < size; i++) {
      cur_track = arr[i];

      // calculate absolute distance
      distance = Math.abs(cur_track - head);

      // increase the total count
      seek_count += distance;

      // accessed track is now new head
      head = cur_track;
    }

    System.out.println("Total number of " + "seek operations = " + seek_count);

    // Seek sequence would be the same
    // as request array sequence
    System.out.println("Seek Sequence is");

    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    // request array
    int arr[] = { 176, 79, 34, 60, 92, 11, 41, 114 };
    int head = 50;

    runFCFS(arr, head);
  }
}
