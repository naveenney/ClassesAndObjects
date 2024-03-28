package classesobjectsencapsulation;

import java.util.ArrayList;

class Player
{
	private String name;
	
	private String  position;
	
	private int jerseyNumber;

	public Player(String name, String position, int jerseyNumber) {
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public void playGame()
	{
		System.out.println("Player"+name+" Is Playing");
	}
	
	public void train()
	{
		System.out.println("Player"+name+" Is Training");
	}
	
	public void display()
	{
		System.out.println("PLAYER NAME:"+name+"\nPOSITION:"+position+"\nJERSEY NUMBER:"+jerseyNumber);
	}
}

class Team
{
	private String name;
	
	private String city;
	
	private String division;
	
	private String coach;
	
	
	private ArrayList <Player> playersList=new ArrayList<>();
	
	public Team(String name, String city, String division,String coach) {
		this.name = name;
		this.city = city;
		this.division = division;
		this.coach=coach;
	}

	
	public void playGame()
	{
	   System.out.println(name+"playing the game"); 
	}
	public void hireCoach()
	{
        System.out.println(name+" is appointed as a new coach");
	}
	
	public void display()
	{
		System.out.println("TEAM NAME:"+name+"\nCITY:"+city+"\nDIVISION:"+division+"COACH:"+coach);
	}
}
public class Question5
{
	public static void main(String[] args)
	{
		Team t=new Team("PARIS SAINT GEIRMAIN","PARIS","LEAGUE1","LUIS ENRIQUE");
		
		Player p=new Player("OSHMANE DEMBELE","RIGHT WINGER",10);
		
		t.display();
		
		p.display();
		
		t.playGame();
		
		p.playGame();
		
		p.train();
		
	}
	
}