package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /*4.Створіть метод, який дозволяє видаляти будь який елемент
    по індексу в одновимірному масиві int[]
    Новий масив повинен повертатися з методу.*/
    public int[] DeleteElement(int [] arr, int index)
    {

        if(index<0||index> arr.length)
        {
            return arr;
        }
        int[] arr1 = new int [arr.length-1];

        for(int j =0, y=0;j<arr.length;j++)
        {

            if(j==index)
            {
                continue;
            }
            else
            {
                arr1[y]=arr[j];
                y++;
            }
        }

        return arr1;


    }
    /*9. Створіть метод, який приймає параметр типу String, та шукає у його складі паліндроми(рядки букв,
    які однаково читаються у любому напрямку - приклад  йцууцй)Метод повинен повертати паліндром ,
    який має найбільшу довжину серед знайдених, якщо не знайдено ні одного, повертає пустий рядок "".
    Приклад при параметрі "qwertyolo" результат буде "olo".

    */

   /* public boolean isPolindrom(String str) {
        int len = str.length();
        int x=0;
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                x=0;
                return false;
            }
            x=1;
            return true;
        }
        return (x==1)?true:false;
    }

    public void getAllSubstr(String str)
    {
        List<String> lines = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length()-1; j--)
                {

                }
            }
        }

    public void iAmSuperman(String str)
    {
        List<String> lines = getAllSubstr(str);
        List<Integer> sizeAllPalindr=new ArrayList<>();
        List<String> lPalindr = new ArrayList<>();
        for(String temp:lines){
            if(isPolindrom(temp)){
                int sizeP=temp.length();
                lPalindr.add(temp);
                sizeAllPalindr.add(sizeP);
            }
        }
        int max = sizeAllPalindr.get(0);
        int index=0;
        for(int i =0;i<sizeAllPalindr.size();i++){
            if(sizeAllPalindr.get(i)>max){
                max= sizeAllPalindr.get(i);
                index=i;
            }
        }
        System.out.println(lPalindr.get(index));
    }
*/





    /*19. Створіть метод, який перевертає будь яке слово.
    Наприклад- на вході травень на виході ьневарт*/

    public  void Revers(String revers)
    {
        StringBuffer buffer = new StringBuffer(revers);
        buffer.reverse();
        System.out.println(buffer);

    }

    public String ReversMas(String str)
    {
        int x =str.length();
        char[] nReTemp = str.toCharArray();
        char[] reTemp = new char[nReTemp.length];
        for(int i = 0; i< str.length(); i++){
            reTemp[i]=nReTemp[x -1];
            x--;
        }
        String newReTemp = new String(reTemp);
        return newReTemp;
    }

    /*Створіть метод, який приймає будь-яку кількість масивів int[]
    та повертає найменше число яке є у складі цих масивів*/

    public int Min(int []...arr)
    {

        int min = arr[0][0];
        for(int i =0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];

                }
            }
        }
        System.out.print(min);
        return min;

    }
    //4 метода + - * / которые используют +
    public int Sum(int num_1, int num_2)
    {
        return num_1+num_2;
    }
    public  int Raz(int num_1, int num_2)
    {
        if(num_2>0) {
            String input = String.valueOf(num_2);
            String revor = "-" + input;
            int rev = Integer.parseInt(revor);
            return num_1 + rev;
        }
        else {
            String input = String.valueOf(num_2);
            StringBuffer revor = new StringBuffer(input);
            revor.delete(0,1);
            String revo = new String(revor);
            int rev = Integer.parseInt(revo);
            return num_1 + rev;
        }

    }
    public int Dob(int num_1, int num_2)
    {
        if(num_2>=0&&num_1>=0) {
            int dob = 0;
            for (int i = 0; i < num_2; i++) {
                dob += num_1;
            }
            System.out.println("1");
            return dob;

        }
        if(num_2<0&&num_1>0){
            String input = String.valueOf(num_2);
            StringBuffer revor = new StringBuffer(input);
            revor.delete(0,1);
            String revo = new String(revor);
            int rev = Integer.parseInt(revo);

            int dob = 0;
            for (int i = 0; i < num_1; i++) {
                dob += rev;
            }
            String dobu = String.valueOf(dob);
            String revo2 = "-" + dobu;

            int rev1 = Integer.parseInt(revo2);
            System.out.println("2");
            return rev1;
        }
        if(num_1<0&&num_2>0)
        {
            String input = String.valueOf(num_1);
            StringBuffer revor = new StringBuffer(input);
            revor.delete(0,1);
            String revo = new String(revor);
            int rev = Integer.parseInt(revo);

            int dob = 0;
            for (int i = 0; i < num_2; i++) {
                dob += rev;
            }
            String dobu = String.valueOf(dob);
            String revo2 = "-" + dobu;

            int rev1 = Integer.parseInt(revo2);
            System.out.println("3");
            return rev1;
        }
        else{
            String input = String.valueOf(num_2);
            StringBuffer revor = new StringBuffer(input);
            revor.delete(0,1);
            String revo = new String(revor);
            int rev = Integer.parseInt(revo);

            String input1 = String.valueOf(num_1);
            StringBuffer revor1 = new StringBuffer(input1);
            revor1.delete(0,1);
            String revo1 = new String(revor1);
            int rev1 = Integer.parseInt(revo1);

            int dob = 0;
            for (int i = 0; i < rev; i++) {
                dob += rev1;
            }


            System.out.println(rev1);
            System.out.println("4");
            return dob;
        }


    }

    /*public int VidDil(int num_1, int num_2)
    {

    }*/
    public int Dil(int num_1, int num_2)throws Exception
    {
            if (num_2 > 0 && num_1 > 0) {
                int first = num_1;
                int dil = 0;
                do {
                    first = Raz(first, num_2);
                    dil++;
                } while (first > 0);
                System.out.println("1");
                return dil;

            }
            if (num_1 > 0 && num_2 < 0) {
                String input = String.valueOf(num_2);
                StringBuffer revor = new StringBuffer(input);
                revor.delete(0, 1);
                System.out.println(revor);
                String revo = new String(revor);
                int rev = Integer.parseInt(revo);

                int first = num_1;
                int dil = 0;
                do {
                    first = Raz(first, rev);
                    dil++;
                } while (first > 0);
                String dobu = String.valueOf(dil);
                String revo2 = "-" + dobu;

                int rev1 = Integer.parseInt(revo2);
                System.out.println("2");
                return rev1;
            }
            if (num_1 < 0 && num_2 > 0) {
                String input = String.valueOf(num_1);
                StringBuffer revor = new StringBuffer(input);
                revor.delete(0, 1);
                String revo = new String(revor);
                int rev = Integer.parseInt(revo);

                int first = rev;
                int dil = 0;
                do {
                    first = Raz(first, num_2);
                    dil++;
                } while (first > 0);
                String dobu = String.valueOf(dil);
                String revo2 = "-" + dobu;

                int rev1 = Integer.parseInt(revo2);
                System.out.println("3");
                return rev1;
            }
            if (num_1 < 0 && num_2 < 0) {
                String input = String.valueOf(num_2);
                StringBuffer revor = new StringBuffer(input);
                revor.delete(0, 1);
                String revo = new String(revor);
                int rev = Integer.parseInt(revo);

                String input1 = String.valueOf(num_1);
                StringBuffer revor1 = new StringBuffer(input1);
                revor1.delete(0, 1);
                String revo1 = new String(revor1);
                int rev1 = Integer.parseInt(revo1);

                int first = rev1;
                int dil = 0;
                do {
                    first = Raz(first, rev);
                    dil++;
                } while (first > 0);


                System.out.println(rev1);
                System.out.println("4");
                return dil;
            }
            if (num_1 == 0) {
                return 0;
            }
            else{
                if(num_2==0) throw new Exception("На 0 делить нельзя");
                return 1;
            }

    }



    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main example = new Main();

        int [] arrDelete = example.DeleteElement(nums,6);
        System.out.print(Arrays.toString(arrDelete));

        //example.Palindrom("1122221137433347177111123478998POPNEXTPOPNANPOP");

        example.Revers("Hello world");
        String reversMas = example.ReversMas("Hello world");

        System.out.print(reversMas);
        System.out.println();

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {2,3,4,-5,-200,-7,-8};
        int [] arr3 = {2,3,4,-5,6,-7,-8, -100};
        example.Min(arr1, arr2, arr3);
        System.out.println();



        int raz = example.Raz(-7,-2);
        System.out.print(raz);

        System.out.println();

        int dob = example.Dob(-5,-5);
        System.out.print(dob);

        System.out.println();

        try {
            System.out.print(example.Dil(100,-10000));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }






    }


}
