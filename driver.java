public class driver {
	public static void main(String[] args){
		Kubus kubus1 = new Kubus();
		double rusuk = 5;
		double a = kubus1.luasPermukaan(rusuk);
		double rusuk2 = 7;
		double b = kubus1.volume(rusuk2);
		
		System.out.println(a);
		System.out.println(b);
	}
}