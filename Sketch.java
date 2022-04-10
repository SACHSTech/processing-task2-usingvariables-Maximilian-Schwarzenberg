import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 500); // 400 , 400
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235); // Light blue
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    // Rectangle for grass
    fill(86, 125, 70); // Green
    rect(0, height-(height/4), width, height);
    
    // Base square for house
    fill(255, 248, 220); // White
    rect(width/4, height/4, width/2, height/2);

    // Triangle for Roof
    fill(170, 1, 20); // Red
    triangle(width/4, height/4, (width/4)+(width/2), height/4, width/2, height/16);

    // Rectangle for door
    fill(196, 164, 132); // Light brown
    rect(width/2, (height-(height/4))-height/4, width/8, height/4);

    // Circle for sun
    fill(255, 233, 0); //Yellow
    ellipse(width/10, height/10, width/10, width/10);
  }
  
  // define other methods down here.
}