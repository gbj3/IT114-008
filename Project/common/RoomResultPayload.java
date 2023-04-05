package Project.common;

public class RoomResultPayload extends Payload {
    private String[] rooms;

    public RoomResultPayload() {
        super();
        setPayloadType(PayloadType.GET_ROOMS);
    }

    /**
     * @return the rooms
     */
    public String[] getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }
}
