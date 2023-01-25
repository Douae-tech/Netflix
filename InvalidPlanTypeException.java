/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment;

public class InvalidPlanTypeException extends Exception {

    public InvalidPlanTypeException(String PlanType) {
        super("The plan Chosen " + PlanType + " does not exist");
    }

    public String[] getValidPlanType() {
        Plantype type[] = Plantype.values();
        String[] plans = new String[type.length];
        for (int i = 0; i < type.length; i++) {
            plans[i] = type[i].name();
        }

        return plans;
    }

}
