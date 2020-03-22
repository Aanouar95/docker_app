package fr.univtln.asayadi246;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Model model = new Model();
        Iterator it = model.getAllActors().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
