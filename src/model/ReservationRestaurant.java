package model;

public class ReservationRestaurant extends Reservation {
	private int numTable;
	private String service;
	public ReservationRestaurant(int jourReservation, int moisReservation, int numService, int nbPersonnes) {
		super(jourReservation, moisReservation);
		if(numService==1) {
			service="premier";
		}else if(numService==2){
			service="deuxieme";
		}
	}
	
	public String toString() {
		return "Le "+jourReservation+ "/"+moisReservation+" : table n°"+numTable+" pour le "+service+" service.";
	}
	
	
}
