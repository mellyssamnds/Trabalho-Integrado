/*
 * Anne Caroline Silva
 * 16/04/2019
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
	

	/* metodos getters */
	public String getEXT1() {
		return EXT1;
	}
	public String getEXT2() {
		return EXT2;
	}
	public String getEXT3() {
		return EXT3;
	}
	public String getEXT4() {
		return EXT4;
	}
	public String getEXT5() {
		return EXT5;
	}
	public String getEXT6() {
		return EXT6;
	}
	public String getEXT7() {
		return EXT7;
	}
	public String getEXT8() {
		return EXT8;
	}
	public String getEXT9() {
		return EXT9;
	}
	public String getEXT10() {
		return EXT10;
	}
	public String getEST1() {
		return EST1;
	}
	public String getEST2() {
		return EST2;
	}
	public String getEST3() {
		return EST3;
	}
	public String getEST4() {
		return EST4;
	}
	public String getEST5() {
		return EST5;
	}
	public String getEST6() {
		return EST6;
	}
	public String getEST7() {
		return EST7;
	}
	public String getEST8() {
		return EST8;
	}
	public String getEST9() {
		return EST9;
	}
	public String getEST10() {
		return EST10;
	}
	public String getAGR1() {
		return AGR1;
	}
	public String getAGR2() {
		return AGR2;
	}
	public String getAGR3() {
		return AGR3;
	}
	public String getAGR4() {
		return AGR4;
	}
	public String getAGR5() {
		return AGR5;
	}
	public String getAGR6() {
		return AGR6;
	}
	public String getAGR7() {
		return AGR7;
	}
	public String getAGR8() {
		return AGR8;
	}
	public String getAGR9() {
		return AGR9;
	}
	public String getAGR10() {
		return AGR10;
	}
	public String getCSN1() {
		return CSN1;
	}
	public String getCSN2() {
		return CSN2;
	}
	public String getCSN3() {
		return CSN3;
	}
	public String getCSN4() {
		return CSN4;
	}
	public String getCSN5() {
		return CSN5;
	}
	public String getCSN6() {
		return CSN6;
	}
	public String getCSN7() {
		return CSN7;
	}
	public String getCSN8() {
		return CSN8;
	}
	public String getCSN9() {
		return CSN9;
	}
	public String getCSN10() {
		return CSN10;
	}
	public String getOPN1() {
		return OPN1;
	}
	public String getOPN2() {
		return OPN2;
	}
	public String getOPN3() {
		return OPN3;
	}
	public String getOPN4() {
		return OPN4;
	}
	public String getOPN5() {
		return OPN5;
	}
	public String getOPN6() {
		return OPN6;
	}
	public String getOPN7() {
		return OPN7;
	}
	public String getOPN8() {
		return OPN8;
	}
	public String getOPN9() {
		return OPN9;
	}
	public String getOPN10() {
		return OPN10;
	}
        
        
	/* metodo get generico*/
	public String getDescricao(String p) {
		String desc = "";
		if (p.equalsIgnoreCase("EXT1")) {
			desc = EXT1;
		}else if (p.equalsIgnoreCase("EXT2")){
			desc = getEXT2();
		}else if (p.equalsIgnoreCase("EXT3")){
			desc = getEXT3();
		}else if (p.equalsIgnoreCase("EXT4")){
			desc = getEXT4();
		}else if (p.equalsIgnoreCase("EXT5")){
			desc = getEXT5();
		}else if (p.equalsIgnoreCase("EXT6")){
			desc = getEXT6();
		}else if (p.equalsIgnoreCase("EXT7")){
			desc = getEXT7();
		}else if (p.equalsIgnoreCase("EXT8")){
			desc = getEXT8();
		}else if (p.equalsIgnoreCase("EXT9")){
			desc = getEXT9();
		}else if (p.equalsIgnoreCase("EXT10")){
			desc = getEXT10();
		}else if (p.equalsIgnoreCase("EST1")){
			desc = getEST1();
		}else if (p.equalsIgnoreCase("EST2")){
			desc = getEST2();
		}else if (p.equalsIgnoreCase("EST3")){
			desc = getEST3();
		}else if (p.equalsIgnoreCase("EST4")){
			desc = getEST4();
		}else if (p.equalsIgnoreCase("EST5")){
			desc = getEST5();
		}else if (p.equalsIgnoreCase("EST6")){
			desc = getEST6();
		}else if (p.equalsIgnoreCase("EST7")){
			desc = getEST7();
		}else if (p.equalsIgnoreCase("EST8")){
			desc = getEST8();
		}else if (p.equalsIgnoreCase("EST9")){
			desc = getEST9();
		}else if (p.equalsIgnoreCase("EST10")){
			desc = getEST10();
		}else if (p.equalsIgnoreCase("AGR1")){
			desc = getAGR1();
		}else if (p.equalsIgnoreCase("AGR2")){
			desc = getAGR2();
		}else if (p.equalsIgnoreCase("AGR3")){
			desc = getAGR3();
		}else if (p.equalsIgnoreCase("AGR4")){
			desc = getAGR4();
		}else if (p.equalsIgnoreCase("AGR5")){
			desc = getAGR5();
		}else if (p.equalsIgnoreCase("AGR6")){
			desc = getAGR6();
		}else if (p.equalsIgnoreCase("AGR7")){
			desc = getAGR7();
		}else if (p.equalsIgnoreCase("AGR8")){
			desc = getAGR8();
		}else if (p.equalsIgnoreCase("AGR9")){
			desc = getAGR9();
		}else if (p.equalsIgnoreCase("AGR10")){
			desc = getAGR10();
		}else if (p.equalsIgnoreCase("CSN1")){
			desc = getCSN1();
		}else if (p.equalsIgnoreCase("CSN2")){
			desc = getCSN2();
		}else if (p.equalsIgnoreCase("CSN3")){
			desc = getCSN3();
		}else if (p.equalsIgnoreCase("CSN4")){
			desc = getCSN4();
		}else if (p.equalsIgnoreCase("CSN5")){
			desc = getCSN5();
		}else if (p.equalsIgnoreCase("CSN6")){
			desc = getCSN6();
		}else if (p.equalsIgnoreCase("CSN7")){
			desc = getCSN7();
		}else if (p.equalsIgnoreCase("CSN8")){
			desc = getCSN8();
		}else if (p.equalsIgnoreCase("CSN9")){
			desc = getCSN9();
		}else if (p.equalsIgnoreCase("CSN10")){
			desc = getCSN10();
		}else if (p.equalsIgnoreCase("OPN1")){
			desc = getOPN1();
		}else if (p.equalsIgnoreCase("OPN2")){
			desc = getOPN2();
		}else if (p.equalsIgnoreCase("OPN3")){
			desc = getOPN3();
		}else if (p.equalsIgnoreCase("OPN4")){
			desc = getOPN4();
		}else if (p.equalsIgnoreCase("OPN5")){
			desc = getOPN5();
		}else if (p.equalsIgnoreCase("OPN6")){
			desc = getOPN6();
		}else if (p.equalsIgnoreCase("OPN7")){
			desc = getOPN7();
		}else if (p.equalsIgnoreCase("OPN8")){
			desc = getOPN8();
		}else if (p.equalsIgnoreCase("OPN9")){
			desc = getOPN9();
		}else{
			desc = getOPN10();
		}
		
		return desc;
	}
                
	/* outros metodos da classe */
	
//	public  HashMap<String, String> listaPerguntas() {
//						
//		for (int i = 1; i <= 10; i++) {						
//			/* fator EXT */
//			String fatorEXT = "EXT" + i;
//			listaPerguntas.put(fatorEXT, getDescricao(fatorEXT));
//			
//			/* fator EST */
//			String fatorEST = "EST" + i;
//			listaPerguntas.put(fatorEST, getDescricao(fatorEST));
//			
//			/* fator AGR */
//			String fatorAGR = "AGR" + i;
//			listaPerguntas.put(fatorAGR, getDescricao(fatorAGR));
//			
//			/* fator CSN */
//			String fatorCSN = "CSN" + i;
//			listaPerguntas.put(fatorCSN, getDescricao(fatorCSN));
//			
//			/* fator OPN */
//			String fatorOPN = "OPN" + i;
//			listaPerguntas.put(fatorOPN, getDescricao(fatorOPN));
//		}
//		
//		return listaPerguntas;
//	}
}