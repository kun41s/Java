/*
Assume that you are a software engineer working on Microsoft Outlook.
You need to develop a new feature that schedules the maximum number of meetings in a conference room without overlapping their start or end times.
This conference room has been requested for some meetings that may overlap; you will observe how the greedy algorithm works here.

You have one auditorium to schedule events, and there are four events to be scheduled as shown in the table given below.

Meeting Timings
       1pm to 2pm
       3pm to 4pm
       12pm to 6pm
       5pm to 7pm
       8pm to 9pm
       5pm to 9pm


    You need to schedule the maximum number of events in the auditorium such that no two events overlap at any given time.
    Only two events can be scheduled in the auditorium without any two events overlapping.
    The greedy approach here will be to first pick a job. The next job to be picked will be the job that has the earliest start time after the end time of the previous job.
    This process goes on until the maximum number of jobs in the list have been scheduled.
 */

package DataStructureAndAlgorithm.GreedyAlgorithm;
import java.util.Arrays;

class Scheduling {
    public static void main(String[] args) {
        // Creating sample schedules
        Schedule schedule1 = new Schedule(1, 2);
        Schedule schedule2 = new Schedule(3, 4);
        Schedule schedule3 = new Schedule(0, 6);
        Schedule schedule4 = new Schedule(5, 7);
        Schedule schedule5 = new Schedule(8, 9);
        Schedule schedule6 = new Schedule(5, 9);
        Schedule[] schedules = {schedule1, schedule2, schedule3, schedule4, schedule5, schedule6};

        // Print out the best schedules we can come up with using greedy algorithm
        printBestSchedules(schedules);
    }

    public static void printBestSchedules(Schedule[] schedules) {
        // sort schedules by ending times, from earliest to last
        // Big-O: O(N log N);
        Arrays.sort(schedules);

        // Choose the first schedule from the sorted schedules since
        // the first items in the sorted schedule array will always have the earliest ending time
        // Big-O: O(1)
        printSchedule(0, schedules[0]);
        int numJobsScheduled = 1;

        // Greedily choose the schedules with the earliest ending times
        // Big-O: O(N)
        int lastSelectedIndex = 0;
        for(int i = 1; i < schedules.length; i++) {
            // If the current schedule's start time is later than the
            // the last schedule's ending time, we can add this schedule
            if (schedules[i].getStartTime() >= schedules[lastSelectedIndex].getEndTime()) {
                printSchedule(i, schedules[i]);
                lastSelectedIndex = i; // index of the last schedule that we chose
                numJobsScheduled++;
            }
        }

        System.out.println("Number of jobs scheduled: " + numJobsScheduled);
    }

    public static void printSchedule(int scheduleIndex, Schedule s) {
        System.out.println("Selected schedule: " + scheduleIndex + " with times: " + s);
    }
}

class Schedule implements Comparable<Schedule>{
    private int startTime;
    private int endTime;

    public Schedule(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int compareTo(Schedule otherSchedule) {
        return this.getEndTime() - otherSchedule.getEndTime();
    }

    public String toString() {
        return "{" + this.startTime + ", " + this.endTime + "}";
    }
}