package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class RegexReplaceExample {
    public static void main(String[] args) {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is 91-xxxxxxxxxx. Please let us know in case of any clarification. Thank you BridgeLabz 01/01/2016.";

        // replace <<name>> by first name
        String firstName = "Sanjana";
        message = message.replaceAll("<<name>>", firstName);

        // replace <<full name>> by user full name
        String fullName = "Sanjana Malkar";
        message = message.replaceAll("<<full name>>", fullName);

        // Replace mobile number with your contact number
        String contactNumber = "91-1234567890"; // Change this to your contact number
        message = message.replaceAll("91-\\d{10}", contactNumber);

        // Replace date with current date
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", formattedDate);

        // Print modified message
        System.out.println(message);
    }


}
