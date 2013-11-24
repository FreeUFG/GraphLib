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

import java.util.HashSet;
import java.util.Set;

public class GLGraph {
    //ATTRIBUTES
    private Set<GLEdge> e;
    private Set<GLVertex> v;
    
    //CONSTRUCTORS
    public GLGraph(){
        e = new HashSet<GLEdge>();
        v = new HashSet<GLVertex>();
    }
    //GETs AND SETs
    public Set<GLEdge> getE(){
        return this.e;
    }
    public Set<GLVertex> getV(){
        return this.v;
    }
    public void setE(Set<GLEdge> a){
        this.e = a;
    }
    public void setV(Set<GLVertex> v){
        this.v = v;
    }
    public int getN(){
        return this.v.size();
    }
    public int getM(){
        return this.e.size();
    }
    //OTHER METHODS
    public void addVertex(String id){
        GLVertex vNovo;
        
        vNovo = new GLVertex();
        vNovo.setId(id);
        
        this.v.add(vNovo);
    }
    public void addEdge(String id1, String id2){
        GLVertex vNovo[] = new GLVertex[2];
        
        vNovo[0] = new GLVertex();
        vNovo[1] = new GLVertex();
        
        vNovo[0].setId(id1);
        vNovo[1].setId(id2);
        
        this.v.add(vNovo[0]);
        this.v.add(vNovo[1]);        
        
        GLEdge ares = new GLEdge();
        ares.setEndPoint(vNovo);
        this.e.add(ares);
    }
    public void show(){
        
        System.out.println("V = {");
        for(GLVertex vt : this.v){
            System.out.println("\t" + vt.getId());
        }
        System.out.print("}");
        
        System.out.println("A = {");
        for(GLEdge ar : this.e){
            System.out.println("\t" + ar.show());
        }
        System.out.print("}");
        
        
    }
}