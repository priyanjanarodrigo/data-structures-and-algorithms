class LinearSearchDemo {
    public static void main(String[] args) {
        int[] numbers = { 12, 23, 43, 6, 67, 24, 12, 90, 1 };

        System.out.println("linearSearchNonRecursive execution");
        // Executing linearSearchNonRecursive method
        displayResult(linearSearchNonRecursive(12, numbers)); // Value found at index 0
        displayResult(linearSearchNonRecursive(24, numbers)); // Value found at index 5
        displayResult(linearSearchNonRecursive(1, numbers)); // Value found at index 8
        displayResult(linearSearchNonRecursive(88, numbers)); // Value not found

        // Testing the validations by passing an empty array and by passing a null array
        displayResult(linearSearchNonRecursive(12, new int[] {})); // Value not found
        displayResult(linearSearchNonRecursive(88, null)); // Value not found

        System.out.println("\nlinearSearchRecursive execution");
        // Executing linearSearchRecursive method
        displayResult(linearSearchRecursive(12, numbers,0)); // Value found at index 0
        displayResult(linearSearchRecursive(24, numbers,0)); // Value found at index 5
        displayResult(linearSearchRecursive(1, numbers,0)); // Value found at index 8
        displayResult(linearSearchRecursive(88, numbers,0)); // Value not found

        // Testing the validations by passing an empty array and by passing a null array
        displayResult(linearSearchRecursive(12, new int[] {},0)); // Value not found
        displayResult(linearSearchRecursive(88, null,0)); // Value not found
    }

    /**
     * evaluates the result index and displays the output. if the index is not
     * equals to -1, then the method displays the output as "Value found at index
     * <index>" (ex: Value found at index 5) or else displays the output "Value not
     * found".
     * 
     * @param resultIndex value to bde resolved (retunred output from linear
     *                    search).
     * @return (Nothing is returned (void) but displays the output on screen).
     */
    public static void displayResult(int resultIndex) {
        System.out.println((resultIndex != -1 ? "Value found at index " + resultIndex : "Value not found"));
    }

    /**
     * This method represents the non recursive implementation of linear search. It
     * searches for the specified key within the given array and returns the result
     * 
     * @param key value which is searched for.
     * @param array array to be searched for the existance of key.
     * @return int index in which the value is located at or -1 if the value is not
     *         available within the array.
     */
    public static int linearSearchNonRecursive(int key, int array[]) {
        // validates the 'array' to identify whether it is not null or has at least one element
        if (array != null && array.length > 0) {

            // loops through the array to search each index value and compares it with key
            for (int i = 0; i < array.length; i++) {
                if (key == array[i]) {
                    return i;
                }
            }
        }
        // returns -1 to indicate the key is not found in any index, if any of the above conditions are not satisfied
        return -1;
    }

    /**
     * This method represents the recursive implementation of linear search. It
     * searches for the specified key within the given array and returns the result.
     * 
     * This one line implementation can be implemented with multi line if else conditions as well
     * 
     * @param key   value which is searched for.
     * @param array array to be searched for the existance of key.
     * @param index parameter which is used to keep track of array indexes while
     *              recursion is in action.
     * @return int index in which the value is located at or -1 if the value is not
     *         available within the array.
     */
    public static int linearSearchRecursive(int key, int array[], int index) {
        return (array != null && array.length > 0 && index < array.length) ? (array[index] == key ? index : linearSearchRecursive(key, array, index += 1)) : -1;
    }
}