public class Main {
	public static void main(String[] args) {
		double a = Double.longBitsToDouble(0x409DB822E6B4883EL);
		double b = Double.longBitsToDouble(0xC0882EF8192C761DL);
		double c = Double.longBitsToDouble(0x405976E3A6223F14L);
		double d = Double.longBitsToDouble(0xC01375783F18F53AL);
		double e = Double.longBitsToDouble(0x3FB110944E7E4E42L);
		double f = Double.longBitsToDouble(0xBF2D05AFF955340AL);
		int g = 69, h,i;
		while (g > 0) System.out.print((char)((0x69 % 10*2) * ((1 << 3) + 2) + (g = (int)(g*b+a + (h=g*g)*(g*d+c)+e*(i=h*h) + f*i*g)) % (1 << 4) - 4));
	}
}
