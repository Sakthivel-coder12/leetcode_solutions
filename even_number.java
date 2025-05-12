import java.util.*;

class even_number {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> ss = new HashSet<Integer>();
        int n = digits.length;
        int d1 = 0, d2 = 0, d3 = 0;

        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) {
                            continue;
                        }

                        d1 = digits[i];
                        d2 = digits[j];
                        d3 = digits[k];

                        int aa = d1 * 100 + d2 * 10 + d3;

                        if (d1 != 0 && aa % 2 == 0) {
                            ss.add(aa);
                        }
                    }
                }
            }
        }
        int ans[] = new int[ss.size()];
        int i = 0;
        for (int val : ss) {
            ans[i++] = val;
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String args[]) {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ni.nextInt();
        }
        even_number s = new even_number();
        int[] res = s.findEvenNumbers(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}