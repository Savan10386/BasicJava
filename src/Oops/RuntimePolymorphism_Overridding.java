package Oops;

class RuntimePolymorphism_Overridding{
void bowlingMethod()
{
System.out.println(" bowler ");
}
public static class FastPacer{
void bowlingMethod()
{
System.out.println(" fast bowler ");
}
public static void main(String[] args)
{
FastPacer obj= new FastPacer();
obj.bowlingMethod();
}
}
}