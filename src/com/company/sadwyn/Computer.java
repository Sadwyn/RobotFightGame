package com.company.sadwyn;


public class Computer implements Attackable, Defensable
{
    private String name;

    public Computer(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    private int randomnumber;

    @Override
    public BodyPart attack()
    {
        randomnumber = (int) (Math.random() * 4) + 1;
        if (randomnumber == 1)
            return BodyPart.LEG;
        if (randomnumber == 2)
            return BodyPart.ARM;
        if (randomnumber == 3)
            return BodyPart.HEAD;
        if (randomnumber == 4)
            return BodyPart.CHEST;
        return null;
    }

    @Override
    public BodyPart defense()
    {
        randomnumber = (int) (Math.random() * 4) + 1;
        if (randomnumber == 1)
            return BodyPart.LEG;
        if (randomnumber == 2)
            return BodyPart.ARM;
        if (randomnumber == 3)
            return BodyPart.HEAD;
        if (randomnumber == 4)
            return BodyPart.CHEST;
        return null;
    }

}
