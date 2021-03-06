package br.com.etyllica.i18n;

/**
 * 
 * @author yuripourre
 * @license LGPLv3
 *
 */

public enum Language {
	
	PORTUGUESE_BRAZIL("pt_BR","UTF-8"),
	ENGLISH_USA("en_US","UTF-8"),
	JAPANESE("ja_JP","UTF-8"),
	UNKNOWN("unknown","UTF-8");
	
	private final String charsetName;
	private final String charsetEncode;
	
	Language(String charsetName, String charsetEncode) {
		this.charsetName = charsetName;
		this.charsetEncode = charsetEncode;
	}
	
	public final String getCharsetName() {
		return charsetName;
	}
	
	public final String getCharsetEncode() { 
		return charsetEncode;
	}
	
}
