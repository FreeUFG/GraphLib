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

package br.ufg.caj.graphlib;

import java.util.Set;

public class GLAlgorithm {
    /**
     * It verifies if the graph is or not regular.
     * 
     * @param g
     * @return true, if the graph is regular; or false, on the contrary.
     */
    public static boolean isRegular(GLGraph g){
        
        Set<GLVertex> allVertices;
        
        allVertices = g.getV();
        int degree = -1;
        
        for(GLVertex vertex : allVertices){
            if(degree != -1){
                if(g.degreeOf(vertex) != degree)
                    return false;
            }
            else degree = g.degreeOf(vertex);
        }
        
        return true;
    }
    
}
