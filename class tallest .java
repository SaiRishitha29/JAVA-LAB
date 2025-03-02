class tallest {
	public static void main(String[] args) {
	// declaring double type variables
	Double jahnavi = 5.2, pravallika = 5.4, durga =5.0,tallest;
	//checks if jahnavi is greater than or equal to pravallika
	if (jahnavi >= pravallika ) {
	   // if...else statement inside if block
	   // checks if jahnavi is greater than or equal to durga
	   if (jahnavi >= durga) {
        tallest = jahnavi;
      }

      else {
        tallest = durga;
      }
    } else {

      // if..else statement inside else block
      // checks if pravallika is greater than or equal to durga
      if (pravallika >= durga) {
        tallest = pravallika;
      }

      else {
        tallest = durga;
      }
    }

    System.out.println("tallest member: " + tallest);
  }
}

