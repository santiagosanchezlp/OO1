package ar.edu.unlp.info.oo1.ejercicio10_JobScheduler;

public class JobSchedulerLIFO extends JobScheduler{
	
	public JobDescription next() {
		JobDescription nextJob = jobs.get(jobs.size()-1);
		this.unschedule(nextJob);
		return nextJob;
	}
}
