class Hello {
    public static void main(String args[]){
        System.out.println("Starting to count:");
		for (int i = 0; i < 5; i++) {
			System.out.println(String.valueOf(i) + ((i % 2 == 0) ? " is even" : " is odd" ));
		}
		System.out.println("We're good to go.");
		System.out.println("Change.");
		System.out.println("Another.");
    }
}
