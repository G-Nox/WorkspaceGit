package skills;

import java.sql.Timestamp;

/**
 * represents a workout, and its time
 * @author Victor Balaban 
 */
public class Workout {
	
	private Timestamp start;
	private Timestamp finish;
	private int duration;
	
	/**
	 * @param start of workout
	 * @param finish of workout
	 * @param duration of the wokrout
	 */
	public Workout(Timestamp start, Timestamp finish, int duration) {

		this.start = start;
		this.finish = finish;
		this.duration = duration;
	}
	
	

	@Override
	public String toString() {
		return "Workout [start=" + start + ", finish=" + finish + ", duration=" + duration + "]";
	}



	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getFinish() {
		return finish;
	}

	public void setFinish(Timestamp finish) {
		this.finish = finish;
	}

	public int getDuration() {
		return duration/1000;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
