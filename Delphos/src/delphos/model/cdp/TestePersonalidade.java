/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package delphos.model.cdp;

import java.util.*;

/**
 *
 * @author Jennifer, Anne
 */
public class TestePersonalidade  {
	
  //private IdGeneratorSingleton idTeste = IdGeneratorSingleton.getInstance().getNextSerial()
    private Date dataHora;
    private long idTeste;
    private Usuario cliente;
    private HashMap<String, Integer> listaRespostas;
    private HashMap<String, Integer> listaResultado = new HashMap<>();
    
    
//    public TestePersonalidade(Cliente cliente, HashMap<String,Integer> listaRespostas){
//        this.cliente = cliente;
//        this.listaRespostas = listaRespostas;
//    }
    
//    public TestePersonalidade(Cliente cliente, HashMap<String,Integer> listaRespostas, Date dataHora){
//    	//this.idTeste = idTeste;
//        this.dataHora = dataHora;
//        this.cliente = cliente;
//        this.listaRespostas = listaRespostas;
//    }
    
    /* metodos setters e getters */
    
    public long getIdTeste() {
        return this.idTeste;
    }
    
    public Date getDataHora() {
        return this.dataHora;
    }
    
    public Usuario getCliente() {
        return this.cliente;
    }
    
    public HashMap<String, Integer> getListaRespostas(){
        return this.listaRespostas;
    }

    public void setListaRespostas(HashMap<String, Integer> listaRespostas) {
        this.listaRespostas = listaRespostas;
    }

    public void setListaResultado(HashMap<String, Integer> listaResultado) {
        this.listaResultado = listaResultado;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public void setIdTeste(long idTeste) {
        this.idTeste = idTeste;
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
    
    public String exibeRespostasStr(){
        
        return this.listaRespostas.toString();
    }
}
