package OCAtasks.assesment1.switchIssues;

/**
 * Created by veronika on 01.04.2019.
 */
class SwitchIssues {
    private int getSortOrder(Integer firstName, final String lastName) {
        String middleName = "Patricia";
        final int intVariable = 1;
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case intVariable:
                return 1;
            case "Test":
                return 52;
        //    case middleName: // DOES NOT COMPILE
              /*  id = 5;
                break;*/
            case suffix:
                id = 0;
                break;
        //    case lastName: // DOES NOT COMPILE - t, despite lastName being final, it is not constant as it is passed to the function;
                /*id = 8;
                break;*/
        //    case 5: // DOES NOT COMPILE
              /*  id = 7;
                break;*/
        //    case 'J': // DOES NOT COMPILE
             /*   id = 10;
                break;*/
        //    case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
               /* id = 15;
                break;*/
        }
        return id;
    }
}