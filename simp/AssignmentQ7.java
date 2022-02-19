package simp;
import java.util.Scanner;
public class AssignmentQ7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] array = new int[15];
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < 15; i++) {

				array[i] = sc.nextInt();
			}
			int n = array.length;
			int x = 1;
			if (array[n - 1] == x)
				System.out.println("Found ");

			int backup = array[n - 1];
			array[n - 1] = x;

			for (int i = 0;; i++) {

				if (array[i] == x) {

					array[n - 1] = backup;

					if (i < n - 1)
						System.out.println("Found ");

					// else not present in the array
					System.out.println("Not Found ");
				}

			}
		}
	}
}
