class ExceptionPropagation {

	void m() {

			int data=50/0;	

	}

	void n() {
		
			m();

	}

	void p() {
			try {
				n();
		
			}

			catch(java.lang.Exception e) {
					System.out.println(e);
			}
	}

	public static void main(String args[]) {
	
	ExceptionPropagation obj=new ExceptionPropagation();
	obj.p();
}

}

	