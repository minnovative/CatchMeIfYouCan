package edu.calpoly.catchmeifyoucan;

import com.google.android.maps.GeoPoint;

public class CmiycJavaRes {
	
	static final int MAIN = 115;
	static final int SEEKERMAIN = 215;
	static final int SNITCHMAIN = 315;
	static final int SEEKERWAITING = 267;
	static final int SNITCHMAP = 354;
	static final int SEEKERMAP = 254;
	static final int CONFUSED = 415;
	
	static final int SETTINGS_PAGE_RESULT_CODE = 2045;
	
	static final String SEEKER_NUMBERS_KEY = "seeker numbers";
	static final String SEEKER_NAMES_KEY = "seeker names";
	static final String TIMER_INTERVAL_KEY = "interval";
	static final String ACTION = "android.provider.Telephony.SMS_RECEIVED";
	static final String STORED_PREFERENCES_KEY = "StoredPrefs";
	static final String SHARED_PREFS_DEFAULT = "nope";
	static final String USERNAME_KEY = "username";
	
	static int activityState;
	
	public static GeoPoint stringToGeoPoint(String geoString){
		String testString = geoString.replace("-", "").replace(",", "");
		int latitudeInt;
		int longitudeInt;
		String latitudeString;
		String longitudeString;
		GeoPoint geoPoint;
		if((testString.length()==14 || testString.length()==15 || testString.length()==16 || testString.length()==17)
		&& (true)){											//add logic to check for only number characters
			int commaIndex = geoString.indexOf(",");
			latitudeString = geoString.substring(0, (commaIndex));
			longitudeString = geoString.substring((commaIndex+1));
			latitudeInt = java.lang.Integer.parseInt(latitudeString);
			longitudeInt = java.lang.Integer.parseInt(longitudeString);
			geoPoint = new GeoPoint(latitudeInt, longitudeInt);
			return geoPoint;
		} else{
			return null;
		}
	}
}
