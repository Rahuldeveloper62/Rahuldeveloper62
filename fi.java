import java.io.FileOutputStream;

class result {
	
	   public static void main(String [] args){
		   try {
			    
		   FileOutputStream z = new FileOutputStream("res.txt");
		   
		   
		   String name = "yogesh yadav";
		   char grade= 'A';
		   int Class = 12;
		   float no = 7062655344f;
		   byte [] a = name.getBytes();
		   
		   
		   z.write(a);
		  
		   z.close();
		   
		   
		   }catch (Exception e){
			   System.out.println("File not founc !!!");
			   
		   }
	   }
}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   