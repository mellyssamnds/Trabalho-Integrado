/*
 * Anne Caroline Silva
 *
 */

package dominio;

import java.util.*;

public class Pergunta {
	
	String EXT1 = "I am the life of the party";
	String EXT2 = "I don't talk a lot";
	String EXT3 = "I feel comfortable around people";
	String EXT4 = "I keep in the background";
	String EXT5 = "I start conversations";
	String EXT6 = "I have little to say";
	String EXT7 = "I talk to a lot of different people at parties";
	String EXT8 = "I don't like to draw attention to myself";
	String EXT9 = "I don't mind being the center of attention";
	String EXT10 = "I am quiet around strangers";
	String EST1 = "I get stressed out easily";
	String EST2 = "I am relaxed most of the time";
	String EST3 = "I worry about things";
	String EST4 = "I seldom feel blue";
	String EST5 = "I am easily disturbed";
	String EST6 = "I get upset easily";
	String EST7 = "I change my mood a lot";
	String EST8 = "I have frequent mood swings";
	String EST9 = "I get irritated easily";
	String EST10 = "I often feel blue";
	String AGR1 = "I feel little concern for others";
	String AGR2 = "I am interested in people";
	String AGR3 = "I insult people";
	String AGR4 = "I sympathize with others' feelings";
	String AGR5 = "I am not interested in other people's problems";
	String AGR6 = "I have a soft heart";
	String AGR7 = "I am not really interested in others";
	String AGR8 = "I take time out for others";
	String AGR9 = "I feel others' emotions";
	String AGR10 = "I make people feel at ease";
	String CSN1 = "I am always prepared";
	String CSN2 = "I leave my belongings around";
	String CSN3 = "I pay attention to details";
	String CSN4 = "I make a mess of things";
	String CSN5 = "I get chores done right away";
	String CSN6 = "I often forget to put things back in their proper place";
	String CSN7 = "I like order";
	String CSN8 = "I shirk my duties";
	String CSN9 = "I follow a schedule";
	String CSN10 = "I am exacting in my work";
	String OPN1 = "I have a rich vocabulary";
	String OPN2 = "I have difficulty understanding abstract ideas";
	String OPN3 = "I have a vivid imagination";
	String OPN4 = "I am not interested in abstract ideas";
	String OPN5 = "I have excellent ideas";
	String OPN6 = "I do not have a good imagination";
	String OPN7 = "I am quick to understand things";
	String OPN8 = "I use difficult words";
	String OPN9 = "I spend time reflecting on things";
	String OPN10 = "I am full of ideas";
	
	/* metodos setters */
	
