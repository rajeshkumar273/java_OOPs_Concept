/*
The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false. 

If we apply the instanceof operator with any variable that has null value, it returns false.




class InstanceOf {

	public static void main(String args[]) {

	InstanceOf i=new InstanceOf();

	System.out.println(i instanceof InstanceOf);  //syntax : refer_variable instanceof classname

}

}

*/

//instanceof in java with a variable that have null value


class InstanceOf {

	public static void main(String args[]) {

	InstanceOf i=null;

	System.out.println(i instanceof InstanceOf);//false  

}

}


