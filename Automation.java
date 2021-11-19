package week3.day2assignments;

public class Automation extends MultipleLangauge{

	public void Java() {
		System.out.println("Java");
	}
	
	public void Selenium() {
		System.out.println("Selenium");
	}
	
	public static void main(String[] args) {
		
		Automation aut = new Automation();
		aut.Java();
		aut.Selenium();
		aut.python();
		aut.ruby();
		
			
		}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

}
