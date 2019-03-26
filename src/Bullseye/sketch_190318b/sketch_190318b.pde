void setup() {
  size(400, 600);
  background(0, 225, 0);
}

void draw() {
  for (int x =300; x>0; x--) {


    if (x%50 < 25) {
       fill(#FF3434);
    } else {
      fill(#000000);
    }
    noStroke();
   
    ellipse(200,200,x,x);
  }
}
