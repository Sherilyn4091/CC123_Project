package gui;


import adminpage.AdminHome;
import adminpage.ScheduleTable;
import adminpage.User;
import db.userDb;


import javax.swing.*;

public class launcher {
    private static String loggedInLastName;
    private static String loggedInFirstName;
    private static String loggedInMiddleName;
    private static int id;
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                Appoinment appoinment = new Appoinment(loggedInLastName, loggedInFirstName, loggedInMiddleName);
//                appoinment.setVisible(true);
                //new UserProfile(id).setVisible(true);


//new typeAppointment().setVisible(true);
                new loginpage().setVisible(true);
//new AdminHome().setVisible(true);

              //new AppointmentList().setVisible(true);
         //       new loginpage().setVisible(true);
//new typeAppointment().setVisible(true);
 //   new home().setVisible(true);
//new HowToAppointment().setVisible(true);

              //  new ContactUs().setVisible(true);

              // System.out.println(MyJDBC.checkuser("username1234"));
               //System.out.println(MyJDBC.register("username1234", "password"));
               // System.out.println(MyJDBC.validatelogin("username1234", "password"));
               //System.out.println(userDb.checkuser(Integer.parseInt("1234")));
              // System.out.println(userDb.validateuser(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));
                //System.out.println(userDb.menu(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

            }
        });
    }
}