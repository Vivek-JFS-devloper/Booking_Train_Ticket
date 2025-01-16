package in.ramesh.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ramesh.request.Passenger;
import in.ramesh.response.Ticket;

@RestController
public class IRCTCRestController {
	Map<Integer, Ticket> tickets = new HashMap<>();
	
	//Generate Ticket and response to Ticket Number
	@PostMapping(
			value = "/ticket",
			consumes = {"application/xml","application/json"},
			produces = {"application/xml","application/json"}
		)
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		 
		int ticketId = (int) (Math.random()*1000000000);
		Ticket t = new Ticket();
		t.setTickedId(ticketId);
		t.setFname(passenger.getFname());
		t.setSname(passenger.getSname());
		t.setPrice(passenger.getPrice());
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTrainName(passenger.getTrainName());
		t.setTrainNumber(passenger.getTrainNumber());
		t.setStatus("Conform Ticket");
		
		System.out.println(t.getTrainName());
		 
		tickets.put(ticketId, t);
		return new ResponseEntity<>(t,HttpStatus.CREATED);
	}
	
	
	//get ticketId and check our Response
	@GetMapping(
				value = "/ticket/{ticketId}",
				produces = {"application/xml","application/json"}
			)
	public ResponseEntity<Ticket> getTicekId(@PathVariable Integer ticketId){
		 
		if(tickets.containsKey(ticketId)) {
			return new ResponseEntity<>(tickets.get(ticketId),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<Ticket>(HttpStatus.BAD_REQUEST);
	}
}
