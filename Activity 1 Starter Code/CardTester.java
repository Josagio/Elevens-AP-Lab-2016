
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card jackOfClub = new Card("11","Club", 1);
		Card queenOfHeart = new Card("12","Heart",2);
		Card kingOfDiamond = new Card("13","Diamond",3);
	
		System.out.println(jackOfClub.printCard("Jack of Clubs"));
		System.out.println();
		System.out.println(queenOfHeart.printCard("Queen of Hearts"));
		System.out.println();
		System.out.println(kingOfDiamond.printCard("King of Diamonds"));
		System.out.println();
		
		//matching test
		System.out.println();
		System.out.println("%%%%%%%%%%%Matching Test%%%%%%%%%%%%");
		System.out.print("Jack of Clubs/King Of Diamonds: ");
		System.out.println(jackOfClub.matches(kingOfDiamond));
		System.out.print("Queen of Hearts/Queen Of Hearts: ");
		System.out.println(queenOfHeart.matches(queenOfHeart));
		System.out.println("------------------------------------");
		System.out.println();
	}
}
