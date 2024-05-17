package test;

class Rectangular extends Shape{
	int height;
	int width;
	Rectangular(int height,int width){
		this.height=height;
		this.width=width;
	}	
	double calculatearea() {

		return height*width;
	}
	double calculateperimeter() {

		return 2*(height + width);
	}
}

