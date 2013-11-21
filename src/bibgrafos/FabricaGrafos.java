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

public class FabricaGrafos {
    
    public static Grafo k(int n){
        
        Grafo g = new Grafo();
        
        for(int i=1; i<=n; i++){
            g.adVertice("v" + i);
        }
        
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                g.adAresta("v" + i, "v" + j);
            }
        }
        
        return g;
    }
    public static Grafo caminho(int n){
        
        Grafo g = new Grafo();
        
        for(int i=1; i<=n; i++){
            g.adVertice("v" + i);
        }
        
        for(int i=1; i<n; i++){
            g.adAresta("v" + i, "v" + (i+1));
        }
        
        return g;
    }
    public static Grafo circuito(int n){
        
        Grafo g = caminho(n);
        
        g.adAresta("v1", "v" + n);
        
        return g;
    }    
}