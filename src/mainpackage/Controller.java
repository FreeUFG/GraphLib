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

import br.ufg.caj.graphlib.GLFactory;
import br.ufg.caj.graphlib.GLGraph;

public class Controller {

    public static void main(String[] args) {
        
        GLGraph g;
        
        g = GLFactory.path(4);
        
        g.show();
        
//        g = new Grafo();
//        
//        g.adVertice("a");
//        g.adVertice("b");
//        g.adVertice("c");
//        g.adVertice("d");
//        
//        g.adAresta("a", "b");
//        g.adAresta("b", "c");
//        g.adAresta("c", "d");
//        g.adAresta("d", "a");
//        
//        g.exibe();
    }
}
