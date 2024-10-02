package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

public class JobSchedulerFIFO extends JobScheduler {
	
	public JobDescription next() {
		JobDescription nextJob = jobs.get(0);
		this.unschedule(nextJob);
		return nextJob;
	}
}
