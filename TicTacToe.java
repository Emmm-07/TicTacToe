import java.util.Scanner;
public class TicTacToe {
	static String [] boardArr;
	static String p,t;
	static boolean done;
	static boolean a,b,c,d,e,f,g,h;
	public static void main(String[] args) {
		boardArr =new String[] {"1","2","3","4","5","6","7","8","9"};
		int index;
		done=false;
		Scanner sc =new Scanner(System.in);
		t = "X";p="1";
	
		do {
		printBoard();				
		if (done) {					
			if (p=="2") {
				p="1";
			}else {
				p="2";
			}
			System.out.println("======================\nPlayer "+p+" wins!\n======================");
		
			break;
		}
		System.out.print("Player "+p+"'s turn, choose index to put "+t+": ");
		index=sc.nextInt();
		boardArr[index-1]=t;
		checkWin();
		
		if (t=="X") {
			t="O";p="2";
		}else {
			t="X";p="1";
		}
		}while(true);
		
	}
	
	static void printBoard() {		// Display board
		System.out.println("\n\t"+boardArr[0]+" | "+boardArr[1]+" | "+boardArr[2]);
		System.out.println("\t---------");
		System.out.println("\t"+boardArr[3]+" | "+boardArr[4]+" | "+boardArr[5]);
		System.out.println("\t---------");
		System.out.println("\t"+boardArr[6]+" | "+boardArr[7]+" | "+boardArr[8]+"\n");
	}
	
	static void checkWin() {		//try all possible wins
		a =(boardArr[0]==boardArr[1])&&boardArr[0]==boardArr[2];
		b =(boardArr[3]==boardArr[4])&&boardArr[3]==boardArr[5];
		c =(boardArr[6]==boardArr[7])&&boardArr[6]==boardArr[8];
		d =(boardArr[0]==boardArr[3])&&boardArr[0]==boardArr[6];
		e =(boardArr[1]==boardArr[4])&&boardArr[1]==boardArr[7];
		f =(boardArr[2]==boardArr[5])&&boardArr[2]==boardArr[8];
		g =(boardArr[0]==boardArr[4])&&boardArr[0]==boardArr[8];
		h =(boardArr[2]==boardArr[4])&&boardArr[2]==boardArr[6];
		if (a||b||c||d||e||f||g||h ){
			done=true;
		}
	}
	
}

