package com.company.sadwyn;


public class Score
{
    private static int PlayerhitCount = 0;
    private static int ComputerhitCount = 0;

    public static int getPlayerhitCount()
    {
        return PlayerhitCount;
    }

    public static void setPlayerhitCount(int playerhitCount)
    {
        PlayerhitCount = playerhitCount;
    }

    public static int getComputerhitCount()
    {
        return ComputerhitCount;
    }

    public static void setComputerhitCount(int computerhitCount)
    {
        ComputerhitCount = computerhitCount;
    }

    public static void score(Robot robot)
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("Вы набрали " + PlayerhitCount + " очков");
        System.out.println("Компьютер набрал " + ComputerhitCount + " очков");
        System.out.println("________________________________________________________");
        if(PlayerhitCount>ComputerhitCount){
            System.out.println("Поздравляем, " + robot.getName() + ", Вы победили!!!");
        }
        else if(PlayerhitCount<ComputerhitCount){
            System.out.println("Побить Амиго не так уж просто, попробуйте еще раз!");
        }
        else System.out.println("Ничья!");
    }


}
