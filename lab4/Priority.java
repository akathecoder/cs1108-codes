// Write a JAVA program to simulate the following CPU scheduling algorithms to find average waiting time and turnaround time
// Priority Scheduling algorithm

package lab4;

import java.util.Scanner;

public class Priority {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number of Process: ");
    int numberOfProcess = sc.nextInt();
    int[] process = new int[numberOfProcess];
    int burstTime[] = new int[numberOfProcess];
    int priority[] = new int[numberOfProcess];
    for (int i = 0; i < numberOfProcess; i++) {
      System.out.println("...Process " + (i + 1) + "...");
      System.out.print("\tProcess Id : ");
      process[i] = sc.nextInt();
      System.out.print("\tBurst Time Time : ");
      burstTime[i] = sc.nextInt();
      System.out.print("\tPriority : ");
      priority[i] = sc.nextInt();
    }
    int temp;
    int temp2;
    for (int i = 0; i < numberOfProcess - 1; i++) {
      for (int j = 0; j < numberOfProcess - 1; j++) {
        if (priority[j] > priority[j + 1]) {
          temp = priority[j];
          priority[j] = priority[j + 1];
          priority[j + 1] = temp;
          temp = burstTime[j];
          burstTime[j] = burstTime[j + 1];
          burstTime[j + 1] = temp;
          temp2 = process[j];
          process[j] = process[j + 1];
          process[j + 1] = temp2;
        }
      }
    }
    int TAT[] = new int[numberOfProcess + 1];
    int waitingTime[] = new int[numberOfProcess + 1];
    for (int i = 0; i < numberOfProcess; i++) {
      TAT[i] = burstTime[i] + waitingTime[i];
      waitingTime[i + 1] = TAT[i];
    }
    int totalWT = 0;
    int totalTAT = 0;
    double avgWT;
    double avgTAT;
    System.out.println(
      "Process ID\tBurst Time\tWaiting Time\tTurn Around Time"
    );
    for (int i = 0; i < numberOfProcess; i++) {
      System.out.println(
        process[i] +
        "\t\t" +
        burstTime[i] +
        "\t\t" +
        waitingTime[i] +
        "\t\t" +
        (TAT[i])
      );
      totalTAT += (waitingTime[i] + burstTime[i]);
      totalWT += waitingTime[i];
    }
    avgWT = totalWT / (double) numberOfProcess;
    avgTAT = totalTAT / (double) numberOfProcess;
    System.out.println("\n Average Waiting Time: " + avgWT);
    System.out.println(" Average Turn Around Time: " + avgTAT);
    sc.close();
  }
}
