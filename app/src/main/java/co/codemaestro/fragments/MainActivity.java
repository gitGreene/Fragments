package co.codemaestro.fragments;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.datepicker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        // The integer for month returned by date picker starts counting at 0 for January
        // Hence adding 1 to the returned value
        String month_string = Integer.toString(month+1);

        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        // Concatenating the strings for a Toast message
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
    }
}
