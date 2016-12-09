package com.brekol.srm150.div2;

/**
 * Created by brekol on 09.12.16.
 */
public class WidgetRepairs {

    public int days(int[] arrivals, int numPerDay) {

        int daysWorked = 0;
        int workToDo = 0;
        while (workToDo > 0 || daysWorked < arrivals.length) {
            if (daysWorked < arrivals.length) {
                workToDo += arrivals[daysWorked];
            }

            workToDo -= numPerDay;
            if (workToDo < 0) {
                workToDo = 0;
            }

            daysWorked++;
        }
        return daysWorked;

    }
}
