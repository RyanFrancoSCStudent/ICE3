/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/* Muhammad's vesion 

*/
package midtermgitcode2.ice3;

/**
 *
 * @author User
 */
public class ICE3 {

    public static void main(String[] args) {
        Client c1 = new Client("Rob");
        Client c2 = new Client("Victoria");

        Client[] clients = { c1, c2 };
        LittleGirl girl = new LittleGirl(clients);
        Bakery bakery = new Bakery(girl);

        bakery.start();
       
        System.out.println("This is Rev");
    }
}
