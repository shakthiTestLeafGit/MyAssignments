package Assignment5;

public class Automation extends MultipleLanguage implements TestTool{

	public static void main(String[] args) {
		
		Automation a1=new Automation();
		a1.Selenium();
		a1.Java();
		a1.python();
		a1.ruby();

	}

	public void Java() {
		// TODO Auto-generated method stub
		
		System.out.println("Selenium automation using Java");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium as a Testtool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
		System.out.println("Selenium automation using RubyOnRails");
		
	}

}
