package partial_exam;

public class Combinations2 {


		public static void main(String[] args) {
			Combinations2 combinations = new Combinations2();
			int n = 3;
			System.out.println("# Ladder's steps: " + n);
			System.out.println("# Step combinations: " + combinations.countCombinations(n, 0));
		}

		public long countCombinations(int n, int level) {
			if (n < 0) {
				return 0;
			}
			if (n == 0 && level == 0) {
				return 0;
			}
			if (n == 0 && level > 0) {
				return 1;
			}
			for (int i = n; i < n; --i) {
			    System.out.println(i);
			   return countCombinations(n - 1, level + 1);
			    
			}
			
			return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
					+ countCombinations(n - 3, level + 1);
		}
	}

// 3  4  5   6
// 4, 7, 13, 24 