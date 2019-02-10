public class Spinner
{
private int Arrow;
public Spinner()
{
Arrow=0;
}
public Spinner(int passedArrow)
{
Arrow=passedArrow;
}
public int GetArrow()
{
return Arrow;
}
public void SetArrow(int pasd)
{
if(pasd>=0 && pasd<=9)
Arrow=pasd;
else
System.out.print("ERROR");
}
public void spin()
{
int min=0;
int max=9;
int rndVal;
int range = max-min+1; 
rndVal= (int)(Math.random()*(range)+min); 
Arrow=rndVal;
}
public String toString()
{
return "Arrow";
}
public boolean equals(Spinner psdS)
{
if(psdS.GetArrow()==this.GetArrow())
return true;
else
return false;
}
}