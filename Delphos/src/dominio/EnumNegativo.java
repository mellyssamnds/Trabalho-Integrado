/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package dominio;

public enum EnumNegativo {
	VERYINACCURATE(5),
	MODERATELYINACCURATE(4),
	NEUTRAL(3),
	MODERATELYACCURATE(2),
	VERYACCURATE(1);
	
	private int resp;
	
	EnumNegativo(int resp){
		this.resp = resp;
	}
	
	public int getResult(){
		return this.resp;
	}
}
