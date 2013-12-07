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

public class GLFactory {
    //OTHER METHODS
    public static GLGraph k(int n){
        
        GLGraph g = new GLGraph();
        
        g.setName("K " + n);
        for(int i=1; i<=n; i++){
            g.addVertex("v" + i);
        }
        
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                g.addEdge("v" + i, "v" + j);
            }
        }
        
        return g;
    }
    public static GLGraph path(int n){
        
        GLGraph g = new GLGraph();
        
        g.setName("Path " + (n-1));
        for(int i=1; i<=n; i++){
            g.addVertex("v" + i);
        }
        
        for(int i=1; i<n; i++){
            g.addEdge("v" + i, "v" + (i+1));
        }
        
        return g;
    }
    public static GLGraph circuit(int n){
        
        GLGraph g = path(n);
        
        g.setName("Circuit " + n);
        g.addEdge("v1", "v" + n);
        
        return g;
    }    
}