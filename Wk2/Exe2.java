class Exe2 {
  public static void main(String[] args) {
    // add code here
    System.out.println("Words given: " + args[0] + ", " + args[1]);
    String status = args[0].equals(args[1]) ? "true" : "false";
    System.out.println("They are the same: " + status);
  }
}

