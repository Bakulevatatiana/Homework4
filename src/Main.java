public class Main {
    public static void main(String[] args) {
        System.out.println("//Задание1.1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        System.out.println("//Задание1.2");
        int age1 = 90;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("//Задание1.3");
        int passenger = 10;
        int totalSeats = 120;
        int seatPlace = 60;
        if (passenger <= 60) {
            System.out.println("Есть сидячее место.");
        }

        if (passenger <= 120) {
            System.out.println("Есть стоячее  место.");
        }

        if (passenger > 120) {
            System.out.println("мест нет.");
        }
        System.out.println("//Задание2.1");
        int age3= 19;
        if (age3 >= 18) {
            System.out.println("Поздравляем с совершенолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        System.out.println("//Задание 2.2");
        int age2 =90;
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок не ходит в школу");
            if (age2 >= 18) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("Человек не закончил школу");
            }
            if (age2 >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            } else {
                System.out.println("Человек не окончил унивестит.");
            }
            System.out.println("//Задание 2.3");
            int passenger1 = 1000;
            int totalSeats1 = 102;
            int seatPlace1 = 60;
            if (passenger1 <=seatPlace1 ) {
                System.out.println("Есть сидячее место.");
            } else {
                System.out.println(" Сидячие места закончились.");
            }

            if (passenger1 <=totalSeats1 ) {
                System.out.println("Есть стоячее  место.");
            }
            else {
                System.out.println( "Мест нет.");


//Задание 3.1
        int personAge = 23;
        boolean needToGoToKindergarten= personAge >=2 &&  personAge<7;
        boolean needToGoToSchool= personAge>=7 && personAge<18;
        boolean needToGoToUniversity= personAge >=18 && personAge<24;
        boolean needToGoToWork= personAge>24;
        if(needToGoToKindergarten){
            System.out.println("Если возраст человека равен "+personAge+ ",то ему нужно ходить в детский сад.");}
        else if (needToGoToSchool){
                System.out.println("Если возраст человека равен "+personAge+ ",то ему нужно ходить в школу.");}
               else if(needToGoToUniversity){
            System.out.println("Если возраст человека равен "+personAge+ ",то ему нужно ходить в университет.");}
        else if(needToGoToWork){
            System.out.println("Если возраст человека равен "+personAge+ ",то ему нужно ходить на работу.");}
        int childAge= 4;

        //Задание 3.2
        boolean canNotRide=childAge <5;
        boolean canRideWithAnAdult=childAge>=5 &&childAge<14;
        boolean canRideWithoutAnAdult= childAge>=14;
        if(canNotRide){
            System.out.println("Если возраст ребенка равен "+childAge+ ", то ему нельзя кататься на аттракционах" );}
            else if(canRideWithAnAdult){
                System.out.println("Если возраст ребенка равен "+childAge+ ", то ему можно кататься на аттракционах при сопровождении взрослого" );}
                else if(canRideWithoutAnAdult) {
                    System.out.println  ("Если возраст ребенка равен "+childAge+ ", то ему можно кататься на аттракционах без сопровождения взрослого" );}
                //Задание 3.3
        int one=1;
        int two=6;
        int free=2;
        if (one>two&&one>free){
            System.out.println(one+ "большее число");}
            else if(two>one && two>free) {System.out.println( two + " большее число");}
        else if(two>one && two>free) {System.out.println( two + " большее число");}
        else if(free>one && free>two) {System.out.println( free + " большее число");}
        
    }
}}}





