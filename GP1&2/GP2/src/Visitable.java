/**
 * 
 * @author Brodsky R, Schreifels J, Vang J, Weigel A
 *
 */
public interface Visitable {
	/**
	 * Donations will be forced to implement this method, through which they
	 * will connect to the appropriate method in the PaymentVisitor class
	 */
	public String accept(Visitor vistor);
}
