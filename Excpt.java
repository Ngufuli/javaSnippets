class Excpt {
    public static void main(String[] args) {
        int n = DEFAULT;
        try {
            n = Integer.parseInt(args[0]);
            System.out.println("n must be a positive. Using default");
            n = DEFAULT;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument specified by n. Using default");
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer exception. Using default");
        }
    }
}