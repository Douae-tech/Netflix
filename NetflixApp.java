
import Payment.Plan;
import Payment.PaymentMethod;
import java.util.Scanner;
import Payment.Plantype;
import Payment.Type;
import Account.Account;
import Payment.InvalidPlanTypeException;
import Payment.UnavailableTypeCardException;
import Shows.Genre;
import Shows.Movie;
import Shows.Serie;
import Shows.Show;
import Shows.ShowList;
import java.io.IOException;
import java.util.ArrayList;

public class NetflixApp {

    public static void main(String[] args) throws UnavailableTypeCardException {
        ShowList shows;
        shows = new ShowList();
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tWelcome to Netflix! ");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        Plan plan = null;
        String planChosen;
        while (true) {

            try {
                System.out.println("\t-Please proceed by choosing you plan type from the following: ");

                Plantype[] arr = Plantype.values();
                for (Plantype arr1 : arr) {
                    System.out.println("\n " + arr1.toString());
                }
                System.out.println("\n==> ");
                planChosen = in.next();

                plan = new Plan(planChosen);
                System.out.println(plan);
                break;
            } catch (InvalidPlanTypeException ex) {
                System.err.println("\nError: " + ex.getMessage());
                System.err.println("Try Again!\n");
                //ex.getValidPlanType();
            }
        }

        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t Payment Information");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t-Name of the Holder of the card: ");
        System.out.println("\n==> ");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("\n\t-Expiration Date by entering the year, the month, then the date: ");
        System.out.println("\n==> ");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        while (true) {
            try {
                System.out.println("\n\t-Type of the Card from the following: ");
                Type[] arr2 = Type.values();
                for (Type arr1 : arr2) {
                    System.out.println("\n " + arr1.toString());
                }
                System.out.println("==> ");
                String type = in.next();
                System.out.println("\n\t-Number of the Card ");
                System.out.println("\n==> ");
                int number = in.nextInt();
                PaymentMethod paymentInfo;
                paymentInfo = new PaymentMethod(name, year, month, day, number, type);
                System.out.println(paymentInfo);
                System.out.println("\nYour payment was done Successfully!");
                break;
            } catch (UnavailableTypeCardException ex) {
                System.err.println("\nError: " + ex.getMessage());
                System.err.println("Try Again!\n");
                //ex.getValidTypeCards();
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tLet's go creating your Netflix Account!");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\n\t-Please enter your email adress");
        System.out.println("\n==> ");
        String email = in.next();
        System.out.println("\n\t-Choose now your password wisely; It is safer if it contains at least 1 character, 1 digit, 1 uppercase letter");
        System.out.println("\n==> ");
        in.nextLine();
        String password = in.nextLine();
        Account account = new Account(email, password);
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tCongratulations! Your netflix account was created successfully! \n\t\t\tGo get some popcorns and start your favorite serie! ;)");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t Welcome to your Home ");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("\t-Please choose the language with which you would like to watch the shows: ");
        System.out.println("\n==> ");
        String lang = in.next();

        ArrayList<Genre> g1 = new ArrayList();
        g1.add(Genre.ACTION);
        g1.add(Genre.DRAMA);
        ArrayList<Genre> g2 = new ArrayList();
        g2.add(Genre.DRAMA);
        g2.add(Genre.ROMANCE);
        ArrayList<Genre> g3 = new ArrayList();
        g3.add(Genre.DRAMA);
        g3.add(Genre.ROMANCE);

        Show s1 = new Serie("Prison Break", g1, 867000, lang, """
                                                                              An innocent man is framed for the homicide of the vice President's brother and scheduled to be executed at a super-max penitentiary
                                                                              Thus, it's up to his younger brother to save him with his genius scheme: install himself in the same prison by holding up a bank.
                                                                              As the final mounth ticks away, launch the escape plan step-by-step to break the both of them out,
                                                                              with his full body tattoo acting as his guide; a tattoo which hides the layout of the prison facility and necessary clues vital to the escape.""", 8.3, plan.getQuality().toString(), 5);

        Show s2 = new Movie("Sense and Sensibility", g2, 45456, lang, "Rich Mr.Dashwood dies, leaving his second wife and her daughters poor by the rules of inheritance."
                + "Two daughters are the titular opposite.", 7.5, plan.getQuality().toString(), 136);

        Show s3 = new Movie("Titanic", g3, 20000, lang, """
                                                                              101-year-old Rose DeWitt Bukater tells the story of her life aboard the Titanic, 84 years later.
                                                                              A young Rose boards the ship with her mother and fianc\u00e9. Meanwhile, Jack Dawson and Fabrizio De Rossi win third-class tickets aboard the ship.
                                                                              Rose tells the whole story from Titanic's departure through to its death on its first and last voyage on April 15, 1912.""", 7.8, plan.getQuality().toString(), 194);

        Show[] shs = new Show[3];
        shs[0] = s1;
        shs[1] = s2;
        shs[2] = s3;
        processShows(shs);
        shows.addShow(s1);
        shows.addShow(s2);
        shows.addShow(s2);

        try {
            shows.save();
        } catch (IOException ex) {
            System.err.println("Cannot serialize shows.");
            System.err.println(ex.getMessage());
        }
    }

    private static void processShows(Show[] shs) {
        for (Show s : shs) {
            System.out.println("\n");
            System.out.println("__________________________________________________________________________");
            System.out.println(s.toString());
            System.out.println();
        }
    }
}
