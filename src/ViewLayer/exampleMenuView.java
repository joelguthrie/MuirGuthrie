/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

/**
 *
 * @author MIc
 */
public class exampleMenuView extends View {

    public exampleMenuView() {
        super("\n=====================================================================\n"
                + "\n A - temp1"
                + "\n B - temp2"
                + "\n C - temp3"
                + "\n D - temp4"
                + "\n W - what is this?"
                + "\n*E - Exit"
                + "\n=====================================================================\n");
    }

    @Override
    public boolean doAction(char selection) {

        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'A':
                this.stubFunction1();
                break;
            case 'B':
                this.stubFunction2();
                break;
            case 'C':
                this.stubFunction3();
                break;
            case 'D':
                this.stubFunction4();
                break;
            case 'W':
                this.stubFunction5();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }

        return false;
    }

    private void stubFunction1() {
        System.out.println("This is were you would call the first menu Item");
    }

    private void stubFunction2() {
        System.out.println("this is were you would call the sencond menu Item");
    }

    private void stubFunction3() {
        System.out.println("This is were you would call the third menu Item");
    }

    private void stubFunction4() {
        System.out.println("this is were you would call the fourth menu item");
    }

    private void stubFunction5() {
        System.out.println("this is so we can copy and paste this into other menu view classes if we need to make more menus as we build the game.");
    }

}
