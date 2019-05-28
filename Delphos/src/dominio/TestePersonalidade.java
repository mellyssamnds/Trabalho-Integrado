/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.util.*;

/**
 *
 * @author Jennifer, Anne
 */
public class TestePersonalidade extends IdGeneratorSingleton {
	
    private IdGeneratorSingleton idTeste = IdGeneratorSingleton.getInstance();
    private Date dataHora;
    private Usuario usuario;
    private HashMap<String, Integer> listaResultado;
    //private Gabarito gabarito;
    

    /* metodos setters e getters */
    
//    public TestePersonalidade(Usuario usuario){
//    	//this.idTeste = idTeste;
//        //this.dataHora = dataHora;
//        this.usuario = usuario;
//        this.listaResultado = new HashMap<String, Integer>() ;
//    }
    
    public IdGeneratorSingleton getIdTeste() {
        return idTeste;
    }
    
    public Date getDataHora() {
        return dataHora;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

 
	public HashMap<String, Integer> calculaResultado(HashMap<String, Integer> listaRespostas) {
    	
    	int notaEXT = 20;
    	int notaEST = 38;
    	int notaAGR = 14;
    	int notaCSN = 14;
    	int notaOPN = 8;
    	
    	
    	for(Map.Entry<String, Integer> entry : listaRespostas.entrySet()) {
    		if(entry.getKey().equalsIgnoreCase("EXT1")) {
    			notaEXT += entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT2")) {
    			notaEXT -= entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT3")) {
    			notaEXT += entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT4")) {
    			notaEXT -= entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT5")) {
    			notaEXT += entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT6")) {
    			notaEXT -= entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT7")) {
    			notaEXT += entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT8")) {
    			notaEXT -= entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT9")) {
    			notaEXT += entry.getValue();
    		} else if(entry.getKey().equalsIgnoreCase("EXT10")) {
    			notaEXT -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST1")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST2")) {
    			notaEST += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST3")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST4")) {
    			notaEST += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST5")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST6")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST7")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST8")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST9")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("EST10")) {
    			notaEST -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR1")) {
    			notaAGR -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR2")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR3")) {
    			notaAGR -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR4")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR5")) {
    			notaAGR -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR6")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR7")) {
    			notaAGR -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR8")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR9")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("AGR10")) {
    			notaAGR += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN1")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN2")) {
    			notaCSN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN3")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN4")) {
    			notaCSN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN5")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN6")) {
    			notaCSN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN7")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN8")) {
    			notaCSN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN9")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("CSN10")) {
    			notaCSN += entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN1")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN2")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN3")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN4")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN5")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN6")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN7")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN8")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN9")) {
    			notaOPN -= entry.getValue();
    		}  else if(entry.getKey().equalsIgnoreCase("OPN10")) {
    			notaOPN -= entry.getValue();
    		}
    		
    	}
    	
    	this.listaResultado.put("NotaEXT", notaEXT);
    	this.listaResultado.put("NotaEST", notaEST);
    	this.listaResultado.put("NotaAGR", notaAGR);
    	this.listaResultado.put("NotaCSN", notaCSN);
    	this.listaResultado.put("NotaOPN", notaOPN);
    	
	return this.listaResultado;
    }
        
        
    public String exibeResultadoStr(){
        
        return this.listaResultado.toString();
    }
}
