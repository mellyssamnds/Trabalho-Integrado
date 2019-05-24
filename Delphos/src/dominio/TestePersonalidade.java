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
    private Gabarito gabarito;
    

    /* metodos setters e getters */
    
    public TestePersonalidade(IdGeneratorSingleton idTeste, Date dataHora, Usuario usuario, Gabarito gabarito){
    	this.idTeste = idTeste;
        this.dataHora = dataHora;
        this.usuario = usuario;
        this.gabarito = gabarito;
    }
    
    public IdGeneratorSingleton getIdTeste() {
        return idTeste;
    }
    
    public Date getDataHora() {
        return dataHora;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public Gabarito getGabarito() {
        return gabarito;
    }

        
    
    @SuppressWarnings("unchecked")
	public static HashMap<String, Integer> calculaResultado(Gabarito gab) {
    	
    	HashMap<String, Integer> listaResultado = new HashMap<String, Integer>();
    	
    	int notaEXT = 20;
    	int notaEST = 38;
    	int notaAGR = 14;
    	int notaCSN = 14;
    	int notaOPN = 8;
    	
    	
    	for(Map.Entry<String, Integer> entry : ((Map<String, Integer>) gab).entrySet()) {
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
    	
    	listaResultado.put("NotaEXT", notaEXT);
    	listaResultado.put("NotaEST", notaEST);
    	listaResultado.put("NotaAGR", notaAGR);
    	listaResultado.put("NotaCSN", notaCSN);
    	listaResultado.put("NotaOPN", notaOPN);
    	
		return listaResultado;
    }   
    
}
