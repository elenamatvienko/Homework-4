public class Main {
    public static void main(String[] args) {

        // Задание 1.1
        System.out.println("Задание 1.1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, тебе нужно немного подождать.");
        }

        // Задание 1.2
        System.out.println("Задание 1.2");
        int childAge = 7;
        if (childAge >= 7) {
            System.out.println("Ты можешь ходить в школу!");
        }
        if (childAge < 7) {
            System.out.println("Ты не можешь ходить в школу.");
        }
        int teenagerAge = 17;
        if (teenagerAge >= 18) {
            System.out.println("Ты уже закончил школу и можешь отправляться в университет!");
        }
        if (teenagerAge < 18) {
            System.out.println("Ты еще не закончил школу и не можешь отправляться в университет.");
        }
        int peopleAge = 24;
        if (peopleAge >= 24) {
            System.out.println("Ты уже окончил университет и тебе пора искать первую работу!");
        }
        if (peopleAge < 24) {
            System.out.println("Ты еще не окончил университет и тебе рано искать первую работу!");
        }

        // Задание 1.3
        System.out.println("Задание 1.3");
        int totalPlaceWagon = 102;
        int sittingPlaceWagon = 60;
        int standingPlaceWagon = totalPlaceWagon - sittingPlaceWagon;

        int sittingPlace = 60;
        int standingPlace = 42;
        if (sittingPlace < sittingPlaceWagon) {
            System.out.println("В вагоне есть еще " + (sittingPlaceWagon - sittingPlace) + " сидячих мест!");
        }
        if (sittingPlace == sittingPlaceWagon) {
            System.out.println("В вагоне нет сидячих мест.");
        }
        if (standingPlace < standingPlaceWagon) {
            System.out.println("В вагоне есть еще " + (standingPlaceWagon - standingPlace) + " стоячих мест!");
        }
        if (standingPlace == standingPlaceWagon) {
            System.out.println("В вагоне нет стоячих мест.");
        }

        // Задание 2.1
        System.out.println("Задание 2.1");
        int agePer = 17;
        if (agePer >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, тебе нужно немного подождать.");
        }

        // Задание 2.2
        System.out.println("Задание 2.2");
        int ageChild = 7;
        if (ageChild >= 7) {
            System.out.println("Ты можешь ходить в школу!");
        } else {
            System.out.println("Ты не можешь ходить в школу!");
        }
        int ageTeenager = 17;
        if (ageTeenager >= 18) {
            System.out.println("Ты уже закончил школу и можешь отправляться в университет!");
        } else {
            System.out.println("Ты еще не закончил школу и не можешь отправляться в университет.");
        }
        int agePeople = 24;
        if (agePeople >= 24) {
            System.out.println("Ты уже окончил университет и тебе пора искать первую работу!");
        } else {
            System.out.println("Ты еще не окончил университет и тебе рано искать первую работу!");
        }

        // Задание 2.3
        System.out.println("Задание 2.3");
        int totalPlaceWag = 102;
        int sittingPlaceWag = 60;
        int standingPlaceWag = totalPlaceWagon - sittingPlaceWagon;

        int sitPlace = 60;
        int standPlace = 42;
        if (sitPlace < sittingPlaceWag) {
            System.out.println("В вагоне есть еще " + (sittingPlaceWag - sitPlace) + " сидячих мест!");
        } else {
            System.out.println("В вагоне нет сидячих мест.");
        }
        if (standPlace < standingPlaceWag) {
            System.out.println("В вагоне есть еще " + (standingPlaceWag - standPlace) + " стоячих мест!");
        } else {
            System.out.println("В вагоне нет стоячих мест.");
        }

        // Задание 3.1
        System.out.println("Задание 3.1");
        int yearsOld = 25;
        if (yearsOld >= 2 && yearsOld < 6) {
            System.out.println("Если возраст человека равен " + (yearsOld) + " то ему нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Если возраст человека равен " + (yearsOld) + " то ему нужно ходить в школу.");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Если возраст человека равен " + (yearsOld) + " то его место в университете.");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + (yearsOld) + " то ему пора ходить на работу.");
        }

        // Задание 3.2
        System.out.println("Задание 3.2");
        int year = 22;
        if (year < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (year < 14) {
            System.out.println("Ребенок может кататься на аттракционе c родителями.");
        } else {
            System.out.println("Ребенок может кататься на аттракционе.");
        }

        // Задание 3.3
        System.out.println("Задание 3.3");
        int one = 3;
        int two = 3;
        int three = 3;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
            }else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
            }else if (one > three) {
                if (two >= three) {
                    System.out.println("Максимальное число - " + two);
                } else if (three > one ) {
                    System.out.println("Максимальное число - " + three);
                    }
                } else {
            System.out.println("Все три числа равны");
                }

        }
    }



