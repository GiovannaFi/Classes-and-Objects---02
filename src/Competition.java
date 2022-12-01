public class Competition {
    public static void main(String[] args) {

        System.out.println("-------RULES-------");

        CompetitionRules theRules = new CompetitionRules();
        theRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Rosa";
        teamB.teamName = "Nero";

        teamA.p1.name = "Marco";
        teamA.p1.yearsOfExperience = 10;
        teamA.p1.programmingLanguage = "Java";

        teamA.p2.name = "Luca";
        teamA.p2.yearsOfExperience = 1;
        teamA.p2.programmingLanguage = "Javascript";

        teamB.p1.name = "Laura";
        teamB.p1.yearsOfExperience = 5;
        teamB.p1.programmingLanguage = "Kotlin";

        teamB.p2.name = "Clara";
        teamB.p2.yearsOfExperience = 4;
        teamB.p2.programmingLanguage = "Python";


        System.out.println("-------FIRST TEAM-------");
        teamA.printTeamDetails();
        System.out.println("-------SECOND TEAM-------");
        teamB.printTeamDetails();


    }
}
