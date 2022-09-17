class abc{
public static void main(String[] agrs){
String name="Pankaj";
int[] score= {1500,900,400,50};
for (var var: score){
	displayHighScorePosition("Pankaj", var);
	int score1 = calculateHighScorePosition(var);
	System.out.println(score1);
}
}
public static void displayHighScorePosition(String name, int position){
	System.out.println(name+ " managed to get into position "+ position);
}

public static int calculateHighScorePosition(int score){
if(score>1000) return 1;
else if(score>500 && score <1000) return 2;
else if (score >100 && score <500) return 3;
else return 4;
}
}
