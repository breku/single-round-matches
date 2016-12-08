package com.brekol.srm149.div2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by brekol on 08.12.16.
 */
public class FormatAmt {

    public String amount(int dollars, int cents) {

        final NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        instance.setGroupingUsed(true);
        instance.setMinimumIntegerDigits(1);
        instance.setMaximumFractionDigits(0);

        final String formattedDollars = instance.format(dollars);
        if(cents<10){
            return String.format("$%s.0%s", formattedDollars, cents);
        }
        return String.format("$%s.%s", formattedDollars, cents);
    }
}
