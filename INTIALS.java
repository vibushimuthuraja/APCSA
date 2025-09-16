import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(2);
    
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!

	//hi
    Robot r = new Robot(4,1,East,10);
    Robot r1= new Robot(4,6,East,10);
   
    r1.turnLeft();
    r1.turnLeft();
    r1.turnLeft();
    r1.putBeeper();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.putBeeper();
    r1.turnLeft();
    r1.turnLeft();
    r1.move();
    r1.move();
    r1.move();
    r1.turnLeft();
    r1.turnLeft();
    r1.turnLeft();
    r1.move();
    r1.turnLeft();
    r1.turnLeft();
    r1.turnLeft();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.turnLeft();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.turnLeft();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.turnLeft();
    r1.turnLeft();
    r1.turnLeft();
    r1.move();
    r1.turnLeft();
    r1.turnLeft();
    r1.turnLeft();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.putBeeper();
    r1.move();
    r1.putBeeper();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
	  
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
  }

}
