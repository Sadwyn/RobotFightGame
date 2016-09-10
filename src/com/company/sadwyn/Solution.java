package com.company.sadwyn;

/* Битва роботов
1 Разобраться в том, что тут написано.
2 http://info.javarush.ru/uploads/images/00/00/07/2014/08/12/50f3e37f94.png
3 Смириться со своей участью и продолжить разбираться в коде.
4 ...
5 Порадоваться, что мы все поняли.

6 Изменить код согласно новой архитектуре и добавить новую логику:
6.1 Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
6.2 Отредактировать класс Robot учитывая AbstractRobot.
6.3 Расширить класс BodyPart новой частью тела "грудь".
6.4 Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

7 http://info.javarush.ru/uploads/images/00/00/07/2014/08/12/3b9c65580b.png
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("ИГРА \"Битва Роботов\" v1.0\n");
        System.out.println("Введите свое Имя");
        Scanner scanner = new Scanner(System.in);
        Robot player = new Robot(scanner.nextLine());
        Computer computer = new Computer("Амиго");
        while (true)
        {
            fight(player, computer);
            fight(computer, player);
            System.out.println("-------------------------------------------");
            fight(player, computer);
            fight(computer, player);
            System.out.println("-------------------------------------------");
            fight(player, computer);
            fight(computer, player);
            System.out.println("-------------------------------------------");

            Score.score(player);
            System.out.println("-------------------------------------------");
            System.out.println("Введите \"Выход\" чтобы завершить игру");
            System.out.println("Введите \"Повторить\", чтобы сыграть еще");
            String s = scanner.nextLine();
            if (s.equals("Повторить"))
            {
                Score.setPlayerhitCount(0);
                Score.setComputerhitCount(0);
                continue;
            }
            if (s.equals("Выход"))
                break;
        }

    }

    public static void fight(AbstractRobot robot, Computer computer)
    {
        BodyPart attacked = robot.attack();
        BodyPart defenced = robot.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robot.getName(), computer.getName(), attacked, defenced));


    }

    public static void fight(Computer computer, AbstractRobot robot)
    {
        BodyPart attacked = computer.attack();
        BodyPart defenced = computer.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                computer.getName(), robot.getName(), attacked, defenced));


        if (!attacked.toString().equals(robot.getDefenceturn()))
        {
            Score.setComputerhitCount((Score.getComputerhitCount()) + 1);
        }
        if ((defenced.toString().equals(robot.getAtackturn()))||(!(robot.getAtackturn()
            .equals("рука")||robot.getAtackturn()
            .equals("нога")|| robot.getAtackturn()
            .equals("грудь")||robot.getAtackturn()
            .equals("голова"))))
        {
            Score.setComputerhitCount(Score.getComputerhitCount() + 1);
        }

        if (robot.getAtackturn()
                .equals("рука")||robot.getAtackturn()
                .equals("нога")|| robot.getAtackturn()
                .equals("грудь")||robot.getAtackturn()
                .equals("голова"))
        {
            if (!robot.getAtackturn().equals(defenced.toString()))
            {

                Score.setPlayerhitCount(Score.getPlayerhitCount() + 1);

            }
        }
        if (robot.getDefenceturn().equals(attacked.toString()))
        {
            Score.setPlayerhitCount(Score.getPlayerhitCount() + 1);
        }

    }
}
