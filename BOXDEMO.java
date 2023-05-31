//this is a Box class.
class Box 
{
	double db_width;
	double db_height;
	double db_depth;
}

//this class declares an object of type Box.
class BOXDEMO 
{
	public static void main(String[] args) 
	{	
		Box mybox = new Box();
		double db_vol;
		
		//assigning values to mybox's instance variables.
		mybox.db_width = 10;
		mybox.db_height = 20;
		mybox.db_depth = 15;
		
		//compute volume of box.
		db_vol = mybox.db_width * mybox.db_height * mybox.db_depth;
		
		System.out.println("Volume is "+db_vol+" cubic units.");
	}
}