
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int macks = nums .stream() .mapToInt(v -> v) .max() .orElseThrow();
        int mynn = nums .stream() .mapToInt(v -> v) .min() .orElseThrow();
        return macks - mynn;
    }

    }
