int xPosition = 100;
int yPosition = 100;
int rectWidth = 100;
int rectHeight = 100;
int r = 100;
int g = 100;
int b = 100;

void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  // background(255);
  stroke(0);
  fill(r, g, b);
  rect(xPosition, yPosition, rectWidth, rectHeight);
  fill((int) random(0, 255), (int) random(0, 255), (int) random (0, 255));
  ellipse(mouseX + (int) random(-30, 30), mouseY + (int) random(-30, 30), 10, 10)
}

  void mousePressed() {
    r = (int) random (0, 255);
    g = (int) random (0, 255);
    b = (int) random (0, 255);
    background(255);
    xPosition = (int) random (0, 400);
    yPosition = (int) random (0, 400);
    rectWidth= (int) random (50, 400);
    rectHeight = (int) random (50, 400);
    }