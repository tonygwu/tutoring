import acm.program.ConsoleProgram;

public class CanDrive extends ConsoleProgram {
	
	@Override
	public void run() {
		String name = readLine("Enter your name: ");
		int age = readInt("Enter your age: ");
		if (age >= 16) {
			println(name + " can drive.");
		} else {
			println(name + " can't drive.");
		}
	}
}
