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
    private Set<GLVertex> v;
    private Set<GLEdge> e;
    private String name;
    
    //CONSTRUCTORS
    public GLGraph(){
        this.v = new HashSet<GLVertex>();
        this.e = new HashSet<GLEdge>();
        this.name = "";
    }
    public GLGraph(String name){
        this.v = new HashSet<GLVertex>();
        this.e = new HashSet<GLEdge>();
        this.name = name;
    }
    //GETs AND SETs
    public Set<GLVertex> getV(){
        return this.v;
    }
    public Set<GLEdge> getE(){
        return this.e;
    }
    public String getName(){
        return this.name;
    }
    public void setV(Set<GLVertex> v){
        this.v = v;
    }
    public void setE(Set<GLEdge> a){
        this.e = a;
    }
    public void setName(String name){
        this.name = name;
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
    /**
     * It shows vertex set (V) and edge set (E) in terminal.
     * 
     * @author Esdras Lins Bispo Jr.
     */
    public void show(){
        String output = "";
        
        //It prepares graph name
        if(!this.name.isEmpty()){
            output += "================================";
            output += "Graph Name: " + this.name + "\n";
            output += "================================";
        }
        
        //It prepares vertex set
        output = "\nV = { ";
        for(GLVertex vertex : this.v){
            output += vertex.getId() + ", ";
        }
        output = output.substring(0, output.length() -2);
        output += " }";
        
        //It prepares edge set
        output += "\nE = {";
        for(GLEdge edgde : this.e){
            output += edgde.show() + ", ";
        }
        output = output.substring(0, output.length() -2);
        output += " }\n";
        
        System.out.print(output);   //It shows in terminal
    }
}