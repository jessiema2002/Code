/* Several seasons of hot summers and cold winters have taken their toll on Farmer John's fence, and he decides it is time to repaint it, along with the help of his favorite cow, Bessie. Unfortunately, while Bessie is actually remarkably proficient at painting, she is not as good at understanding Farmer John's instructions.
*If we regard the fence as a one-dimensional number line, Farmer John paints the interval between x=a and x=b. For example, if a=3 and b=5, then Farmer John paints an interval of length 2. Bessie, misunderstanding Farmer John's instructions, paints the interval from x=c to x=d, which may possibly overlap with part or all of Farmer John's interval. Please determine the total length of fence that is now covered with paint.

INPUT FORMAT (file paint.in):
The first line of the input contains the integers a and b, separated by a space (a<b).
The second line contains integers c and d, separated by a space (c<d).

The values of a, b, c, and d all lie in the range 0…100, inclusive.

OUTPUT FORMAT (file paint.out):
Please output a single line containing the total length of the fence covered with paint.
SAMPLE INPUT:
7 10
4 8
SAMPLE OUTPUT:
6
Here, 6 total units of fence are covered with paint, from x=4 all the way through x=10.

Problem credits: Brian Dean */
import java.io.*;
import java.util.*;
public class Paint {
	public static void main(String[] args) throws IOException {
		// initialize file I/O

		BufferedReader br = new BufferedReader(new FileReader("Code/Silver/resource/1.in"));
		
		String dir = System.getProperty("user.dir");

  		System.out.println(dir);
		
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

		// read in the first line, store a and b
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		// read in the second line, store c and d
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int amountPainted = 0;
		for(int i = 0; i < 100; i++) {
			if(i >= a && i+1 <= b) {
				amountPainted++;
			}
			else if(i >= c && i+1 <= d) {
				amountPainted++;
			}
		}
		
		// print the answer!
		//pw.println(amountPainted);
		System.out.println(amountPainted);
		// close output stream
		//pw.close();
	}
}
