/* Wrapper classes are used to convert Primitive to Object and Vice-versa.

Here It can done in Two ways as below

Autoboxing --> Converting Primitive to Object

Unboxing:--> Converting Object to Primitive

Eight classes of java.lang package are as wrapper class in java.


Primitive Type              wrapper class

int		Interger
bool		Boolean
char		Character
byte		Byte
short		Short
long		Long
float		Float
double 		Double
*/

//Primitive to Wrapper

class PrimitiveToWrapper {

	public static void main(String [] args ) {

int i=100;
//Integer j=Integer.valueOf(i); //here i is an primitive and j is an object (/converting int into Integer explicitly )


// <WrapperType>.valueOf(<primitiveType>)

Integer ab=i; //Autoboxing (autoboxing, now compiler will write Integer.valueOf(a) internally )

System.out.println("Value in i="+i);
//System.out.println("Value in j="+j);
System.out.println("value in ab="+ab);

}

}
 

