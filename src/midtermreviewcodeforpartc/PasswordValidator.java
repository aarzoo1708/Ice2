/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 * A class that validates passwords based on customizable criteria.
 * The criteria for a valid password are defined by the minimum length
 * and the minimum count of special characters.
 * 
 * @author Aarzoo
 */
public class PasswordValidator {
    private final int minLength;
    private final int minSpecialCharCount;

    public PasswordValidator(int minLength, int minSpecialCharCount) {
        this.minLength = minLength;
        this.minSpecialCharCount = minSpecialCharCount;
    }

    public boolean isValid(String password) {
        int specialCharCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                specialCharCount++;
            }
        }

        return (specialCharCount >= minSpecialCharCount) && (password.length() >= minLength);
    }
}

