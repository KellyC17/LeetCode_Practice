public class twoPointers {
    public static void main(String args[] ) throws Exception {      
        

    }
    //167
    public int[] twoSumII(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2]; 
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
            if (numbers[i] + numbers[j] > target){
                j--;
            }
            if (numbers[i] + numbers[j] < target){
                i++;
            }
        }
        return null;
    }




}