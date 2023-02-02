public class StaticLocalVariables {
	int x=10; //instance Varible
    static int y=20; //Static Variable
    
    void sample() {
    
    	int x=100; //Local Variable
        
       }
       
   public static void main(String args[]) {
   
   	StaticLocalVariables myobj=new StaticLocalVariables();
    	System.out.println(myobj.x);
        System.out.println(StaticLocalVariables.y);
        System.out.println(myobj.y);
      }
      
      
   }
        