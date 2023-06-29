package MiniProyecto1;

public class TestMiniProyecto {
	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			menu.empezar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}