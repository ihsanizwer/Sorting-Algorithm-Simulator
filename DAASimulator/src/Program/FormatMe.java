/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;


import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ihsan Izwer
 */
public class FormatMe {
 
    public static void setLabelText(JLabel l, String s){
        switch(s.length()){
            case 1:
                l.setText(" "+s+" ");
                break;
            case 2:
                l.setText(" "+s);
                break;
//            case 3:
//                l.setText(s);
//                break;
            default:
                l.setText(s);
        }
    }
    public static void enableTextBoxes(JTextField j1, JTextField j2,JTextField j3,JTextField j4,JTextField j5,JTextField j6,JTextField j7, JTextField j8, boolean b){
        
        j1.setEnabled(b);
        j2.setEnabled(b);
        j3.setEnabled(b);
        j4.setEnabled(b);
        j5.setEnabled(b);
        j6.setEnabled(b);
        j7.setEnabled(b);
        j8.setEnabled(b);
        
        if(b){
            j1.setText("");
            j2.setText("");
            j3.setText("");
            j4.setText("");
            j5.setText("");
            j6.setText("");
            j7.setText("");
            j8.setText("");
        }
    }
    
 
    public static boolean isValidInput(JTextField j){
        int dotcount =0;
       String s =j.getText();
        for(int i=0; i<(j.getText().toCharArray()).length; i++){
            if(i==0){
                if(!(s.charAt(i)=='-' || (s.charAt(i)>=0 && s.charAt(i)<=9))){
                    JOptionPane.showMessageDialog(null, "here");
                    return false;
                }
            }else{
                if(s.charAt(i)=='.')
                    dotcount++;
                if(!((s.charAt(i)>=0 && s.charAt(i)<=9) || (s.charAt(i)=='.' && dotcount==1))){
                    return false;
                }
            }
           
        }
        return true; 
    }
    
    public static boolean validateInputs(JTextField t1, JTextField t2, JTextField t3,JTextField t4, JTextField t5, JTextField t6, JTextField t7,JTextField t8){
        if(!isValidInput(t1)){
            JOptionPane.showMessageDialog(null, "Invalid number at first textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t2)){
            JOptionPane.showMessageDialog(null, "Invalid number at second textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t3)){
            JOptionPane.showMessageDialog(null, "Invalid number at third textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t4)){
            JOptionPane.showMessageDialog(null, "Invalid number at fourth textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t5)){
            JOptionPane.showMessageDialog(null, "Invalid number at fifth textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t6)){
            JOptionPane.showMessageDialog(null, "Invalid number at sixth textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t7)){
            JOptionPane.showMessageDialog(null, "Invalid number at seventh textfield. Renter a valid number");
            return false;
        }
        else if(!isValidInput(t8)){
            JOptionPane.showMessageDialog(null, "Invalid number at eighth textfield. Renter a valid number");
            return false;
        }else{
            return true;
        }
            
    }
    
//    public static boolean isEmpty(JTextField j){
//        return(j.getText()=="" || j.getText() ==null)
//    }
}
