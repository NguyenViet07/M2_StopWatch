import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch(){
        this.startTime = new Date();
        this.endTime = new Date();
    }
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime = new Date();
    }

    public long getElapseedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }

}
