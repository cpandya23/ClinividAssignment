package be.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import be.example.Coords;
import be.example.JsonResponse;
import be.example.Location;
import be.example.Name;

@RestController
@RequestMapping("rest")

public class RestService {

	@RequestMapping(value="/getJson",method=RequestMethod.POST)
	
	public JsonResponse getJsonResponse(@RequestBody String input){
		
		JsonResponse jsonResponse= new JsonResponse();

		Name name= new Name();
		List<Location> locations = new ArrayList<>();
		Location location= new Location();
		Coords coords= new Coords();
		String[] inputArray= input.split("\\|");
		jsonResponse.setId(inputArray[1]);
		
		String[] nameArray =inputArray[2].replaceAll("\\<", "").replaceAll("\\>", " ").split(" ");
		name.setFirst(nameArray[0]);
		name.setMiddle(nameArray[1]);
		name.setLast(nameArray[2]);
		jsonResponse.setName(name);
		jsonResponse.setDob(inputArray[3].replaceAll("\\<", "").replaceAll("\\>", ""));
		jsonResponse.setImageId(inputArray[5]);
		
		String locArray[] =inputArray[4].replaceAll("\\<", "").replaceAll("\\>", " ").split(",");
		for(String x:locArray) {
			String locDetails[]=x.split(" ");
			location.setName(locDetails[0]);
			coords.setLat(Double.parseDouble(locDetails[1]));
			coords.setLong(Double.parseDouble(locDetails[2]));
			location.setCoords(coords);
			locations.add(location);
		}
		jsonResponse.setLocations(locations);
		return jsonResponse;
			
	}
	
}

