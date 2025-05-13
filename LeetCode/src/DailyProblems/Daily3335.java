package DailyProblems;

import java.util.Arrays;

/**
 * 3335. Total Characters in String After Transformations I
 */

class Solution3335 {
    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }
        for (int i = 0; i < t; ++i) {
            int temp = cnt[25];
            for (int j = 25; j >= 1; --j) {
                cnt[j] = cnt[j - 1];
            }
            cnt[0] = temp;
            cnt[1] = (cnt[1] + temp) % MOD;
        }
        int res = 0;
        for (int i = 0; i < 26; ++i) {
            res = (res + cnt[i]) % MOD;
        }
        return res;
    }
}

public class Daily3335 {
}
