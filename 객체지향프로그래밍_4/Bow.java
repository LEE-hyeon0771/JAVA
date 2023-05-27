public class Bow extends Weapon
{
    private int numberOfArrows;
    private int arrowsCapacity;

    public Bow()
    {
        this(20);
    }
    
    public Bow(int initialArrowsCapacity)
    {
        super();     // maximumAttackPoint with default 100

        arrowsCapacity = initialArrowsCapacity;
        numberOfArrows = arrowsCapacity;
    }
    
    @Override
    public void generateAttackPoint()
    {
        if (numberOfArrows > 0)
        {
            numberOfArrows -= 1;
            int damage = (int) (Math.random() * getMaximumAttackPoint()) + 1;
            System.out.println("Shooting an arrow...");
            System.out.println("Opponent damage will be " + damage);
        }
        else
        {
            System.out.println("There are no arrows left. Cannot attack. Opponent damage will be 0");
        }
    }

    @Override
    public void applyWeaponUse()
    {
        System.out.println("Used up one arrow");
    }

    @Override
    public void printStatus()
    {
        System.out.println("Bow capacity for arrows: " + arrowsCapacity);
        System.out.println("Currently holds " + numberOfArrows + " arrows");
    }
    

    public int getNumberOfArrows()
    {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int n)
    {
        numberOfArrows = n;
    }

    public int getArrowsCapacity()
    {
        return arrowsCapacity;
    }

    public void setArrowsCapacity(int c)
    {
        arrowsCapacity = c;
    }
}
