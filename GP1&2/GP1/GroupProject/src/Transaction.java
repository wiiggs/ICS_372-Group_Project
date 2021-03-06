
/**
 *
 * @author  Brodsky R, Schreifels J, Vang J, Weigel A
 *
 */
import java.io.Serializable;
import java.util.Date;

/**
 * A Transaction object that is made from a donation, copying the card number
 * and amount to donate. The Transaction also has a Date object recorded at time
 * of creation.
 *
 */
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	private long creditCard;
	private double amount;
	private Date date;

	/**
	 * Creates a new transaction based off a provided donation and the current date
	 * and time.
	 * 
	 * @param donation The donation, or the credit card and amount to be charged to
	 *                 the card, to be made a transaction
	 */
	public Transaction(Donation donation) {
		creditCard = donation.getCreditCard();
		amount = donation.getAmount();
		date = new Date();
	}

	/**
	 * Returns the credit card associated with the transaction
	 * 
	 * @return The credit card associated with the transaction
	 */
	public long getCreditCard() {
		return creditCard;
	}

	/**
	 * Returns the amount that was charged to the credit card at the time of the
	 * transaction
	 * 
	 * @return The amount charged to the credit card at the time of transaction
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * The time and date of when the transaction occured.
	 * 
	 * @return The time and date of when the transaction occured.
	 */
	public Date getDate() {
		return date;
	}
}
