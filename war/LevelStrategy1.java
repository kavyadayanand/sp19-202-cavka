/**
 * Write a description of class LevelStrategy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelStrategy1  implements IStrategy
{
    int nightKingDamage;

    int unDeaddamage=1;
    int spearDamage=10;
    int undeadSpawnTime=300;
    int spearSpawnTime=120;
    int undeadSpawnCount=1;
    int speed=2;
    int health;
    int holder=10;
    int armor=5;

   public int getDamage(ISubject sub)
   {
       if(sub instanceof Undead)
       {
           return unDeaddamage;
       }
       else if(sub instanceof NightKing)
       {
           return nightKingDamage;
       }
       else if(sub instanceof Spear)
       {
           return spearDamage;
       }
       else
       return holder;
   }
   
   public int getSpearSpawnTime()
   {
       return spearSpawnTime;
   }
   
   public int getUndeadSpawnTime()
   {
       return undeadSpawnTime;
   }
   
   public void getStrategy()
   {
       
   }
   
   public int getSpeed(ISubject sub)
   {
       return speed;
   }
   
   public int getSpawnCount()
   {
       return undeadSpawnCount;
   }
   
   public int getCurrentArmor()
   {
       return armor;
   }
}
