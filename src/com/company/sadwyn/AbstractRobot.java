package com.company.sadwyn;

import java.util.Scanner;

abstract public class AbstractRobot implements Attackable, Defensable
{
    public String getName()
    {
        return getName();
    }

    private Scanner scanner = new Scanner(System.in);

    private String atackturn;
    private String defenceturn;

    public BodyPart attack()
    {

            System.out.println("Выберите часть тела для атаки (голова, рука, нога, грудь)");

            atackturn = scanner.nextLine();
            if (atackturn.equals(BodyPart.LEG.toString()))
            {
                return BodyPart.LEG;
            }
            if (atackturn.equals(BodyPart.HEAD.toString()))
            {
                return BodyPart.HEAD;
            }
            if (atackturn.equals(BodyPart.ARM.toString()))
            {
                return BodyPart.ARM;
            }
            if (atackturn.equals(BodyPart.CHEST.toString()))
            {
                return BodyPart.CHEST;
            }
        return null;
    }

    public String getAtackturn()
    {
        return atackturn;
    }

    public String getDefenceturn()
    {
        return defenceturn;
    }

    public BodyPart defense()
    {
        System.out.println("Выберите часть тела для защиты (голова, рука, нога, грудь)");
        defenceturn = scanner.nextLine();

        if (defenceturn.equals(BodyPart.LEG.toString()))
        {
            return BodyPart.LEG;
        }
        if (defenceturn.equals(BodyPart.HEAD.toString()))
        {
            return BodyPart.HEAD;
        }
        if (defenceturn.equals(BodyPart.ARM.toString()))
        {
            return BodyPart.ARM;
        }
        if (defenceturn.equals(BodyPart.CHEST.toString()))
        {
            return BodyPart.CHEST;
        }
        return null;
    }


}
