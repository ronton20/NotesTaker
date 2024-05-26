package com.ronariel.notesrecorder;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TimePicker;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;

public class DateTimePicker extends FrameLayout {

    private Calendar calendar;
    private DatePicker datePicker;
    private TimePicker timePicker;

    public DateTimePicker(Context context) {
        super(context);
        init(context);
    }

    public DateTimePicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public DateTimePicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.view_date_time_picker, this);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);

        calendar = Calendar.getInstance();
    }

    public LocalDateTime getDateTime() {
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        int hourOfDay = timePicker.getHour();
        int minute = timePicker.getMinute();

        return LocalDateTime.of(year, month + 1, dayOfMonth, hourOfDay, minute);
    }

    public void setDateTime(LocalDateTime dateTime) {
        calendar.setTimeInMillis(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        datePicker.updateDate(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        );

        timePicker.setHour(calendar.get(Calendar.HOUR_OF_DAY));
        timePicker.setMinute(calendar.get(Calendar.MINUTE));
    }
}
