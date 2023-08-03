package gtjune2023;

public class commandlinearguments {
	 public static void main(String[] args) {
	        // Check if any command line arguments are provided
	        if (args.length == 0) {
	            System.out.println("No command line arguments provided.");
	        } else {
	            System.out.println("Command line arguments:");
	            // Loop through the array and print each argument
	            for (int i = 0; i < args.length; i++) {
	                System.out.println("Argument " + (i + 1) + ": " + args[i]);
	            }
	        }
	    }
	}


