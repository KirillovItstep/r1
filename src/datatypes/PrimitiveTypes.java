package datatypes;

import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {
         /*
        It's a good weather today.
        I'm 30 years old
        The world population is ...
        The 5 times (multiplication) table
        5 apples(0), 3 peaches(1) and 2 cherries
        The interest on deposit is 5%
        Today is the 5th day of week
        The first letter of my name is A
        The cycle is running 10 times
        The weight of apples is 1.2 kilos
        My name is Alex
        This year has 365 days
        There are 7 rainbow colors
        The BATE won this match:
        The first digit in the number is greater than the second:
        The library consists of 1005 books
        My height is 175 centimeters
         */
        boolean isWeatherGood = true; //Camel case
        //Snake case is_weaher_good
        int age = 30;
        long worldPopulation= 8_100_000_000L;
        int[] fiveTimesTable;
        int apples = 5;
        double interestOnDeposit = 0.05;
        int dayOfWeek = 1;
        char firstLetter='\'';
        int count = 10; //i,j,k index, count
        float WeightOfApples = 1.2f;
        String name = "Alex's \"";
        double height = 175.;
        int[] h = new int[5];
        //
        System.out.println(Arrays.toString(h));



    }
}