	public void setEXT1(String EXT1) {
		this.EXT1 = EXT1;
	}
	public void setEXT2(String EXT2) {
		this.EXT2 = EXT2;
	}
	public void setEXT3(String EXT3) {
		this.EXT3 = EXT3;
	}
	public void setEXT4(String EXT4) {
		this.EXT4 = EXT4;
	}
	public void setEXT5(String EXT5) {
		this.EXT5 = EXT5;
	}
	public void setEXT6(String EXT6) {
		this.EXT6 = EXT6;
	}
	public void setEXT7(String EXT7) {
		this.EXT7 = EXT7;
	}
	public void setEXT8(String EXT8) {
		this.EXT8 = EXT8;
	}
	public void setEXT9(String EXT9) {
		this.EXT9 = EXT9;
	}
	public void setEXT10(String EXT10) {
		this.EXT10 = EXT10;
	}
	public void setEST1(String EST1) {
		this.EST1 = EST1;
	}
	public void setEST2(String EST2) {
		this.EST2 = EST2;
	}
	public void setEST3(String EST3) {
		this.EST3 = EST3;
	}
	public void setEST4(String EST4) {
		this.EST4 = EST4;
	}
	public void setEST5(String EST5) {
		this.EST5 = EST5;
	}
	public void setEST6(String EST6) {
		this.EST6 = EST6;
	}
	public void setEST7(String EST7) {
		this.EST7 = EST7;
	}
	public void setEST8(String EST8) {
		this.EST8 = EST8;
	}
	public void setEST9(String EST9) {
		this.EST9 = EST9;
	}
	public void setEST10(String EST10) {
		this.EST10 = EST10;
	}
	public void setAGR1(String AGR1) {
		this.AGR1 = AGR1;
	}
	public void setAGR2(String AGR2) {
		this.AGR2 = AGR2;
	}
	public void setAGR3(String AGR3) {
		this.AGR3 = AGR3;
	}
	public void setAGR4(String AGR4) {
		this.AGR4 = AGR4;
	}
	public void setAGR5(String AGR5) {
		this.AGR5 = AGR5;
	}
	public void setAGR6(String AGR6) {
		this.AGR6 = AGR6;
	}
	public void setAGR7(String AGR7) {
		this.AGR7 = AGR7;
	}
	public void setAGR8(String AGR8) {
		this.AGR8 = AGR8;
	}
	public void setAGR9(String AGR9) {
		this.AGR9 = AGR9;
	}
	public void setAGR10(String AGR10) {
		this.AGR10 = AGR10;
	}
	public void setCSN1(String CSN1) {
		this.CSN1 = CSN1;
	}
	public void setCSN2(String CSN2) {
		this.CSN2 = CSN2;
	}
	public void setCSN3(String CSN3) {
		this.CSN3 = CSN3;
	}
	public void setCSN4(String CSN4) {
		this.CSN4 = CSN4;
	}
	public void setCSN5(String CSN5) {
		this.CSN5 = CSN5;
	}
	public void setCSN6(String CSN6) {
		this.CSN6 = CSN6;
	}
	public void setCSN7(String CSN7) {
		this.CSN7 = CSN7;
	}
	public void setCSN8(String CSN8) {
		this.CSN8 = CSN8;
	}
	public void setCSN9(String CSN9) {
		this.CSN9 = CSN9;
	}
	public void setCSN10(String CSN10) {
		this.CSN10 = CSN10;
	}
	public void setOPN1(String OPN1) {
		this.OPN1 = OPN1;
	}
	public void setOPN2(String OPN2) {
		this.OPN2 = OPN2;
	}
	public void setOPN3(String OPN3) {
		this.OPN3 = OPN3;
	}
	public void setOPN4(String OPN4) {
		this.OPN4 = OPN4;
	}
	public void setOPN5(String OPN5) {
		this.OPN5 = OPN5;
	}
	public void setOPN6(String OPN6) {
		this.OPN6 = OPN6;
	}
	public void setOPN7(String OPN7) {
		this.OPN7 = OPN7;
	}
	public void setOPN8(String OPN8) {
		this.OPN8 = OPN8;
	}
	public void setOPN9(String OPN9) {
		this.OPN9 = OPN9;
	}
	public void setOPN10(String OPN10) {
		this.OPN10 = OPN10;
	}
	

