import javax.swing.JOptionPane;

// version 2.0

public class GradeChecker {
    // this way, you can easy set the upper and lower limit for grade inputs
    public static int lowerLimit = 0;
    public static int upperLimit = 100;

    public static void main(String[] args) {
        // originally wanted to make the arrays global as well but couldn't figure out
        // how
        int[] gradeThreasholds = new int[4];
        gradeThreasholds[0] = 90;
        gradeThreasholds[1] = 80;
        gradeThreasholds[2] = 70;
        gradeThreasholds[3] = 60;
        // idea is that this way, you can easily adjust what the threasholds are for
        // each grade level, the string array is just there because I decided to use a
        // for loop
        String[] gradeLevel = new String[4];
        gradeLevel[0] = "A";
        gradeLevel[1] = "B";
        gradeLevel[2] = "C";
        gradeLevel[3] = "D";
        // let's be honest, in this use case, JOptionPane is just the cooler version of
        // scanner and system.out.print
        String iNput = JOptionPane.showInputDialog(null, "What is your numerical grade?");
        int gRade = Integer.parseInt(iNput);
        if (gRade >= lowerLimit && gRade <= upperLimit) {
            if (gRade >= gradeThreasholds[0]) {
                JOptionPane.showMessageDialog(null, "Your grade is " + gradeLevel[0]);
            } else if (gRade < gradeThreasholds[3]) {
                for (int i = 0; i < 3; i++) {
                    if (gRade <= gradeThreasholds[i] && gRade > gradeThreasholds[i + 1]) {
                        JOptionPane.showMessageDialog(null, "Your grade is " + gradeLevel[i + 1]);
                    } /*
                       * removed this because this caused the you failed message to show mutiple times
                       * else if (grade <= gradeThreasholds[3]){ JOptionPane.showMessageDialog(null,
                       * "You failed."); }
                       */
                }
            } else {
                // taking this statement out of the for loop should improve the run time a lot,
                // but I don't think this program is long enough to warrant this kind of
                // optimization.
                // Also, this fixes the issue where the you failed message would showup mutiple
                // times.
                JOptionPane.showMessageDialog(null, "You failed.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }
}