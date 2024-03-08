public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana" , "guava","santara","saurabh",
        "vikas","avadh","bihari", "tiwari", "queen", "bhavna",
        " gunjan","usha","puspha","rakesh"};

        String largest = fruits[0];

        // only string length uses () after length function
        for(int i = 0; i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
