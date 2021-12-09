// Write a JAVA program to simulate the following CPU scheduling algorithms to find average waiting time and turnaround time
// RR scheduling algorithm

package lab4;

import java.util.Scanner;

public class RoundRobin {

  static void findWaitingTime(
    int processes[],
    int n,
    int burstTime[],
    int waitingTime[],
    int quantum
  ) {
    int rem_burstTime[] = new int[n];
    for (int i = 0; i < n; i++) {
      rem_burstTime[i] = burstTime[i];
    }
    int t = 0;
    while (true) {
      boolean done = true;
      for (int i = 0; i < n; i++) {
        if (rem_burstTime[i] > 0) {
          done = false;
          if (rem_burstTime[i] > quantum) {
            t += quantum;
            rem_burstTime[i] -= quantum;
          } else {
            t = t + rem_burstTime[i];
            waitingTime[i] = t - burstTime[i];
            rem_burstTime[i] = 0;
          }
        }
      }
      if (done == true) break;
    }
  }

  static void findTurnAroundTime(
    int processes[],
    int n,
    int burstTime[],
    int waitingTime[],
    int turnAroundTime[]
  ) {
    for (int i = 0; i < n; i++) turnAroundTime[i] =
      burstTime[i] + waitingTime[i];
  }

  static void findAvgTime(
    int processes[],
    int n,
    int burstTime[],
    int quantum
  ) {
    int waitingTime[] = new int[n], turnAroundTime[] = new int[n];
    int total_waitingTime = 0, total_turnAroundTime = 0;
    findWaitingTime(processes, n, burstTime, waitingTime, quantum);
    findTurnAroundTime(processes, n, burstTime, waitingTime, turnAroundTime);
    System.out.println(
      "\nProcesses " + " Burst time " + " Waiting time " + " Turn around time"
    );
    for (int i = 0; i < n; i++) {
      total_waitingTime = total_waitingTime + waitingTime[i];
      total_turnAroundTime = total_turnAroundTime + turnAroundTime[i];
      System.out.println(
        " " +
        (i + 1) +
        "\t\t" +
        burstTime[i] +
        "\t " +
        waitingTime[i] +
        "\t\t " +
        turnAroundTime[i]
      );
    }
    System.out.println(
      "\nAverage waiting time = " + (float) total_waitingTime / (float) n
    );
    System.out.println(
      "Average turn around time = " + (float) total_turnAroundTime / (float) n
    );
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Process: ");
    int num = sc.nextInt();
    System.out.print("Enter value of Quantum: ");
    int quantum = sc.nextInt();
    int processes[] = new int[num];
    int burstTime[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("...Enter the BurstTime for process " + (i + 1) + " : ");
      processes[i] = i + 1;
      burstTime[i] = sc.nextInt();
    }
    findAvgTime(processes, num, burstTime, quantum);
    sc.close();
  }
}
