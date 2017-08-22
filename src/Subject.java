import java.util.List;
import java.util.ArrayList;

public class Subject {
private List<Obsever> obs = new ArrayList <>();
private int state;

    public int getState (){
    	return state;
    }
    public void setState(int state){
    	this.state = state;
    	notifyAllObsever();
    }
    public void attach(Obsever obsever){
    	obs.add(obsever);
    }
    public void notifyAllObsever(){
    	for(Obsever obsever:obs ){
    		obsever.update();
    	}
    }
}
