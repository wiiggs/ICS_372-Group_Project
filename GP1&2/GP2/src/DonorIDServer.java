
/**
 * 
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010
 
 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - the use is for academic purpose only
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Neither the name of Brahma Dathan or Sarnath Ramnath
 *     may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.  
 */

/**
 * This class makes use of MemberIDServer by Dathan, and Ramnath adaptations and additions made by 
 * @author Brodsky R, Schreifels J, Vang J, Weigel A
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Generates member ids.
 * 
 * @author Brahma Dathan and Sarnath Ramnath
 *
 */
@SuppressWarnings("serial")
public class DonorIDServer implements Serializable {
	private int idCounter;
	private static DonorIDServer server;

	/*
	 * Private constructor for singleton pattern
	 * 
	 */
	private DonorIDServer() {
		idCounter = 1;
	}

	/**
	 * Supports the singleton pattern
	 * 
	 * @return the singleton object
	 */
	public static DonorIDServer instance() {
		if (server == null) {
			return (server = new DonorIDServer());
		} else {
			return server;
		}
	}

	/**
	 * Getter for id
	 * 
	 * @return id of the member
	 */
	public int getId() {
		return idCounter++;
	}

	/**
	 * String form of the collection
	 * 
	 */
	@Override
	public String toString() {
		return ("IdServer" + idCounter);
	}

	/**
	 * Retrieves the server object
	 * 
	 * @param input inputstream for deserialization
	 */
	public static void retrieve(ObjectInputStream input) {
		try {
			server = (DonorIDServer) input.readObject();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception cnfe) {
			cnfe.printStackTrace();
		}
	}

}