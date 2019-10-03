package Objects;

import java.io.Serializable;

public class Room implements Serializable {
	int roomId;
    int roomType;
    int roomPrice;
    String roomDescription;
    boolean bookingStatus;

    public Room(int roomId, int roomType, int roomPrice, String roomDescription, boolean bookingStatus) {
        roomId = this.roomId;
    	roomType = this.roomType;
        roomPrice = this.roomPrice;
        roomDescription = this.roomDescription;
        bookingStatus = this.bookingStatus;
    }

    public boolean getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
}
