public class Main {
    public static void main(String[] args){

        //Conditionals --> If/else
        /* if (condition) { code } else { code }*/

        boolean isMale = true;

        //To illustrate that the code is executed step-by-step or line-by-line
        System.out.println("Before if");
        if (isMale) { //Banda ghode par chadhkar gya RAM mei aur location se value bag mei bharkar laaya
            System.out.println("User is male");
        } else {
            System.out.println("User is female");
        }
        System.out.println("After if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if(isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else {
            if (isAnAdult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("Hello Child");
            }
        }

        boolean hasTea = false;
        boolean hasCoffee = true;

        //if-else ladder
        if(hasTea){
            System.out.println("Bring Tea");
        } else if (hasCoffee){
            System.out.println("Bring Coffee");
        } else {
            System.out.println("Poor boy, Bring water");
        }

    }
}