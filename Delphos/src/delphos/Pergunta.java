/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package delphos;

import java.util.*;

public class Pergunta {
	
	String EXT1, EXT2, EXT3, EXT4, EXT5, EXT6, EXT7, EXT8, EXT9, EXT10;
	String EST1, EST2, EST3, EST4, EST5, EST6, EST7, EST8, EST9, EST10;
	String AGR1, AGR2, AGR3, AGR4, AGR5, AGR6, AGR7, AGR8, AGR9, AGR10;
	String CSN1, CSN2, CSN3, CSN4, CSN5, CSN6, CSN7, CSN8, CSN9, CSN10;
	String OPN1, OPN2, OPN3, OPN4, OPN5, OPN6, OPN7, OPN8, OPN9, OPN10;
	
	/* metodos set e getters */
	
	public void setDescricao() {
		this.EXT1 = "I am the life of the party";
		this.EXT2 = "I don't talk a lot";
		this.EXT3 = "I feel comfortable around people";
		this.EXT4 = "I keep in the background";
		this.EXT5 = "I start conversations";
		this.EXT6 = "I have little to say";
		this.EXT7 = "I talk to a lot of different people at parties";
		this.EXT8 = "I don't like to draw attention to myself";
		this.EXT9 = "I don't mind being the center of attention";
		this.EXT10 = "I am quiet around strangers";
		this.EST1 = "I get stressed out easily";
		this.EST2 = "I am relaxed most of the time";
		this.EST3 = "I worry about things";
		this.EST4 = "I seldom feel blue";
		this.EST5 = "I am easily disturbed";
		this.EST6 = "I get upset easily";
		this.EST7 = "I change my mood a lot";
		this.EST8 = "I have frequent mood swings";
		this.EST9 = "I get irritated easily";
		this.EST10 = "I often feel blue";
		this.AGR1 = "I feel little concern for others";
		this.AGR2 = "I am interested in people";
		this.AGR3 = "I insult people";
		this.AGR4 = "I sympathize with others' feelings";
		this.AGR5 = "I am not interested in other people's problems";
		this.AGR6 = "I have a soft heart";
		this.AGR7 = "I am not really interested in others";
		this.AGR8 = "I take time out for others";
		this.AGR9 = "I feel others' emotions";
		this.AGR10 = "I make people feel at ease";
		this.CSN1 = "I am always prepared";
		this.CSN2 = "I leave my belongings around";
		this.CSN3 = "I pay attention to details";
		this.CSN4 = "I make a mess of things";
		this.CSN5 = "I get chores done right away";
		this.CSN6 = "I often forget to put things back in their proper place";
		this.CSN7 = "I like order";
		this.CSN8 = "I shirk my duties";
		this.CSN9 = "I follow a schedule";
		this.CSN10 = "I am exacting in my work";
		this.OPN1 = "I have a rich vocabulary";
		this.OPN2 = "I have difficulty understanding abstract ideas";
		this.OPN3 = "I have a vivid imagination";
		this.OPN4 = "I am not interested in abstract ideas";
		this.OPN5 = "I have excellent ideas";
		this.OPN6 = "I do not have a good imagination";
		this.OPN7 = "I am quick to understand things";
		this.OPN8 = "I use difficult words";
		this.OPN9 = "I spend time reflecting on things";
		this.OPN10 = "I am full of ideas";
	}
	
	public String getDescricao(String idPergunta) {
		return String.valueOf(idPergunta);
	}
	
    
	/* outros metodos da classe */
	
	public  Map<String, String> ListaPerguntas() {
		
		Map<String, String> listaPerguntas = new HashMap<String, String>();
		
		for (char i = 1; i <= 10; i++) {
			/* fator EXT */
			String fatorEXT = "EXT"+ i;
			listaPerguntas.put(fatorEXT, getDescricao(fatorEXT));
			
			/* fator EST */
			String fatorEST = "EST"+ i;
			listaPerguntas.put(fatorEST, getDescricao(fatorEST));
			
			/* fator AGR */
			String fatorAGR = "AGR"+ i;
			listaPerguntas.put(fatorAGR, getDescricao(fatorAGR));
			
			/* fator CSN */
			String fatorCSN = "CSN"+ i;
			listaPerguntas.put(fatorCSN, getDescricao(fatorCSN));
			
			/* fator OPN */
			String fatorOPN = "OPN" + i;
			listaPerguntas.put(fatorOPN, getDescricao(fatorOPN));
		}
		
		return listaPerguntas;
	}
}