import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wiedzmin wiedzmin1=new Wiedzmin("John", "medium",250, 300,false);
        System.out.println("Welcome in the new game Witcher.");
        System.out.println("Name of your Witcher: "+wiedzmin1.getName());
        System.out.println("Hero Class of your Witcher: "+wiedzmin1.getHeroClass());
        System.out.println("Strength points of your Witcher: "+wiedzmin1.getStrengthPoints());
        System.out.println("Many point of your Witcher: "+wiedzmin1.getManyPoints());
        System.out.println("Impact strike of your Witcher: "+wiedzmin1.strengthPointsPerSecond());
        System.out.println("New character: "+wiedzmin1.getOldOrNewHero());
        System.out.println("Would you like to create a new character (true/false): ");
        Scanner scanner=new Scanner(System.in);
        boolean character=scanner.nextBoolean();
        if(character==false){
            System.out.println("Welcome to the game :) Have a nice time and enjoyed :)");
        }else{
            System.out.println("If you want to create a new hero please enter his Name below:");
            Scanner scanner1=new Scanner(System.in);
            String newName = scanner1.nextLine();
            wiedzmin1.setName(newName);
            System.out.println("Please enter the Class of the Hero below low/medium/high");
            String newHeroClass = scanner1.nextLine();
            wiedzmin1.setHeroClass(newHeroClass);
            System.out.println("Please enter the point of strength below: ");
            int newStrangth = scanner1.nextInt();
            wiedzmin1.setStrengthPoints(newStrangth);
            System.out.println("Please enter the many points for your Witcher below:");
            int newManyPoints = scanner1.nextInt();
            wiedzmin1.setManyPoints(newManyPoints);
            wiedzmin1.setOldOrNewHero(true);
            System.out.println("New character: "+wiedzmin1.getOldOrNewHero());
            System.out.println("You created a new character:\nName:"+newName+"; Class of Witcher: "+newHeroClass+"; Strength points of your Witcher: "+newStrangth+"; Many point of your Witcher: "+newManyPoints);
            System.out.println("Impact strike of your new character: "+(newStrangth*newManyPoints)/2);
        }


    }




}