	public Pergunta() {
		this.listaPerguntas();
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getListaKeys() {
		return (List<String>) listaPerguntas().keySet();
	}
	
	public String getTextoPergunta(String key) {
		HashMap<String, String> listaPerguntas  = new HashMap<String,String>();
		String texto = listaPerguntas.get(key);
		return texto;
	}
        
        
	/* metodo get generico*/
	public String getDescricao(String p) {
		String desc = "";
		if (p.equalsIgnoreCase("EXT1")) {
			desc = EXT1;
		}else if (p.equalsIgnoreCase("EXT2")){
			desc = EXT2;
		}else if (p.equalsIgnoreCase("EXT3")){
			desc = EXT3;
		}else if (p.equalsIgnoreCase("EXT4")){
			desc = EXT4;
		}else if (p.equalsIgnoreCase("EXT5")){
			desc = EXT5;
		}else if (p.equalsIgnoreCase("EXT6")){
			desc = EXT6;
		}else if (p.equalsIgnoreCase("EXT7")){
			desc = EXT7;
		}else if (p.equalsIgnoreCase("EXT8")){
			desc = EXT8;
		}else if (p.equalsIgnoreCase("EXT9")){
			desc = EXT9;
		}else if (p.equalsIgnoreCase("EXT10")){
			desc = EXT10;
		}else if (p.equalsIgnoreCase("EST1")){
			desc = EST1;
		}else if (p.equalsIgnoreCase("EST2")){
			desc = EST2;
		}else if (p.equalsIgnoreCase("EST3")){
			desc = EST3;
		}else if (p.equalsIgnoreCase("EST4")){
			desc = EST4;
		}else if (p.equalsIgnoreCase("EST5")){
			desc = EST5;
		}else if (p.equalsIgnoreCase("EST6")){
			desc = EST6;
		}else if (p.equalsIgnoreCase("EST7")){
			desc = EST7;
		}else if (p.equalsIgnoreCase("EST8")){
			desc = EST8;
		}else if (p.equalsIgnoreCase("EST9")){
			desc = EST9;
		}else if (p.equalsIgnoreCase("EST10")){
			desc = EST10;
		}else if (p.equalsIgnoreCase("AGR1")){
			desc = AGR1;
		}else if (p.equalsIgnoreCase("AGR2")){
			desc = AGR2;
		}else if (p.equalsIgnoreCase("AGR3")){
			desc = AGR3;
		}else if (p.equalsIgnoreCase("AGR4")){
			desc = AGR4;
		}else if (p.equalsIgnoreCase("AGR5")){
			desc = AGR5;
		}else if (p.equalsIgnoreCase("AGR6")){
			desc = AGR6;
		}else if (p.equalsIgnoreCase("AGR7")){
			desc = AGR7;
		}else if (p.equalsIgnoreCase("AGR8")){
			desc = AGR8;
		}else if (p.equalsIgnoreCase("AGR9")){
			desc = AGR9;
		}else if (p.equalsIgnoreCase("AGR10")){
			desc = AGR10;
		}else if (p.equalsIgnoreCase("CSN1")){
			desc = CSN1;
		}else if (p.equalsIgnoreCase("CSN2")){
			desc = CSN2;
		}else if (p.equalsIgnoreCase("CSN3")){
			desc = CSN3;
		}else if (p.equalsIgnoreCase("CSN4")){
			desc = CSN4;
		}else if (p.equalsIgnoreCase("CSN5")){
			desc = CSN5;
		}else if (p.equalsIgnoreCase("CSN6")){
			desc = CSN6;
		}else if (p.equalsIgnoreCase("CSN7")){
			desc = CSN7;
		}else if (p.equalsIgnoreCase("CSN8")){
			desc = CSN8;
		}else if (p.equalsIgnoreCase("CSN9")){
			desc = CSN9;
		}else if (p.equalsIgnoreCase("CSN10")){
			desc = CSN10;
		}else if (p.equalsIgnoreCase("OPN1")){
			desc = OPN1;
		}else if (p.equalsIgnoreCase("OPN2")){
			desc = OPN2;
		}else if (p.equalsIgnoreCase("OPN3")){
			desc = OPN3;
		}else if (p.equalsIgnoreCase("OPN4")){
			desc = OPN4;
		}else if (p.equalsIgnoreCase("OPN5")){
			desc = OPN5;
		}else if (p.equalsIgnoreCase("OPN6")){
			desc = OPN6;
		}else if (p.equalsIgnoreCase("OPN7")){
			desc = OPN7;
		}else if (p.equalsIgnoreCase("OPN8")){
			desc = OPN8;
		}else if (p.equalsIgnoreCase("OPN9")){
			desc = OPN9;
		}else{
			desc = OPN10;
		}
		
		return desc;
	}
                
	/* outros metodos da classe */
	
	public  HashMap<String, String> listaPerguntas() {
						
		HashMap<String, String> listaPerg = new HashMap<String, String>();
		
		for (int i = 1; i <= 10; i++) {						
			
			/* fator EXT */
			String fatorEXT = "EXT" + i;
			listaPerg.put(fatorEXT, getDescricao(fatorEXT));
			
			/* fator EST */
			String fatorEST = "EST" + i;
			listaPerg.put(fatorEST, getDescricao(fatorEST));
			
			/* fator AGR */
			String fatorAGR = "AGR" + i;
			listaPerg.put(fatorAGR, getDescricao(fatorAGR));
			
			/* fator CSN */
			String fatorCSN = "CSN" + i;
			listaPerg.put(fatorCSN, getDescricao(fatorCSN));
			
			/* fator OPN */
			String fatorOPN = "OPN" + i;
			listaPerg.put(fatorOPN, getDescricao(fatorOPN));
		}
		
		return listaPerg;
	}
}