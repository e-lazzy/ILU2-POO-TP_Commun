package model;

public class CalendrierAnnuel {
	private Mois[] mois = new Mois[12]; 
	public CalendrierAnnuel() {
		mois[0]= new Mois("Janvier", 31);
		mois[1]= new Mois("Fevrier", 28);
		mois[2]= new Mois("Mars", 31);
		mois[3]= new Mois("Avril", 30);
		mois[4]= new Mois("Mai", 31);
		mois[5]= new Mois("Juin", 30);
		mois[6]= new Mois("Juillet", 31);
		mois[7]= new Mois("Aout", 31);
		mois[8]= new Mois("Septembre", 30);
		mois[9]= new Mois("Octobre", 31);
		mois[10]= new Mois("Novembre", 30);
		mois[11]= new Mois("Decembre", 31);
		
	}
	public boolean estLibre(int njour,int nmois) {
		return mois[nmois-1].estLibre(njour);
	}
	
	public boolean reserver(int njour,int nmois) {
		if(estLibre(njour,nmois)) {
			mois[nmois-1].reserver(njour);
			return true;
		}
		return false;
	}
	
	private class  Mois {
		private String nom;
		private boolean[] jours;
		public Mois(String nom,int nbr_jours) {
			jours = new boolean[nbr_jours];
			for(int i=0; i<nbr_jours;i++) jours[i]=false;
			this.nom=nom;
			
		}
		public boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		public boolean reserver(int jour) {
			if(estLibre(jour)) {
				jours[jour-1]=true;
				return true;
			}else {
				 return false;
			}
		}
	}
	
}