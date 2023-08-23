public class Watch {
    private int hour;
    private int minute;
    private int seconds;

    public Watch(){
        this.hour = 0;
        this.minute = 0;
        this.seconds = 0;
    }

    public Watch(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void avanzarSec(){
        seconds++;
        if (seconds >= 60){
            seconds = 0;
            minute++;
            if(minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24){
                    hour = 0;
                }
            }
        }
    }

    public void retroSec(){
        seconds--;
        if(seconds < 0){
            seconds = 59;
            minute--;
            if(minute < 0){
                minute = 59;
                hour--;
                if(hour < 0){
                    hour = 23;
                }
            }
        }
    }
    public String printHour(){
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }

    public static void main(String[] args) {
        Watch watch = new Watch(12, 30, 45);
                System.out.println(watch.printHour());
        watch.avanzarSec();

        System.out.println(watch.printHour());
        watch.retroSec();

        System.out.println(watch.printHour());
    }
}