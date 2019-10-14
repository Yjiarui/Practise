import java.util.Arrays;

public class Week {
    //枚举
    enum Gender{
        FEMALE,MALE;
    }
    enum Week{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
        public static void main(String[] args) {
            Gender gender = Gender.FEMALE;
            System.out.println(gender);
            System.out.println(Arrays.toString(Gender.values()));
            Gender g = Gender.valueOf("FEMALE");
            System.out.println(g);
            Week w = Week.FRIDAY;
            System.out.println(w);
            System.out.println(Arrays.toString(Week.values()));
        }
}

