package src.main.java;


public class ClockDisplay12Hour
{
    private NumberDisplay hour;
    private NumberDisplay minute;
    private String meridiem;
    private String display;
    
    public ClockDisplay12Hour(){
        hour = new NumberDisplay(13);
        minute = new NumberDisplay(60);
        setTime(12, 0, "AM");
        updateDisplay();
    }
    
    public ClockDisplay12Hour(int h, int m, String ap){
        hour = new NumberDisplay(13);
        minute = new NumberDisplay(60);
        setTime(h, m, ap);
    }
    
    public void timeTick(){
        minute.increment();
        if(minute.getValue() == 0){
            hour.increment();
            if(hour.getValue() == 12){
                APSwitch();
            }
        }
        if(hour.getValue() == 0){
            hour.increment();
        }
        updateDisplay();
    }
    
    public void APSwitch(){
        if(meridiem.equals("PM")){
            meridiem = "AM";
        }else{
            meridiem = "PM";
        }
    }
    
    public void setTime(int h, int m, String ap){
        hour.setValue(h);
        minute.setValue(m);
        meridiem = ap;
        updateDisplay();
    }
    
    public String getTime(){
        return display;
    }
    
    public void updateDisplay(){
        String newDisplay = "";
        newDisplay += hour.getDisplayValue();
        newDisplay += ":";
        newDisplay += minute.getDisplayValue();
        newDisplay += meridiem;
        display = newDisplay;
    }
}
