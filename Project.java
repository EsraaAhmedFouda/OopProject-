package project;

import java.io.*;
import java.util.Scanner;
import MyExep.UnValidNumber;
import MyExep.negativeValueException;

public class Project {

    public static void main(String[] args) throws FileNotFoundException, negativeValueException, UnValidNumber {
        
        File f = new File("data.txt");
        Scanner sc = new Scanner(f);
        FileOutputStream fOS = new FileOutputStream("out.txt");
        PrintWriter pr = new PrintWriter(fOS);
        do {
pr.print("MENUE /n 1. circle area /n 2.rectangle area /n 3.square area /n 4.quite /n Enter Your Choice");
            int num = sc.nextInt();
            try {
                if (Geometry.checkNum(num)) {
                    switch (num) {
                        case 1: {
                            double radius = sc.nextDouble();
                            pr.print(Geometry.circleArea(radius));
                            break;
                        }
                        case 2: {
                            double length = sc.nextDouble();
                            double width = sc.nextDouble();
                            pr.print(Geometry.RectangleArea(length, width));
                            break;
                        }
                        case 3: {
                            double base = sc.nextDouble();
                            double height = sc.nextDouble();
                            pr.print(Geometry.TraingleArea(base, height));

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
