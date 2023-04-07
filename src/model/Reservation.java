package model;

public abstract class Reservation {
	protected int jourReservation;
	protected int moisReservation;
	
	public Reservation(int jourReservation,int moisReservation) {
		this.jourReservation=jourReservation;
		this.moisReservation=moisReservation;
	}
	
}
