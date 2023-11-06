public class Words
	{
	//what.
		private String word;
		private int level;
		private int points;
		private boolean panagram;
		  
		public Words(String w, int l, int po, boolean p)
		{
			word = w;
			level = l;
			points = po;
			panagram = p;
		}
		
		public String getWord()
		{
			return word;
		}
		
		public void setWord(String word)
		{
			this.word = word;
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
		
		public void setPanagram(int panagram)
		{
			this.panagram = panagram;
		}
	}
}
