package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class DateGetterTest {

  @DisplayName("Calendar.getInstance()をモックするテストだよ")
  @Test
  void testGet() {
    Calendar cal = new GregorianCalendar(2023, 1, 26, 11, 12, 13);
    try (MockedStatic<Calendar> mockedCalendar = mockStatic(Calendar.class, Mockito.CALLS_REAL_METHODS)) {
      // Arrange
      mockedCalendar.when(() -> Calendar.getInstance()).thenReturn(cal);

      // Act
      String result = new DateGetter().get();

      // Assert
      assertEquals("20230226111213", result, "日時の期待値と結果が間違ってるよ。");
    }
  }

}
