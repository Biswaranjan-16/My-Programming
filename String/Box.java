package String;

class Box {
double height;
double width;
double depth;


public Box(double h, double w, double d) {
	height=h;
	width=w;
	depth=d;
}

public String toString() {
	return "dimensions are "+height+" by "+width+" by "+depth;
}}

