
public class TestGit {
	
	private AutreTestGit autreTestGit;
	
	public TestGit(String name){
		new AutreTestGit(name);
		System.out.println("First change.");
	}

	public static void main(String[] args) {
		TestGit test = new TestGit("fred");
	}

}
