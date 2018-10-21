package leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author smajsterek on 21.10.2018
 */
class NextPermutationTest {

    @Test
    void nextPermutation() {
        NextPermutation np = new NextPermutation();
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 5}, np.nextPermutation(new int[]{1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[]{2, 1, 3, 4, 5, 6}, np.nextPermutation(new int[]{1, 6, 5, 4, 3, 2}));
        assertArrayEquals(new int[]{1, 5, 8, 5, 1, 3, 4, 6, 7}, np.nextPermutation(new int[]{1, 5, 8, 4, 7, 6, 5, 3, 1}));
        assertArrayEquals(new int[]{5, 1, 1}, np.nextPermutation(new int[]{1, 5, 1}));

    }

    @Test
    void doAllPermutations() {
        NextPermutation np = new NextPermutation();
        int[] first = {1, 2, 3, 4, 5, 6};
        int[] last = {6, 5, 4, 3, 2, 1};
        int[] current = {1, 2, 3, 4, 5, 6};
        for(int i = 1; i < 720; i++){
            current = np.nextPermutation(current);
        }
        // After 719 iterations we should have generated the last permutation
        assertArrayEquals(last, current);
        // Next method call should bring us to the beginning of the sequence
        current = np.nextPermutation(current);
        assertArrayEquals(first, current);
    }
}