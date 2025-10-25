    package w3;

    public class MainLab {
        public static void main(String[] args) {
            // Find the sum of a numbers in an array with a recursive func.
            int nums[] = {1,2,3,4,5};
            System.out.println(recSum(nums, 0, nums.length));
        }

        int iterSum(int []nums){
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
                sum = sum + nums[i];
            return sum;
        }

        /*
        The summation of a list of numbers L is 0 if
        L has no elements, otherwise the summation of L
        is first element of L added to summation of
        the remaining elements of L.

        fact(0) = 1
        fact(n) = n * fac(n-1)

        sum([]) = 0 -> empty list
        sum([H|T]) = H + sum(T) -> H => Head, T => Tail. Prolog language a very high level language.
        [H|T] = [5]
        */
        static int recSum(int []nums, int i, int size){
            if(i == size)
                return 0;
            return nums[i] + recSum(nums, i + 1, size);
        }
    }



