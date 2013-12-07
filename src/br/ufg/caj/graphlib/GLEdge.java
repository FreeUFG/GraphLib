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

public class GLEdge {
    //ATTRIBUTES
    private GLVertex endPoint[];
    
    //CONSTRUCTORS
    public GLEdge(){
        this.endPoint = new GLVertex[2];
    }
    public GLEdge(String endPoint1, String endPoint2){
        this.endPoint = new GLVertex[2];
        this.endPoint[0] = new GLVertex(endPoint1);
        this.endPoint[1] = new GLVertex(endPoint2);
    }
    //GETs AND SETs
    public GLVertex[] getEndPoint(){
        return this.endPoint;
    }
    public void setEndPoint(GLVertex endPoint[]){
        if(endPoint.length == 2)
            this.endPoint = endPoint;
    }
    /**
     * It verifies if the edge contains a given vertex.
     * 
     * @param vertex
     * @return true, if the edge contains the vertex; or false, on the contrary.
     */
    public boolean contains(GLVertex vertex){
        if(this.endPoint[0].equals(vertex) ||
           this.endPoint[1].equals(vertex)      )
            return true;
        return false;
    }
    public String show(){
        return "{" + this.endPoint[0].getId() + ", " + this.endPoint[1].getId() + "}";
    }
}
