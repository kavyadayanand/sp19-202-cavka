import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class NightKing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NightKing extends Subject
{
    /**
     * Act - do whatever the NightKing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    boolean selected;
    private int X;
    private int Y;
    private int time;
    private int spawnTimer;
    private int health=250;
    private int damage=20;
    private int range=250;
    private List<Man> man; 
    private int throwTimer=120;
    private int time2=0;
    public NightKing()
    {
        img= new GreenfootImage("Night_king1.gif");
        img.scale(50,50);
        man= new ArrayList<Man>();
        setImage(img);
        selected = false;
        time=0;
        spawnTimer=300;// for 5 seconds
    }
    
     public void act() 
    {
        time++;
        X=getX();
        Y=getY();
        checkRange();
        int r= random(100);
        if(time%spawnTimer == 0)
        {
            if(r%2==0)
            getWorld().addObject(new Undead(), X+random(50), Y);
            else
            getWorld().addObject(new Undead(),X-random(50),Y);
        }
        
    }
    
   
    
   public void causeDamage(Subject s)
    {
        //nothing
    }
    
    public int random(int limit)
    {
        return Greenfoot.getRandomNumber(limit);
    }
    
    public void HealthSet(int val)
    {
        
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void causeDamage(ISubject a)
    {
        
    }
    
       public int getDamage()
    {
        return damage;
    }
    
    public void setDamage(int val)
    {
        this.damage=val;
    }
    
    public void checkRange()
    {
         man =getObjectsInRange(250, Man.class);
         if(!man.isEmpty())
         throwSpear(man.get(0));
         else
         {
         time2=0;
         return;
        }
    }
    
    public void throwSpear(Man man)
    {
        time2++;
        if(time2%throwTimer==0 || time2==0)
        getWorld().addObject(new Spear(man), X+15, Y);
        
    }
}
