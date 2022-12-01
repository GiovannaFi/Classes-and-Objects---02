public class Team {
    public String teamName;

    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println("This team is called: " + teamName);
        System.out.println(p1.name + " has " + p1.yearsOfExperience + " year of experience with " + p1.programmingLanguage);
        System.out.println(p2.name + " has " + p2.yearsOfExperience + " year of experience with " + p2.programmingLanguage);
    }
}
