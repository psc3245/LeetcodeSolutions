import Medium.Top_K_Freq_Elem_347.Solution;

public class Main {
    public static void main(String[] args) {

        int[] case1 = {1,1,1,2,2,3};
        int[] sol = Solution.topKFrequent(case1, 2);

        int[] case2 = {7, 7, 6};
        sol = Solution.topKFrequent(case2, 2);

        int[] case3 = {1};
        sol = Solution.topKFrequent(case3, 2);
    }


}
