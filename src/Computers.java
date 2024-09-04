import Exceptions.InvalidComputerScreenException;
import Exceptions.InvalidComputerSsdException;

public class Computers {
    private String name;
    private int ssd;
    private double screen;
    public Computers(String name, int ssd, double screen){
        this.name = name;
        this.ssd = ssd;
        this.screen = screen;
    }

    public String getName() {
        return name;
    }
    public int getSsd(){
        return ssd;
    }
    public double getScreen(){
        return screen;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSsd(int ssd){
        if (ssd % 8 != 0) {
            throw new InvalidComputerSsdException("Wrong ssd format. It should be multiple 8");
        }
        this.ssd = ssd;
    }
    public void setScreen(double screen){
        if (screen != 15.7 && screen != 17.3){
            throw new InvalidComputerScreenException("We sale computers only with 15,7 or 17,3 screens");
        }
        this.screen = screen;
    }
    public String toString(){
        return "Computer " + name + ": SSD = " + ssd + ", Screen = " + screen;
    }
}
