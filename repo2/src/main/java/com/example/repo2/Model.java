package com.example.repo2;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Objects;

import javax.persistence.Entity;

public class Model {

	@Entity
	class SpeedResult {
		private Long id;
		private String subjectName;
		private Speed speed;
		private Timestamp experimentTime;
		
		public SpeedResult() {
			super();
			// TODO Auto-generated constructor stub
		}

		public SpeedResult(Long id, String subjectName, Speed speed, Timestamp experimentTime) {
			super();
			this.id = id;
			this.subjectName = subjectName;
			this.speed = speed;
			this.experimentTime = experimentTime;
		}

		public SpeedResult(String subjectName, Speed speed, Timestamp experimentTime) {
			super();
			this.subjectName = subjectName;
			this.speed = speed;
			this.experimentTime = experimentTime;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSubjectName() {
			return subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}

		public Speed getSpeed() {
			return speed;
		}

		public void setSpeed(Speed speed) {
			this.speed = speed;
		}

		public Timestamp getExperimentTime() {
			return experimentTime;
		}

		public void setExperimentTime(Timestamp experimentTime) {
			this.experimentTime = experimentTime;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(experimentTime, id, speed, subjectName);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof SpeedResult)) {
				return false;
			}
			SpeedResult other = (SpeedResult) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			return Objects.equals(experimentTime, other.experimentTime) && Objects.equals(id, other.id)
					&& Objects.equals(speed, other.speed) && Objects.equals(subjectName, other.subjectName);
		}

		private Model getEnclosingInstance() {
			return Model.this;
		}

		@Override
		public String toString() {
			return "SpeedResult [id=" + id + ", subjectName=" + subjectName + ", speed=" + speed + ", experimentTime="
					+ experimentTime + "]";
		}
		
		
	}
	
	class Speed {
		private Duration duration;
		private Distance distance;
		
		public Speed() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Speed(Duration duration, Distance distance) {
			super();
			this.duration = duration;
			this.distance = distance;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public Distance getDistance() {
			return distance;
		}

		public void setDistance(Distance distance) {
			this.distance = distance;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(distance, duration);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Speed)) {
				return false;
			}
			Speed other = (Speed) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			return Objects.equals(distance, other.distance) && Objects.equals(duration, other.duration);
		}

		private Model getEnclosingInstance() {
			return Model.this;
		}

		@Override
		public String toString() {
			return "Speed [duration=" + duration + ", distance=" + distance + "]";
		}
		
		
	}
	
	class Distance {
		private DistanceUnit distanceUnit;
		private Double unit;
		
		public Distance() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Distance(DistanceUnit distanceUnit, Double unit) {
			super();
			this.distanceUnit = distanceUnit;
			this.unit = unit;
		}

		public DistanceUnit getDistanceUnit() {
			return distanceUnit;
		}

		public void setDistanceUnit(DistanceUnit distanceUnit) {
			this.distanceUnit = distanceUnit;
		}

		public Double getUnit() {
			return unit;
		}

		public void setUnit(Double unit) {
			this.unit = unit;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(distanceUnit, unit);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Distance)) {
				return false;
			}
			Distance other = (Distance) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			return distanceUnit == other.distanceUnit && Objects.equals(unit, other.unit);
		}

		private Model getEnclosingInstance() {
			return Model.this;
		}

		@Override
		public String toString() {
			return "Distance [distanceUnit=" + distanceUnit + ", unit=" + unit + "]";
		}
		
		
	}
	
	enum DistanceUnit {
		Millimeters("millimeters"),
		Centimeters("centimeters"),
		Meters("meters"),
		Kilometers("kilometers"),
		Inches("inches"),
		Feet("feet"),
		Yards("yards"),
		Miles("miles");
		
		private final String name;       

	    private DistanceUnit(String s) {
	        name = s;
	    }

	    public boolean equalsName(String otherName) {
	        return name.equals(otherName);
	    }

	    public String toString() {
	       return this.name;
	    }
	    
	}
	
}
