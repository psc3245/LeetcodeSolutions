import Medium.K_Closest_Points_973.Solution;

public class Main {
    public static void main(String[] args) {
        int[][] case1 = { {0, 2}, {2, 0}, {2, 2} };
        int[][] sol1 = Solution.kClosest(case1, 2);
        System.out.println("Case 1: ");
        for (int[] arr : sol1) System.out.println(arr[0] + ", " + arr[1]);

        int[][] case2 = { {2, 3}, {0, 2}, {2, 2} };
        int[][] sol2 = Solution.kClosest(case2, 1);
        System.out.println("Case 2: ");
        for (int[] arr : sol2) System.out.println(arr[0] + ", " + arr[1]);


    }

}
