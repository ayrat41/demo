package box;

public class box {	
	static box v = new box();
	public static int vol = v.boxvol(10, 10, 10);
	
int boxvol (int x, int y, int z) {
		int vol=x*y*z;
		return vol;
}
}
