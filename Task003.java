// 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class Task003 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,2,3};
        int val = 3;

        int []ans = permutation(arr, val);
        for(int i = 0; i < arr.length; i++)
        System.out.print(ans[i] + " ");
    }

    public static int[] replacement (int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] permutation (int []arr, int val) {
        int i = 0;
        int j = arr.length - 1;
        while (i<j) {
            while (i < j && arr[j]==val){
                j--;
            }
            if (arr[i]==val){
                replacement(arr, i,j);
                i++;
            }
        }
        return arr;

    }


    }
