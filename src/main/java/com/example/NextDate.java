package com.example;

    /*NextDate is a function that takes a day, month, and year input and output the next day
        The function takes a date between the years 1812 and  2212*/
 
    public class NextDate {

        public static String NextDate(int day, int month, int year) {

            //Has the number of the days of every month of the year except february
            int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
            //Check if is a leap year
            boolean isLeapYear = (year % 4 == 0) || (year % 400 == 0);
            
            // If is a leap year change the last day of february
            days[1] = isLeapYear ? 29 : 28;
    
            //Check Bounds
            if (year < 1812 || year > 2212 || month < 1 || month > 12 || day > days[month - 1]) {
                return "ERROR: out of range";
            }
    
           
            //Check if the input is the last day of the last month and last year
            if (day == 31 && month == 12 && year == 2212) {
                //Return this output if is true
                return "1/1/2213";
            }
    
            
            //Check if there are more days in the month, increase date by one
            if (day < days[month - 1]) 
                return (day + 1) + "/" + month + "/" + year;
            
            //Check if the date is the last date of the month, then increase month by one
            else if (month < 12) 
                return 1 + "/" + (month + 1) + "/" + year;
            
            //Else increment Year
            else 
                return 1 + "/" + 1 + "/" + (year + 1);
            
        }
    }