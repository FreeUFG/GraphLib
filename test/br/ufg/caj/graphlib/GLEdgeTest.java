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

import org.junit.Test;
import static org.junit.Assert.*;

public class GLEdgeTest {

    /**
     * Test of getEndPoint method, of class GLEdge.
     * @author Esdras Bispo Jr.
     */
    @Test
    public void testGetEndPoint() {
        GLEdge instance = new GLEdge("IdValue1", "IdValue2");
        
        GLVertex[] expResult = new GLVertex[2];
        expResult[0] = new GLVertex("IdValue1");
        expResult[1] = new GLVertex("IdValue2");
        
        GLVertex[] result = instance.getEndPoint();
        assertArrayEquals(expResult, result);
    }
}