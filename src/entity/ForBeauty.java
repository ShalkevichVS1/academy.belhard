package entity;

import java.util.Scanner;

public class ForBeauty {

    public static int vvodDannx = 0;



    public static String scanner (){
        ForBeauty.prcesRegestr();
        Scanner canner  = new Scanner(System.in);
        String consol = canner.nextLine();
        vvodDannx++;
        return consol;
    }

    public static void prcesRegestr(){
        switch (vvodDannx){
            case 0:
                System.out.print("Зарегестрируйтесь\n" + "Введите Имя: ");
                break;
            case 1:
                System.out.print("Введите Фамилию: ");
                break;
            case 2:
                System.out.print("Введите Email: ");
                break;
            case 3:
                System.out.print("Введите Пороль: ");
                break;

        }

    }
}
