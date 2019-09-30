/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.esercizio.NewClass;
import static com.mycompany.esercizio.NewClass.metodo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessi
 */
public class esercizioTest {
    
    public esercizioTest() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testEs() {
         String o=metodo(12,2);

         assertEquals(NewClass.metodo(12, 2),o);
     }
}
