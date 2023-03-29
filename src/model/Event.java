package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


	@Entity
	@Table(name = "events")
	@Getter
	@Setter
	@ToString
	public class Event implements Serializable{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id_event")
		private Long id;
		
		@Column(nullable = false)
		private String title;
		
		@Column(nullable = false)
		private LocalDate eventDate;
		
		@Column(nullable = false)
		private String description;
		
		@Column(nullable = false)
		@Enumerated(EnumType.STRING)
		private EventType eventType;
		
		@Column(nullable = false)
		private int maxPartecipants;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public LocalDate getEventDate() {
			return eventDate;
		}

		public void setEventDate(LocalDate eventDate) {
			this.eventDate = eventDate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public EventType getEventType() {
			return eventType;
		}

		public void setEventType(EventType eventType) {
			this.eventType = eventType;
		}

		public int getMaxPartecipants() {
			return maxPartecipants;
		}

		public void setMaxPartecipants(int maxPartecipants) {
			this.maxPartecipants = maxPartecipants;
		}

}
