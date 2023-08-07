import java.util.*;
public class HelpVasillisa {

	
	
	
	public class Main {
	    static int r1, r2, c1, c2, d1, d2;
	    static Set<Integer> set = new HashSet<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        String[] input = scanner.nextLine().split(" ");
	        r1 = Integer.parseInt(input[0]);
	        r2 = Integer.parseInt(input[1]);

	        input = scanner.nextLine().split(" ");
	        c1 = Integer.parseInt(input[0]);
	        c2 = Integer.parseInt(input[1]);

	        input = scanner.nextLine().split(" ");
	        d1 = Integer.parseInt(input[0]);
	        d2 = Integer.parseInt(input[1]);

	        int result = solution();
	        if (result == 0) {
	            System.out.println("-1");
	        }
	    }

	    static int solution() {
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	                for (int e = 1; e <= 9; e++) {
	                    for (int f = 1; f <= 9; f++) {
	                        set.clear();
	                        set.add(i);
	                        set.add(j);
	                        set.add(e);
	                        set.add(f);
	                        if (set.size() == 4) {
	                            if (i + j == r1 && e + f == r2 && i + e == c1 && j + f == c2 && i + f == d1 && j + e == d2) {
	                                System.out.println(i + " " + j);
	                                System.out.println(e + " " + f);
	                                return 1;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return 0;
	    }
	}

	//time Complexity = 9(i) *9(j) * 9(e) * 9(f) 
    //time Complexity = o(6561)
    //Space Complexity = 4 (i) + 4 (j) + 4 (e) + 4 (f) + 16 (set) 
    //Space Complexity ≈ 32 bytes
}
