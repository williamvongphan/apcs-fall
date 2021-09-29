class Main {
    public static void main(String[] args) {
        String month = "January";
        String day_name = "Monday";
        int day = 1;
        int year = 1970;

        System.out.println("American Format: ");
        System.out.println(day_name + ", " + month + " " + day + ", " + year);
        System.out.println("European Format: ");
        System.out.println(day_name + " " + day + " " + month + " " + year);

    }
}