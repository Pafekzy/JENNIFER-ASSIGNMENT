public class NextHundredDays                          {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int today = 2; //Tuesday
        int nextHundredDays = (today + 2) % 7;
        System.out.println("Today is " + days[today]);
        System.out.println("100 days from now is " + days[nextHundredDays]);
  }
  }