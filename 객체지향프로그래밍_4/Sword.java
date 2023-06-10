public class Sword extends Weapon
{
    private double sharpness;
    private double deltaSharpness;
    private int maximumAttackPoint;
    public Sword()
    {
        sharpness = 1.0;
        deltaSharpness = 0.05;
        maximumAttackPoint = 100;
    }
    
    @Override
    public void generateAttackPoint()
    {
    	   int damage = (int)(Math.random() * maximumAttackPoint) + 1;

        System.out.println("Slashing the sword...");
        System.out.println("Opponent damage will be " + damage + " with blade sharpness " + sharpness);
        
        sharpness -= deltaSharpness;
        if (sharpness < 0)
            sharpness = 0;
    }

    @Override
    public void applyWeaponUse()
    {
        System.out.println("Blade sharpness degraded by " + deltaSharpness);
    }

    @Override
    public void printStatus()
    {
        System.out.println("Blade sharpness: " + sharpness);
    }

    /* getters and setters */
    public double getSharpness()
    {
        return sharpness;
    }

    public void setSharpness(double s)
    {
        sharpness = s;
    }

    public double getDeltaSharpness()
    {
        return deltaSharpness;
    }

    public void setDeltaSharpness(double d)
    {
        deltaSharpness = d;
    }

}
