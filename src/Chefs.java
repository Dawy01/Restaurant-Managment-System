public class Chefs {

    String chefName;
    int age;
    String [] certifications =new String[6];

    public void printChefsData(){
        System.out.println("Chef name: " + chefName);
        System.out.println("Age : " + age);
        System.out.print("Certifications: ");
        for (String certificate: certifications)
            System.out.print(certificate + " ");

    }
}
