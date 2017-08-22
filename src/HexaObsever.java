
public class HexaObsever extends Obsever {
	public HexaObsever(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	
	public void update(){

    	System.out.println("Hexa String:"
    +Integer.toHexString(subject.getState()));
}


	}

