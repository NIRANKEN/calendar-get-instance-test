package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateGetter {

  public String get() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    return sdf.format(Calendar.getInstance().getTime());
  }
}
