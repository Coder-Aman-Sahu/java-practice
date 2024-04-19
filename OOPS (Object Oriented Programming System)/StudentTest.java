class Student
{
	int rollNo;
	String studName;
	int marks[]=new int[5];
	double avg;
	char grade;
	static double classAvg;
	static double minB,maxB,minC,maxC,minD,maxD;
	
	void setRollNo(int rollNo)	{	this.rollNo = rollNo;	}
	void setStudName(String studName)	{this.studName = studName;}
	void setMarks(int m[])
	{
		for(int i=0;i<5;i++)
			marks[i]=m[i];
	}
	int getRollNo()	{ return rollNo;}
	String getStudName()	{return studName;}
	int[] getMarks()	{return marks; }
	char getGrade()
	{
		return grade;
	}
	void computeAvg()
	{
		int sum=0;
		for(int i=0;i<5;i++)
			sum = sum+marks[i];
		avg = sum / 5;
	}
	static void classAverage(Student s[])
	{
	double sum=0.0;
		for(int i=0;i<s.length;i++)
		{
			sum = sum + s[i].avg;
		}
		classAvg = sum / s.length;
		minC = classAvg - (classAvg*10/100);
		maxC = classAvg + (classAvg*10/100);
		minB = classAvg + (classAvg*11/100);
		maxB = classAvg + (classAvg*20/100);
		minD = classAvg - (classAvg*20/100);		maxD = classAvg + (classAvg*11/100);
	
	}
	void assignGrade()
	{
		if(avg > maxB)
			grade = 'A';
		else if(avg>=minB && avg<=maxB)
			grade = 'B';
		else if(avg>=minC && avg<=maxC)
			grade = 'C';
		else if(avg>=minD && avg<=maxD)
			grade = 'D';
		else if(avg>=50 && avg<minD)
			grade = 'E';
		else
			grade = 'F';
	}
}
class StudentTest
{
	public static void main(String ar[])
	{
		Student s[]=new Student[10];
		int marks[] = new int[5];
		int ga=0,gb=0,gc=0,gd=0,ge=0,gf=0;
		//Scanner ip = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			s[i] = new Student();
			s[i].setRollNo((i+1));
			s[i].setStudName(new String("Rama "+(i+1)));
			for(int j=0;j<5;j++)
				marks[j]=(int)(100 * Math.random());
			s[i].setMarks(marks);
			s[i].computeAvg();
			
		}
		Student.classAverage(s);
		for(int i=0;i<10;i++)
		{
			s[i].assignGrade();
			char grade = s[i].getGrade();
			switch(grade)
			{
				case 'A':ga++;break;
				case 'B':gb++;break;
				case 'C':gc++;break;
				case 'D':gd++;break;
				case 'E':ge++;break;
				case 'F':gf++;break;
			}
		}
		System.out.println("Grade A Count:"+ga);
		System.out.println("Grade B Count:"+gb);
		System.out.println("Grade C Count:"+gc);
		System.out.println("Grade D Count:"+gd);
		System.out.println("Grade E Count:"+ge);
		System.out.println("Grade F Count:"+gf);
		
	}
}