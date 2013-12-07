/*
    Copyright © 2013 Esdras Bispo Jr.
   
    This file is part of GraphLib.

    GraphLib is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    GraphLib is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with GraphLib.  If not, see <http://www.gnu.org/licenses/>.
 */

package mainpackage;

import br.ufg.caj.graphlib.GLAlgorithm;
import br.ufg.caj.graphlib.GLFactory;
import br.ufg.caj.graphlib.GLGraph;

public class Controller {

    /**
    * It contains two minimal examples to use the library.
    * 
    * @author Esdras Lins Bispo Jr.
    */
    public static void main(String[] args) {
        
        GLGraph g1;
        g1 = GLFactory.path(4);
        g1.show();
        if(GLAlgorithm.isRegular(g1))
            System.out.println(g1.getName() + " is regular.");
        else System.out.println(g1.getName() + " is not regular.");
        
        GLGraph g2 = new GLGraph("Circuit 4");
        
        g2.addVertex("a");
        g2.addVertex("b");
        g2.addVertex("c");
        g2.addVertex("d");
        
        g2.addEdge("a", "b");
        g2.addEdge("b", "c");
        g2.addEdge("c", "d");
        g2.addEdge("d", "a");
        
        g2.show();
        if(GLAlgorithm.isRegular(g2))
            System.out.println(g2.getName() + " is regular.");
        else System.out.println(g2.getName() + " is not regular.");
    }
}
