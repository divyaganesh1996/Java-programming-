package day12;

public class BoxConstructor {
	
	double width,height,depth;
	
	BoxConstructor()
	{
		/*width = 0;
		height = 0;
		depth = 0;*/
		
		width = height= depth = 0;
	}
	
	BoxConstructor(double w, double h, double d)
		{
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return(width*height*depth);
	}

}
