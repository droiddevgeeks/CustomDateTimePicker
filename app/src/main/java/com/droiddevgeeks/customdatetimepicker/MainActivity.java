package com.droiddevgeeks.customdatetimepicker;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by Vampire on 2017-01-11.
 */

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openDateTimePicker();

    }

    private void openDateTimePicker()
    {
        FragmentManager fm = getFragmentManager();
        ReminderPopUpDialogFragment dialogFragment = new ReminderPopUpDialogFragment();
        dialogFragment.show(fm, "Reminder Fragment");
    }

}
