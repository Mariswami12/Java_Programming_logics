package Patterns;
public class Mix_Pattern {
public static void main(String[] args) throws InterruptedException {
	for (int i = 0; i <= 5; i++) {
		for (int j = 5; j >=0; j--) {
			Thread.sleep(300);
			if(i>=j){
				System.out.print("* ");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

for (int i = 5; i >= 0; i--) {
	for (int j = 5; j >=0; j--) {
		Thread.sleep(300);
		if(i>=j){
			System.out.print("* ");
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println();
    }
   }
  }

