/* This program mathematically manipulates an original number and prints the answer
Created by Elizabeth Akomolafe on Feb 5, 2020
Intermediate Programming - Block 8
*/
public class MathMagic {
  public static void main(String[] args){

    //the original number
    int myNumber = 2;

    int stepOne = myNumber * myNumber;

    int stepTwo = stepOne + myNumber;

    int stepThree = stepTwo / myNumber;

    int stepFour = stepThree + 17;

    int stepFive = stepFour - myNumber;

    int stepSix = stepFive / 6;

  System.out.println(stepSix);
  }
}
