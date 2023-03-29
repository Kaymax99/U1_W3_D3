package eventHandle;

import java.time.LocalDate;

import model.Event;
import model.EventDAO;
import model.EventType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event e = new Event();
		e.setTitle("Doge Union");
		e.setDescription("A doge meeting");
		e.setEventType(EventType.PRIVATE);
		e.setMaxPartecipants(20);
		e.setEventDate(LocalDate.of(2023, 03, 30));
		
		EventDAO eDAO = new EventDAO();
		eDAO.save(e);
	}

}
