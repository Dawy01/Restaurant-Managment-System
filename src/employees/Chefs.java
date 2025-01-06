package employees;

public class Chefs {

    private String chefName;
    private int age;
    private String [] certifications;

    public void printChefsData(){
        System.out.println("Chef name: " + chefName);
        System.out.println("Age : " + age);
        System.out.print("Certifications: ");
        for (String certificate: certifications)
            System.out.print(certificate + " ");

    }

    public Chefs(String chefName, int age, String [] certifications){
        this.chefName=chefName;
        this.age=age;
        this.certifications=certifications;
    }

    public String getchefName(){
        return chefName;
    }

    public void setChefName(String chefName){
        this.chefName=chefName;
    }

    public String [] getCertifications(){
        return certifications;
    }

    public void setCertifications(String [] certifications){
        this.certifications=certifications;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }




}
