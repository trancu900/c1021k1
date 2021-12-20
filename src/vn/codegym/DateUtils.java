package vn.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtils {
    private static final String DATE_PATTERN = "dd-MM-yyyy";

    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern == null ? DATE_PATTERN : pattern);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.format(date);
    }

    public static String dateToString(Date date) {
        return dateToString(date, null);
    }

    public static Date stringToDate(String dateString, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern == null ? DATE_PATTERN : pattern);
        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static Date stringToDate(String dateString) {
        return stringToDate(dateString, null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringDate = scanner.nextLine();
        Date date = DateUtils.stringToDate(stringDate);
        System.out.println(date);
    }
}
