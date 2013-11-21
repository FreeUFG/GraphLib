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

public class Aresta {
    
    private Vertice ponta[];
    
    public Aresta(){
        this.ponta = new Vertice[2];
    }
    
    public Vertice[] getPonta(){
        return this.ponta;
    }
    public void setPonta(Vertice ponta[]){
        if(ponta.length == 2)
            this.ponta = ponta;
    }
    public String exibe(){
        return "{" + this.ponta[0].getId() + ", " + this.ponta[1].getId() + "}";
    }
    
}
