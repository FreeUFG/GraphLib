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

import java.util.Objects;

public class GLVertex {
    //ATTRIBUTES
    private String id;
    
    //CONSTRUCTORS
    public GLVertex(){
        
    }
    public GLVertex(String id){
        this.id = id;
    }
    
    //GETs AND SETs
    public String getId(){
        return this.id;
    }
    //OTHER METHODS
    public void setId(String id){
        this.id = id;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GLVertex other = (GLVertex) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
