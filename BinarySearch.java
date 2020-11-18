package attAlgo;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BinarySearch{
	private BinarySearch() {}
	public static int index0f(Comparable[] a, Comparable key) {
		int lo = 0;
		int hi = a.length - 1 ;
		while ( lo <= hi) {
			int mid = lo + (hi-lo)/2;
			if (key.compareTo (a[mid]) < 0) hi = mid - 1;
			else if(key.compareTo(a[mid])> 0) lo = mid + 1;
			else return mid;						
		}
		return -1;
	
	}
	
	public static int rank (Comparable key, Comparable [] a) {
		return index0f (a, key);
		
	}
	
	public static void main(String [] args, Object Quicksort) {
		if (args.length < 2) {
			System.out.println("\n\nUso: java BinarySearch arquivo1\n");
			System.exit(0);	
		}
		
		int n, pos;
		Cidade [] whitelist;
		String tmp;
		StringTokenizer st;
		
		try {
			
			FileReader inl = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(inl);
			n = Integer.parseInt(br.readLine());
			whitelist = new Cidade[n];
			
			for ( int j = 0; j < n; ++j) {
				tmp = br.readLine();
				st = new StringTokenizer(tmp);
				whitelist[j] = new Cidade(st.nextToken(), j);
				Integer.parseInt(st.nextToken());
				
			}
			br.close();
			inl.close();		
			Quicksort.sort(whitelist);
			
			inl = new FileReader(args [1]);
			br = new BufferedReader(inl);
			
			n = Integer.parseInt(br.readLine());
			
			for (int j = 0; j < n; ++j) {
				tmp = br.readLine();
				
				pos = rank (new Cidade(tmp,0), whitelist);
				if ( pos < 0) System.out.println("\n[failed]" + tmp +" não foi encontrada. ");
				else System.out.println("\n[ok]\t "+tmp+" foi encontarda na posição " + pos+" . ");							 
			}
			
			System.out.println("\n");
									
		}catch(IOException e){			
		}				
	}
}
