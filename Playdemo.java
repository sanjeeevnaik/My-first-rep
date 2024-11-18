class Player
{
  int age;
  String name;
  int jernum;
  int noOfmatches;
  Player(int a,String n,int j,int num)
  {
  age = a;
  name = n;
  jernum = j;
  noOfmatches = num;
  }
  
  void displayinfo()
  {
   System.out.println("NAME:" +name);
   System.out.println("AGE:" +age);
   System.out.println("JERSEY Number:" +jernum);
   System.out.println("No of matches:" +noOfmatches);
  } 
  
}
class Cricketer extends Player
{
  int manOfMatches;
  Cricketer(String n, int a , int j, int num, int mom)
  {
  super(int a , String n ,int j ,int num);
  manOfMatches = mom;
  }
 
  void displayC()
  {
  System.out.println("info:");
  super.displayinfo();
  System.out.println("Man of the matches in :" +manOfMatches "games");
  }
  
}
class Hockeyplayer extends Player
  {
  int redcards;
  Hockeyplayer(String n ,int a ,int j ,int num , int rc)
  {
  super(int a,String n,int j,int num);
  redcards = rc;
  }
 
  void displayH()
  {
  System.out.println("info:");
  super.displayinfo();
  System.out.println("Number of redcards  :" +redcards );
  }
  }
class Footballer extends Player
{
int goals;
  Footballer(String n, int a, int j, int num, int gc)
  {
  super(int a, String n, int j, int num);
  goals = gc;
  }
 
  void displayF()
  {
  System.out.println("info:");
  super.displayinfo();
  System.out.println("total numbers of goals:" +goals );
  }
}
class Playdemo
{
 public static void main(String args[])
 {
  Cricketer c = new Cricketer("VIRAT",33,18,345,70);
  Hockeyplayer h = new Hockeyplayer("jj",33,18,345,12);
  Footballer f = new Footballer("jj",33,18,345,12);
  c.displayC();
  h.displayH();
  f.displayF();
  }
 }
