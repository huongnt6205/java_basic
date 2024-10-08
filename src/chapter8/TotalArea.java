package chapter8;

import java.util.Random;

public class TotalArea {

    public static CircleWithPrivateDataFields[] createCircleArr() {
        CircleWithPrivateDataFields[] circleArr = new CircleWithPrivateDataFields[5];
        Random random = new Random();

        for (int i = 0; i < circleArr.length; i++) {
            double radius = random.nextDouble() * 100;
            circleArr[i] = new CircleWithPrivateDataFields(radius);
        }
        return circleArr;
    }

    public static double sum(CircleWithPrivateDataFields[] circleArr) {
        double sum = 0;

        for (int i = 0; i < circleArr.length; i++) {
            sum += circleArr[i].getArea();
        }
        return sum;
    }

    public static void printCircleArr(CircleWithPrivateDataFields[] circleArr) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArr.length; i++) {
            System.out.printf("%-30.2f%-15.2f\n", circleArr[i].getRadius(), circleArr[i].getArea());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.printf("%-30s%-15.2f\n", "Tổng diện tích của hình tròn là: ", sum(circleArr));
    }

    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArr;

        circleArr = createCircleArr();

        printCircleArr(circleArr);
    }
}
