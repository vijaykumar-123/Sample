
package aggeregation;
import java.util.HashMap;
import java.util.Map;

public enum CountryEnumMapping 
	
	
	UNITED_STATES("us","usa","united states"),
	MEXICO("mx","mex","MEXICO"),
	BAHAMAS("bs","bhs","bahamas"),
	CAYMAN_ISLANDS("ky","cym","cayman islands"),
	CANADA("ca","can","canada"),
	ARGENTINA("ag","arg","argentina"),
	CHILE("cl","chl","chile"),
	URUGUAY("uy","ury","uruguay"),
	UNITED_KINGDOM("gb","gbr","united kingdom"),
	SHQIPERIA("al","alb","shqiperia"),
	BOSNA_I_HERCEGOVINA("ba","bih","bosna i hercegovina"),
	Belarus("by","blr","belarus"),
	EESTI("ee","est","eesti"),
	BELGIE("be","bel","belgie"),
	IRELAND("IE","IRL","ireland"),
	UNITEDARAB_EMIRATES("AE","ARE","United Arab Emirates"),
	FRANCE("FR","FRA","FRANCE"),
	NEDERLAND("NL","NLD","NEDERLAND"),
	POLSKA("PL","POL","Polska"),
	SCHWEIZ("CH","CHE","SCHWEIZ"),
	ROMANIA("RO","ROU","Romania"),
	EGYPT("EG","EGY","Egypt"),
	ESPANA("ES","ESP","Espana"),
	PORTUGAL("PT","PRT","PORTUGAL"),
	BAHRAIN("BHR","BH","Bahrain"),
	QATAR("QA","QAT","Qatar"),
	LESOTHO("LS","LSO","Lesotho"),
	OMAN("OM","OMN","Oman"),
	SWAZILAND("SW","SWZ","Swaziland"),
	MALTA("MT","MLT","Malta"),
	CESKA_REPUBLIKA("CZ","CZE","Ceska republika"),
	MAGYARORSZAG("HU","HUN","Magyarorszag"),
	SLOVENSKA_REPUBLIKASLOVENSKA_REPUBLIKA("SV","SVK","Slovenska republika"),
	ROYAUME_DU_MAROC("MA","MAR","Royaume du Maroc"),
	BULGARIA("BG","BGR","Bulgaria"),
	HRVATSKA("HR","HRV","Hrvatska"),
	DANMARK("DK","DNK","Danmark"),
	SUOMI("FI","FIN","Suomi"),
	HELLAS("GR","GRC","Hellas"),
	NORGE("NO","NOR","Norge"),
	SRBIJA("SR","SRB","Srbija"),
	DEUTSCHLAND("DE","DEU","Deutschland"),
	SLOVENIJA("SI","SVN","Slovenija"),
	SVERIGE("SE","SWE","Sverige"),
	UKRAINA("UA","UKR","Ukraina"),
	LIETUVA("LT","LTU","Lietuva"),
	ITALIA("IT","ITA","ITALIA"),
	NIGERIA("NG","NGA","NIGERIA"),
	AUSTRALIA("AU","AUS","Australia"),
	HONG_KONG("HK","HKG","HONG KONG"),
	INDONESIA("ID","IDN","INDONESIA"),
	MALAYSIA("MY","MYS","MALAYSIA"),
	NEW_ZEALAND("NZ","NZL","New Zealand"),
	REPUBLIC_OF_THE_PHILIPPINES("PH","PHL","REPUBLIC OF THE PHILIPPINES"),
	SINGAPORE("SG","SGP","Singapore"),
	TURKIYE("TR","TUR","Turkiye"),
	THAILAND("TH","THA","Thailand"),
	VIET_NAM("VN","VNM","Viet Nam"),
	OSTERREICH("AT","AUT","Osterreich"),
	KINGDOM_OF_SAUDI_ARABIA("SA","SAU","Kingdom of Saudi Arabia"),
	BRASIL("BR","BRA","BRASIL"),
	VENEZUELA("VE","VEN","Venezuela"),
	LUXEMBOURG("LU","LUX","Luxembourg"),
	PERU("PE","PER","Peru"),
	COLOMBIA("CO","COL","Colombia"),
	Dominican_Republic("DO","DOM","Dominican Republic"),
	MOLDOVA("MD","MDA","Moldova"),
	LIECHTENSTEIN("LI","LIE","Liechtenstein"),
	GIBRALTAR("GI","GIB","Gibraltar"),
	MONACO("MC","MCO","Monaco"),
	CITTA_DEL_VATICANO("VA","VAT","Citta del Vaticano"),
	SOUTH_AFRICA("ZA","ZAF","South Africa"),
	ANDORRA("AN","AND","Andorra"),
	SAN_MARINO("SM","SMR","San Marino"),
	ROSSIYA("RU","RUS","Rossiya"),
	INTERNATIONAL_WATERS("BE","OBE","International Waters"),
	CRNA_GORA("ME","MNE","Crna Gora"),
	LATVIJA("LV","LVA","Latvija"),
	NEGARA_BRUNEI_DARUSSALAM("BN","BRN","Negara Brunei Darussalam"),
	MACAU("MO","MAC","Macau"),
	GUADELOUPE("GP","GLP","Guadeloupe"),
	MARTINIQUE("MQ","MTQ","Martinique"),
	SAINT_MARTIN("MF","MAF","Saint-Martin"),
	SAINT_BARTHELEMY("BL","BLM","Saint-Barthelemy"),
	SINT_MAARTEN("SX","SXM","Sint Maarten"),
	INDIA("IN","IND","India"),
	MAKEDONIJA("MK","MKD","Makedonija"),
	YISRAEL("IL","ISR","Yisrael");

private static long startTime = System.currentTimeMillis();
private final String ABBR_1;
private final String ABBR_2;
private final String FULL_FORM;
private static final Map<String, String> mMap = new HashMap<String, String>();

static {
    for (CountryEnumMapping cem : CountryEnumMapping.values()) {
    	
    	if(cem.ABBR_2 != null && !cem.ABBR_2.isEmpty())
    	{
    		mMap.put(cem.FULL_FORM.toLowerCase(), cem.ABBR_2);
    	}
    	else
    	{
    		mMap.put(cem.FULL_FORM.toLowerCase(), cem.ABBR_1);
    	}
    }
}

CountryEnumMapping(String abbr1,String abbr2,String fullform){
	
	this.ABBR_1 = abbr1;
	this.ABBR_2 = abbr2;
	this.FULL_FORM = fullform;
}

public String getAbbr_1() {
	return this.ABBR_1;
}

public String getAbbr_2() {
	return this.ABBR_2;
}

public String getFullForm() {
	return this.FULL_FORM;
}
public static String findCountry(String input) 
{
	
	String output= mMap.get(input.toLowerCase());
	return output;
	
}

public static void main(String args[])
{
	String in = "India";
	String value = CountryEnumMapping.findCountry(in);
    System.out.print(value);
	long endTime = System.currentTimeMillis();
    System.out.println("\n"+"It took " + (endTime - startTime) + " milliseconds");
	
}

}
