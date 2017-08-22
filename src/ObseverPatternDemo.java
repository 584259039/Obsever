
public class ObseverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject ();
		new BinaryObsever(subject);
		new OctalObsever(subject);
		new HexaObsever(subject);
		new PlusTenObsever(subject);
		//15  F 1111 17
		
		System.out.println("First state change: 15");
		subject.setState(15);
		subject.setState(10);
	}

}
