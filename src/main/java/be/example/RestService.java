package be.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")

public class RestService {

	@RequestMapping(value = "/getJson", method = RequestMethod.POST)

	public JsonResponse getJsonResponse(@RequestBody String input) {

		JsonResponse jsonResponse = new JsonResponse();

		Name name = new Name();
		Set<Location> locations = new HashSet<>();
		input=input+".img";
		System.out.println(input);
		String[] inputArray = input.split("\\|");
		jsonResponse.setId(inputArray[1]);

		String[] nameArray = inputArray[2].replaceAll("\\<>","<null>").replaceAll("\\<", "").replaceAll("\\>", " ")
				.split(" ");

		name.setFirst(nameArray[0]);
		name.setMiddle(nameArray[1]);
		name.setLast(nameArray[2]);
		jsonResponse.setName(name);
		if(inputArray[3].equals("")) {
			inputArray[3]="null";
		}
		jsonResponse.setDob(inputArray[3]);
		if(inputArray[5].substring(0, inputArray[5].lastIndexOf(".")).equals("")){
			jsonResponse.setImageId("null");
		}
		else {
			jsonResponse.setImageId(inputArray[5].substring(0, inputArray[5].lastIndexOf(".")));
		}
		


		String locArray[] = inputArray[4].replaceAll("\\<>", "<null>").replaceAll("\\<", "").replaceAll("\\>", " ")
				.split(",");

		for (int i = 0; i < locArray.length; i++) {
			System.out.println(locArray[i]);
			String locDetails[] = locArray[i].split(" ");
			Location location = new Location();

			Coords coords = new Coords();

			location.setName(locDetails[0]);
			coords.setLat(locDetails[1]);
			coords.setLong(locDetails[2]);

			location.setCoords(coords);

			locations.add(location);

		}
		for (Location x : locations) {
			System.out.println(x.getName());
		}
		List<Location> listLoc = locations.stream().map(t -> t).collect(Collectors.toList());
		jsonResponse.setLocations(listLoc);
		return jsonResponse;

	}

}
