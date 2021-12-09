// Write a JAVA program to simulate the following CPU scheduling algorithms to find average waiting time and turnaround time
// FCFS scheduling algorithm

package lab4;

import java.util.*;

public class FCFS {

  static void findWaitingTime(int n, int burstTime[], int waitingTime[]) {
    waitingTime[0] = 0;
    for (int i = 1; i < n; i++) {
      waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
    }
  }

  static void findTurnAroundTime(
    int n,
    int burstTime[],
    int waitingTime[],
    int turnAroundTime[]
  ) {
    for (int i = 0; i < n; i++) {
      turnAroundTime[i] = burstTime[i] + waitingTime[i];
    }
  }

  static void findAvgTime(int processes[], int n, int burstTime[]) {
    int waitingTime[] = new int[n];
    int turnAroundTime[] = new int[n];
    int total_waitingTime = 0, total_turnAroundTime = 0;
    findWaitingTime(n, burstTime, waitingTime);
    findTurnAroundTime(n, burstTime, waitingTime, turnAroundTime);
    System.out.printf("\nProcesses BurstTime WaitingTime TurnAroundTime\n");
    for (int i = 0; i < n; i++) {
      total_waitingTime = total_waitingTime + waitingTime[i];
      total_turnAroundTime = total_turnAroundTime + turnAroundTime[i];
      System.out.printf("%d", (i + 1));
      System.out.printf("%d", burstTime[i]);
      System.out.printf("%d ", waitingTime[i]);
      System.out.printf("%d\n", turnAroundTime[i]);
    }
    float s = (float) total_waitingTime / (float) n;
    float t = (float) total_turnAroundTime / (float) n;
    System.out.printf("\nAverage waiting time = %f", s);
    System.out.printf("\n");
    System.out.printf("Average turn around time = %f ", t);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Process: ");
    int num = sc.nextInt();
    int processes[] = new int[num];
    int burstTime[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("...Enter the BurstTime for process " + (i + 1) + " : ");
      processes[i] = i + 1;
      burstTime[i] = sc.nextInt();
    }
    findAvgTime(processes, num, burstTime);
    sc.close();
  }
}
