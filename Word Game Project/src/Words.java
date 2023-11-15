public class Words
	{
	//what.
		private String name;
		private int level;
		private int points;
		private boolean panagram;
		  
		public Words(String n, int l, int po, boolean p)
		{
			name = n;
			level = l;
			points = po;
			panagram = p;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setWord(String name)
		{
			this.name = name;
		}
		
		public int getLevel()
		{
			return level;
		}
		
		public void setLevel(int level)
		{
			this.level = level;
		}
		
		public int getPoints()
		{
			return points;
		}
		
		public void setPoints(int points)
		{
			this.points = points;
		}
		
		public boolean getPanagram()
		{
			return panagram;
		}
		
		public void setPanagram(boolean panagram)
		{
			this.panagram = panagram;
		}
	}

