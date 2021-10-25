public class ControlStructures {
    public static void main(String[] args) {

        int age= 16;
        boolean allowedByParents = false;

        if(age < 14) {
            System.out.println("Access to this site has been blocked!");
        } else if(age >= 14 && age <=19) {
            System.out.println("You are a teenie - congrats you have access to the majority of this website :)");
        } else if(age > 19 && age <= 150) {
            System.out.println("You are an adult - you have access to all features");
        } else {
            System.out.println("The age you entered obviously isn't valid - please enter a different age and try again.");
        }

        if(age > 14 || allowedByParents == true) {
            System.out.println("You are allowed to use this web application");
        }

        if(!allowedByParents) {
            System.out.println("Has not been allowed by parents");
        }

        if(!(age >= 13 && age <= 19)) {
            System.out.println("You are not a teenager anymore / not yet :)");
        }

        System.out.println("Program end");
    }
}
