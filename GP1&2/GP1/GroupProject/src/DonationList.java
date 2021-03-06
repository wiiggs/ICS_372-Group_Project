
/**
 * @author Brodsky R, Schreifels J, Vang J, Weigel A
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Container class for Donations for Donations.
 */
public class DonationList implements Iterable<Donation>, Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Donation> donations; // A list of all the donations

	/**
	 * Creates a new list of donations initially empty.
	 */
	public DonationList() {
		donations = new ArrayList<Donation>();
	}

	/**
	 * Adds a donation to the donations list
	 * 
	 * @param creditCard The number of the credit card to be added
	 * @param amount     The amount to be charged to the credit card.
	 */
	public void addDonation(Donation donation) {
		donations.add(donation);
	}

	/**
	 * Removes the first donation in the donations list with a matching credit card
	 * number.
	 * 
	 * @param creditCard The number of the credit card to remove.
	 */
	public void removeDonation(long creditCard) {
		donations.remove(new Donation(creditCard, 0));
	}

	@Override
	public Iterator<Donation> iterator() {
		return new DonationsIterator();
	}

	/**
	 * An implementation of Iterator for the DonationList class.
	 */
	private class DonationsIterator implements Iterator<Donation> {
		int counter;

		DonationsIterator() {
			counter = 0;
		}

		@Override
		public Donation next() {
			if (hasNext())
				return donations.get(counter++);
			return null;
		}

		@Override
		public boolean hasNext() {
			return counter < donations.size();
		}
	}
}
