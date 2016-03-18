/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class testMenuView extends View {

    public testMenuView() {
        super("\n=====================================================================\n"
                + "\n A - askDivisionQuestion"
                + "\n B - askMuliQuestion"
                + "\n C - temp3"
                + "\n D - temp4"
                + "\n* E - Exit"
                + "\n=====================================================================\n");
    }

    @Override
    public boolean doAction(char selection) {

        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'A':
                this.askDivisionQuestion();
                break;
            case 'B':
                this.MuliQuestion();
                break;
            case 'C':
                this.stubFunction3();
                break;
            case 'D':
                this.stubFunction4();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }

        return false;
    }

    private void stubFunction3() {
        System.out.println("stubFunction3 was called");
    }

    private void stubFunction4() {
        System.out.println("stubFunction4 was called");
    }

    private void askDivisionQuestion() {
        askDivisionQuestion askDivisionQuestion = new askDivisionQuestion();
        askDivisionQuestion.askDivisionQuestion();
    }

    private void MuliQuestion() {
        askMultiQuestion askMultiQuestion = new askMultiQuestion();
        askMultiQuestion.askQuestion();
    }

}
