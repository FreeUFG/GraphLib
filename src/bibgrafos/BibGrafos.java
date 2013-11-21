/*
    Copyright © 2013 Esdras Bispo Jr.
   
    This file is part of BibGrafos.

    BibGrafos is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    BibGrafos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with BibGrafos.  If not, see <http://www.gnu.org/licenses/>.
 */

package bibgrafos;

public class BibGrafos {

    public static void main(String[] args) {
        
        Grafo g;
        
        g = FabricaGrafos.caminho(4);
        
        g.exibe();
        
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
