package project;

import java.io.*;
import java.util.Scanner;
import MyExep.UnValidNumber;
import MyExep.negativeValueException;

public class Project {

    public static void main(String[] args) throws FileNotFoundException, negativeValueException, UnValidNumber {
        Geometry g = new Geometry();
        File f = new File("data.txt");
        Scanner sc = new Scanner(f);
        FileOutputStream fOS = new FileOutputStream("out.txt");
        PrintWriter pr = new PrintWriter(fOS);
        do {
            int num = sc.nextInt();
            try {
                if (g.checkNum(num)) {
                    switch (num) {
                        case 1: {
                            double radius = sc.nextDouble();
                            pr.print(g.circleArea(radius));
                            break;
                        }
                        case 2: {
                            double length = sc.nextDouble();
                            double width = sc.nextDouble();
                            pr.print(g.RectangleArea(length, width));
                            break;
                        }
                        case 3: {
                            double base = sc.nextDouble();
                            double height = sc.nextDouble();
                            pr.print(g.TraingleArea(base, height));

                            break;
                        }
                    }
                    if (num == 4) {
                        pr.print("Thanks ,You are welcome");
                        break;
                    }
                }
            } catch (UnValidNumber un) {
               pr.print("Try again");
            }
            pr.close();
        } while (true);

    }

}
