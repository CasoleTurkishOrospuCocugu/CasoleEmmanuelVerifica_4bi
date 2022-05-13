/**
 * Prodotto 
 * 
 * @author <b> Emmanuel Casole </b>
 * 
 * <U> 4°BI </U>
 * <i> 13/05/2022 </i>
 *
 */
public class CasoleEmmanuelClass {

	/**
	 * Metodo casoleMet
	 * 
	 * Il metodo che segue restituisce il prodotto dei numeri compresi tra 0 ed i due indici inseriti.
	 * 
	 * @param s indice iniziale
	 * @param f indice finale
	 * @return prodotto
	 */
		public int casoleMet(int s,int f) {
			int r=0;
			for(int i=1; i<f;i++) {
				r = r + r;
			}
			return r;
		}
		
		/**
		 * Costruttore vuoto
		 */
		public CasoleEmmanuelClass() {
			
		}
		
		public static void main(String []args) {
			CasoleEmmanuelClass c = new CasoleEmmanuelClass();
			System.out.println(c.casoleMet(5,7));
		}
}
