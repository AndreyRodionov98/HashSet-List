import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("===========Task1================");

         Map<Product,Integer>foodBusket=new HashMap<>();
        Product A =new Product("банан",30,250);
        Product C =new Product("киви",23,430);
        Product D =new Product("яйца",23,300);
        Product E =new Product("помидоры",23,450);
        Product F =new Product("картофель",23,450);
        Product G =new Product("сыр",23,450);
        Product H =new Product("огурцы",23,450 );

        foodBusket.put(A, 12);
        foodBusket.put(D, 234);
        foodBusket.put(E, 123);
        foodBusket.put(F, 223);
        foodBusket.put(G, 123);
        //foodBusket.containsKey(C);
        //foodBusket.containsKey(D);
        foodBusket.remove(H);
        System.out.println(foodBusket.toString());


        System.out.println("\n===========Task2================");

        Set<Recipe> allRecipe = new HashSet<>();

        Recipe salad=new Recipe("салат");
    Recipe vegetable=new Recipe("овощная нарезка");
    Recipe fruits=new Recipe("фруктовая  нарезка");

        salad.addProductInRecipe(F);
        vegetable.addProductInRecipe(E);
        fruits.addProductInRecipe(H);
        salad.addRecipeInSet(allRecipe);
        vegetable.addRecipeInSet(allRecipe);
        fruits.addRecipeInSet(allRecipe);
        System.out.println(allRecipe.toString());


        System.out.println("\n===========Task3================");


        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);

        }
        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);


        System.out.println("\n===========Task5================");


        int[][] mas = new int[15][3];
        for (int i = 0; i < mas.length; i++) {
            for (int h = 0; h < mas[i].length; h++) {
                mas[i][h] = (int) (Math.random() * 8) + 2;
                if (h == mas[i].length - 1) {
                    mas[i][h] = mas[i][h - 2] * mas[i][h - 1];
                    for (int q = 0; q < i; q++) {
                        if (mas[i][h] == mas[q][h]) {
                            if (mas[i][h - 1] == mas[q][h - 1] || mas[i][h - 2] == mas[q][h - 2]) --i;

                        }

                    }
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Задание № " + (i + 1 + " умножить"));
            for (int h = 0; h < mas[i].length; h++) {
                if (h == 0) {
                    System.out.print(mas[i][h] + " на ");
                    if (h == 1) {
                        System.out.print(mas[i][h]);
                    }
                }

            }

        }


        System.out.println("\n===========Task6================");

        Pasport pasportOne = new Pasport(
                42233234233L,
                "Петров",
                "Петр",
                "Петрович",
                "02.03.1999");

        Pasport pasportTwo = new Pasport(
                42233239383L,
                "Васильев",
                "Василий",
                "Васильевич",
                "11.08.1987");
        Pasport pasportThree = new Pasport(
                98833234233L,
                "Семенов",
                "Семен",
                "Семенович",
                "11.11.1978");
        Pasport pasportFour = new Pasport(
                47863234233L,
                "Гримов",
                "Григорий",
                "Григорьевич",
                "12.04.1965");
        Pasport pasportFive = new Pasport(
                36733234233L,
                "Данилов",
                "Данил",
                "Данилович",
                "10.09.1976");
        HashMap<Long, Pasport> pasportMap = new HashMap<>();
        pasportMap.put(pasportOne.getNumPassport(), pasportOne);
        pasportMap.put(pasportTwo.getNumPassport(), pasportTwo);
        pasportMap.put(pasportThree.getNumPassport(), pasportThree);
        System.out.println(pasportMap);
        pasportMap.put(pasportFour.getNumPassport(), pasportFour);
        pasportMap.put(pasportFive.getNumPassport(), pasportFive);
        System.out.println(pasportMap);


        System.out.println(pasportMap.get(566353364L));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Мария", "89521032379");
        phoneBook.addContact("Дмитрий", "89513432374");
        phoneBook.addContact("Тимур", "89521542375");
        phoneBook.addContact("Григорий", "89521032468");
        System.out.println(phoneBook);
        phoneBook.removeContact("Мария");
        System.out.println(phoneBook);


    }
}