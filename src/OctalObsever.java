
public class OctalObsever extends Obsever {
	public OctalObsever(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	
	public void update(){

    	System.out.println("Octal String:"
    +Integer.toOctalString(subject.getState()));
}


	}


