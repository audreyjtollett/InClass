public class Angle{
	private double radians;


	//CONSTRUCTORS
	public Angle(double r){
		radians = r;
		recenter();
	}
	//can also overload constructors aka no-argument constructor (default in other languages)
	//but what if you reaaallly want two constructors that have the same argument?
	public Angle(){
		radians = 0;
	}
	/*public Angle(double deg){  //another double, java can't differentiate
		radians = deg*Math.PI/180;
		recenter();
	}*/
	//Static!!! everything we have done so far is non-static...aka requires an instance
	//Static fields do not require instances and belong to the class


	//HELPERS
	private void recenter() { //helper function! can make private for careful sutff
		while(radians>2*Math.PI){
			radians -= 2*Math.PI;
		}
		while(radians<0){
			radians += 2*Math.PI;
		}
	}


	//METHODS
	public double getRadians() {
		return radians;
	}
	public void setRadians(double newRad) {
		radians = newRad;
		recenter();
	}

	public double getDegrees() {
		return radians * (180 / Math.PI);
	}
	public void setDegrees(double newDeg) {
		radians = (newDeg * Math.PI / 180);
		recenter();
	}
	public Angle add(Angle other){
		return new Angle(this.radians + other.radians); //This is the thing to the left of the dot( this.whatever)
	}
	//METHOD OVERLOADING : can have multiple add methods as long as types or number of inputs are
	//different
	public Angle add(double some){
		return new Angle(this.radians + some);
	}
	//static add
	public static Angle staticAdd(Angle left, Angle right){
		return new Angle(left.radians + right.radians);
	}

}

class AngleTester {
	public static void main(String[] args) {
		Angle a = new Angle(7*Math.PI);
		Angle b = new Angle(Math.PI/4);

		Angle c = a.add(b);
		System.out.println(c.getRadians());

		Angle d = a.add(Math.PI);
		System.out.println(d.getRadians());
		
		Angle s = Angle.staticAdd(a,b);
		System.out.println(s.getRadians());

		Angle e = new Angle();
		System.out.println("E = " + e.getRadians());

		//a.recenter();
		System.out.println(a.getRadians());
		a.setRadians(9*Math.PI/4);
		System.out.println(a.getRadians());
	}
}
