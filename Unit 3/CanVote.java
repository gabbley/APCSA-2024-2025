public class CanVote {

    public static void main(String[] args) {
        /* Must be 18 by November 5, 2024, a US Citizen, a resident of VA, never convicted of a crime, of sound mind*/

        boolean hasBeenConvicted = false, isOfSoundMind = true;
        String citizenship = "USA", residency = "VA";
        int age = 18;

        // call the method using the above values as actual parameters


    }

    public static boolean canVote(int age, String citizenship, String residency, boolean hasBeenConvicted, boolean isOfSoundMind) {
        boolean result = false;

        if (age >= 18) {
            if (citizenship.equals("USA") || citizenship.equals("The United States of America")) {
                if (residency.equals("VA") || residency.equals("Virginia")) {
                    if (!hasBeenConvicted) {
                        if (isOfSoundMind) {
                            result = true;
                        }
                    }
                }
            }
        }
        return result;

        // Comment all of the code above. Below this line, rewrite this method so that it only contains one line of code.
    }
}