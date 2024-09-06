package src.main.java;


public class ClockDisplaySeconds{
    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;
    private String display;
    
    public ClockDisplaySeconds(){
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        second = new NumberDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplaySeconds(int h, int m, int s){
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        second = new NumberDisplay(60);
        setTime(h, m, s);
    }
    
    public void timeTick(){
        second.increment();
        if(second.getValue() == 0){
            minute.increment();
        }
        if(minute.getValue() == 0){
            hour.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int h, int m, int s){
        hour.setValue(h);
        minute.setValue(m);
        second.setValue(s);
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
        newDisplay += ":";
        newDisplay += second.getDisplayValue();
        display = newDisplay;
    }
}
