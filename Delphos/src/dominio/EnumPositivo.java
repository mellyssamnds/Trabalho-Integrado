/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package dominio;

public enum EnumPositivo {
	VERYINACCURATE(1),
	MODERATELYINACCURATE(2),
	NEUTRAL(3),
	MODERATELYACCURATE(4),
	VERYACCURATE(5);
	
	private int resp;
	
	EnumPositivo(int resp){
		this.resp = resp;
	}
	
	public int getResult(){
		return this.resp;
	}
}
