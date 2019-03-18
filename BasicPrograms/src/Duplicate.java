
import java.util.*;
public class Duplicate{
	public static int Hash(String arr[], int D)
	{  
	    if (D==0 || D==1)
	    {  
	        return D;  
	    }    
	    int j=0;
	    for (int i=0; i < D-1; i++)
	    {  
	        if (arr[i] != arr[i+1])
	        {
	            arr[j++] = arr[i];  
	        }  
	    }  
	    arr[j++] = arr[D-1];  
	    return j;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		String arr = scan.nextLine();
		arr=Duplicate();
		HashSet<String> name = new HashSet<String>();
		name.iterator();
	    System.out.println(arr);
	}

	private static String Duplicate() {
		// TODO Auto-generated method stub
		return null;
	}
}