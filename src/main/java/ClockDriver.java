package src.main.java;


public class ClockDriver{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("\t> TESTING CLOCK DISPLAY <");
        ClockDisplay test = new ClockDisplay();
        String testOutput = test.getTime();
        System.out.println("Empty Test: " + testOutput);
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        testOutput = test2.getTime();
        System.out.println("2:45 Test: " + testOutput);
        
        test2.setTime(3, 32);
        testOutput = test2.getTime();
        System.out.println("setTime Test: " + testOutput);
        
        ClockDisplay tickTest = new ClockDisplay(3, 32);
        testOutput = tickTest.getTime();
        System.out.println("pre tick1 Test: " + testOutput);
        tickTest.timeTick();
        testOutput = tickTest.getTime();
        System.out.println("post tick1 Test: " + testOutput);
        
        tickTest.setTime(3, 9);
        testOutput = tickTest.getTime();
        System.out.println("pre tick2 Test: " + testOutput);
        tickTest.timeTick();
        testOutput = tickTest.getTime();
        System.out.println("post tick2 Test: " + testOutput);
        
        tickTest.setTime(1, 59);
        testOutput = tickTest.getTime();
        System.out.println("pre tick3 Test: " + testOutput);
        tickTest.timeTick();
        testOutput = tickTest.getTime();
        System.out.println("post tick3 Test: " + testOutput);
        
        tickTest.setTime(9, 59);
        testOutput = tickTest.getTime();
        System.out.println("pre tick3 Test: " + testOutput);
        tickTest.timeTick();
        testOutput = tickTest.getTime();
        System.out.println("post tick3 Test: " + testOutput);
        
        tickTest.setTime(23, 59);
        testOutput = tickTest.getTime();
        System.out.println("pre tick3 Test: " + testOutput);
        tickTest.timeTick();
        testOutput = tickTest.getTime();
        System.out.println("post tick3 Test: " + testOutput);
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("\n\t> TESTING CLOCK SECOND DISPLAY <");
        ClockDisplaySeconds secTest = new ClockDisplaySeconds();
        testOutput = secTest.getTime();
        System.out.println("Empty Test: " + testOutput);
        
        ClockDisplaySeconds secTest2 = new ClockDisplaySeconds(2, 45, 45);
        testOutput = secTest2.getTime();
        System.out.println("2:45 Test: " + testOutput);
        
        secTest2.setTime(3, 32, 59);
        testOutput = secTest2.getTime();
        System.out.println("setTime Test: " + testOutput);
        
        ClockDisplaySeconds secTickTest = new ClockDisplaySeconds(3, 32, 59);
        testOutput = secTickTest.getTime();
        System.out.println("pre tick1 Test: " + testOutput);
        secTickTest.timeTick();
        testOutput = secTickTest.getTime();
        System.out.println("post tick1 Test: " + testOutput);
        
        secTickTest.setTime(1, 0, 59);
        testOutput = secTickTest.getTime();
        System.out.println("pre tick2 Test: " + testOutput);
        secTickTest.timeTick();
        testOutput = secTickTest.getTime();
        System.out.println("post tick2 Test: " + testOutput);
        
        secTickTest.setTime(1, 59, 59);
        testOutput = secTickTest.getTime();
        System.out.println("pre tick3 Test: " + testOutput);
        secTickTest.timeTick();
        testOutput = secTickTest.getTime();
        System.out.println("post tick3 Test: " + testOutput);
        
        secTickTest.setTime(23, 59, 59);
        testOutput = secTickTest.getTime();
        System.out.println("pre tick4 Test: " + testOutput);
        secTickTest.timeTick();
        testOutput = secTickTest.getTime();
        System.out.println("post tick4 Test: " + testOutput);
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        System.out.println("\n\t> TESTING CLOCK 12-HOUR DISPLAY <");
        ClockDisplay12Hour AMPMTest = new ClockDisplay12Hour();
        testOutput = AMPMTest.getTime();
        System.out.println("Empty Test: " + testOutput);
        
        ClockDisplay12Hour AMPMTest2 = new ClockDisplay12Hour(2, 45, "PM");
        testOutput = AMPMTest2.getTime();
        System.out.println("2:45 Test: " + testOutput);
        
        AMPMTest2.setTime(3, 32, "AM");
        testOutput = AMPMTest2.getTime();
        System.out.println("setTime Test: " + testOutput);
        
        ClockDisplay12Hour AMPMTickTest = new ClockDisplay12Hour(3, 32, "PM");
        testOutput = AMPMTickTest.getTime();
        System.out.println("pre tick1 Test: " + testOutput);
        AMPMTickTest.timeTick();
        testOutput = AMPMTickTest.getTime();
        System.out.println("post tick1 Test: " + testOutput);
        
        AMPMTickTest.setTime(11, 59, "PM");
        testOutput = AMPMTickTest.getTime();
        System.out.println("pre tick2 Test: " + testOutput);
        AMPMTickTest.timeTick();
        testOutput = AMPMTickTest.getTime();
        System.out.println("post tick2 Test: " + testOutput);
        
        AMPMTickTest.setTime(11, 59, "AM");
        testOutput = AMPMTickTest.getTime();
        System.out.println("pre tick3 Test: " + testOutput);
        AMPMTickTest.timeTick();
        testOutput = AMPMTickTest.getTime();
        System.out.println("post tick3 Test: " + testOutput);
        
        AMPMTickTest.setTime(12, 59, "PM");
        testOutput = AMPMTickTest.getTime();
        System.out.println("pre tick4 Test: " + testOutput);
        AMPMTickTest.timeTick();
        testOutput = AMPMTickTest.getTime();
        System.out.println("post tick4 Test: " + testOutput);
    }
}
