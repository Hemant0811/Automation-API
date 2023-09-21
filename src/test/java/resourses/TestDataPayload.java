package resourses;

import java.util.ArrayList;

import com.github.javafaker.Faker;

import requestPOJO.LocationChildData;
import requestPOJO.RequestPageData;

public class TestDataPayload {
	
	RequestPageData r = new RequestPageData();
	LocationChildData l = new LocationChildData();
	Faker f = new Faker();
	
	public RequestPageData dataPayload(String name, String phonenumber,String address) {
		
		l.setLat(-38.383494);
		l.setLng(33.427362);
		r.setLocation(l);
		r.setAccuracy(50);
		r.setName(name);
		r.setPhone_number(phonenumber);
		r.setAddress(address);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("shoepark");
		list.add("shop");
		r.setTypes(list);
		r.setWebsite("http://google.com");
		r.setLanguage("Hindi");
		return r;
	}
	

}
