/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame2;

import membership.DataMember;
import membership.Gold;
import membership.Member;
import membership.Platinum;
import membership.Silver;

/**
 *
 * @author WIN10
 */
public class RentalConsoleGame2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member membership = new Member();
        membership.tambahMember(new DataMember("M001", "Mr. X", "Silver"));
        membership.tambahMember(new DataMember("M002", "Mr. Y", "Gold"));
        membership.tambahMember(new DataMember("M003", "Mr. Z", "Platinum"));
        
        DataMember member = membership.inputMember();
        switch(member.getJenis()) {
            case "Silver":
                Silver silver = new Silver(member);
                silver.calculatedServices();
                silver.output();
                break;
            case "Gold":
                Gold gold = new Gold(member);
                gold.calculatedServices();
                gold.output();
                break;
            case "Platinum":
                Platinum platinum = new Platinum(member);
                platinum.calculatedServices();
                platinum.output();
                break;
        }
    }
    
}
