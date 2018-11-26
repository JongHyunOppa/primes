public class week2_1
{
    public static void main(String[] args)
    {
        //enter your code here...
        for(int i=1;i<=10000;i++){
			int counter = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
				{
				counter++;
				}
			}
				if(counter == 2)
				{
			System.out.println(i+" ");
		
				}
			
		}
        
    }
}