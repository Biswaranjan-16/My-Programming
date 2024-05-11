
package practice;
class Day{
public static void main(String args[]){
int day=3;
String dayType;
String dayString;
	switch(day){
		case 1:
			dayString="monday";
			break;
		case 2:
			dayString="tuesday";
			break;
		case 3:
			dayString="wednesday";
			break;
		case 4:
			dayString="thrusday";
			break;
		case 5:
			dayString="friday";
			break;
		case 6:
			dayString="satarday";
			break;
		case 7:
			dayString="sunday";
			break;
		default:
			dayString="invalid";

		}



switch(day){
case 1:
case 2:
case 3:
case 4:
case 5:
	dayType="weekday";
	break;
case 6:
case 7:
	dayType="weekend";
	break;
default:
dayType="invalid dayType";
}
System.out.println (dayString +" is a "+ dayType);
}

}