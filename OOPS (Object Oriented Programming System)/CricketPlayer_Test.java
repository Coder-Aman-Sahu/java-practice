class CricketPlayer
{
	int pId;
	String pName;
	int runs_scored[]=new int[10];
	int wickets_taken[]=new int[10];
	static int team_score[]=new int[10];
	double avg_score;
	double avg_wkts;
	
	int getPid()
	{
		return pId;
	}
	String getPName()
	{
		return pName;
	}
	double getAvgScore()
	{
		return avg_score;
	}
	double getAvgWkts()
	{
		return avg_wkts;
	}
	void setPid(int pId) {	this.pId = pId; }
	void setName(String pName) { this.pName = pName;}
	void setRunsScored(int runs[])
	{
		int sum = 0;
		for(int i=0;i<runs.length;i++)
		{
			runs_scored[i]=runs[i];
			sum += runs_scored[i];
		}
		avg_score = sum / runs.length;
			
	}
	void setWicketsTaken(int wickets[])
	{
		int sum = 0;
		for(int i=0;i<wickets.length;i++)
		{
			wickets_taken[i]=wickets[i];
			sum += wickets_taken[i];
		}
		avg_wkts = sum / wickets.length;			
	}
	static void totalTeamScore(CricketPlayer cp[])
	{		
		for(int i=0;i<10;i++)
		{
			int sum=0;
			for(int j=0;j<cp.length;j++)
			{
				sum = sum + cp[j].runs_scored[i];
			}
			team_score[i]=sum;
		}
	}
}
class CricketPlayer_Test
{
	public static void main(String ar[])
	{
		CricketPlayer cp[] = new CricketPlayer[11];
		int runs_scored[] = new int[10];
		int wickets_taken[] = new int[10];
		for(int i=0;i<11;i++)
		{
			cp[i]=new CricketPlayer();
			cp[i].setPid((i+1));
			cp[i].setName("Rama"+(i+1));
			for(int j=0;j<10;j++)
			{
				runs_scored[j]=(int)(100 * Math.random());
				wickets_taken[j]=(int)(10 * Math.random());
			}
			cp[i].setRunsScored(runs_scored);
			cp[i].setWicketsTaken(wickets_taken);
		}
		CricketPlayer.totalTeamScore(cp);
		for(int i=0;i<11;i++)
		{
			System.out.println(cp[i].getPid()+"\t"+cp[i].getPName()+"\t"+cp[i].getAvgScore()+"\t"+cp[i].getAvgWkts());
		}
	}
}