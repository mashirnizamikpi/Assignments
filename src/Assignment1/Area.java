package Assignment1;

public class Area {
	
	int height;
	int width;
	int perimeter;
	float area;
	
	public Area() {
		area=0;
	}

	public Area(int height)
	{
		this.height=height;
	}
	public Area(int height,int width)
	{
		this.height=height;
		this.width=width;
	}

void disp()
{
	System.out.println(area);
	System.out.println(perimeter);
}
@SuppressWarnings("unused")
public static void main(String[] args) {
    Area obj1 = new Area(2,5);
    Area obj2 = new Area(3,6);
    Area obj3 = new Area(4,7);
    Area obj = new Area(6,9);
    Area pr  = new Area(11,12);
   
}

}
