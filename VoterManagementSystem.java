public class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Varun Kumar", 30);
            System.out.println("Voter ID: " + voter1.getVoterID());
            System.out.println("Name: " + voter1.getName());
            System.out.println("Age: " + voter1.getAge());

            Voter voter2 = new Voter(2, "Eshan kishan", 11);
            System.out.println("Voter ID: " + voter2.getVoterID());
            System.out.println("Name: " + voter2.getName());
            System.out.println("Age: " + voter2.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
