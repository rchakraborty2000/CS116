public class SpinnerB
{
private int Arrow;
public SpinnerB()
{
Arrow=0;
}
public SpinnerB(int passedArrow)
{
Arrow=passedArrow;
}
public int GetArrow()
{
return Arrow;
}
public void SetArrow(int pasd,int pasdUser)
{
if(pasd>=0 && pasd<=pasdUser)
Arrow=pasd;
else
System.out.print("ERROR");
}
public void spin(int sec)
{
int min=0;
int max=sec-1;
int rndVal;
int range = max-min+1; 
rndVal= (int)(Math.random()*(range)+min); 
Arrow=rndVal;
}
public String toString()
{
return "Arrow";
}
public boolean equals(SpinnerB psdS)
{
if(psdS.GetArrow()==this.GetArrow())
return true;
else
return false;
}
}
