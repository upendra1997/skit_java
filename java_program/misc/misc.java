class Misc{

	static class Test{
		private int a;
		public Test(int _a){
			a = _a;
		}
		public void set(int _a){
			a = _a;
		}
		public int get(){
			return a;
		}
	}

	public static void main(String[] args) {
		Test a = new Test(98);
		Test[] arr = {new Test(980)};
		Misc asd = new Misc();
		Misc[] as = {new Misc(), new Misc()};
		System.out.println(a);
		System.out.println(arr);
		System.out.println(asd);
		System.out.println(as);
	}
}