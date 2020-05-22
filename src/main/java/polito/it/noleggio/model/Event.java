package polito.it.noleggio.model;

import java.time.LocalTime;

// per implementare il comparatore
public class Event implements Comparable<Event> {
	
	// campi sempre presenti
	// tempo e il tipo di evento( sono 2)
	
	// uso la classe enum per definire una serie di costanti
	// all'interno della classe Event
	// dato che mi servono soltanto qui
	
	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}

	// DICHIARAZIONE DI COSTANTI
	public enum EventType{
		NEW_CLIENT,CAR_RETURNED
	}
	
	//CONTENUNTO, ATTRIBUTI CLASSE EVENT
	private LocalTime time;
	private EventType type;
	
	public Event(LocalTime time, EventType type) {
	
		this.time = time;
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	//per ordinare i miei eventi
	@Override 
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}
	
	
	
	

}
