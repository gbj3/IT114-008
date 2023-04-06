package Project.common;
import java.io.Serializable;

public class Payload implements Serializable {
    // read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 1L;// change this if the class changes

    /**
     * Determines how to process the data on the receiver's side
     */
    private PayloadType payloadType;

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * Who the payload is from
     */
    private String clientName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Generic text based message
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String sender; //sender constructor
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() { //gbj3 IT114-008 4/5
        return sender; // gets the sender
    }

    public Payload(String message, String sender) { //constructor
        this.message = message;
        this.sender = sender;
    }

    public Payload() {
        this.payloadType = null; // default constructor
        this.clientName = null;
        this.clientId = 0;
        this.message = null;
        this.sender = null;
    }

    @Override
    public String toString() { //get sender added to toString
        return String.format("Type[%s],ClientId[%s,] ClientName[%s], Sender[%S], Message[%s]", getPayloadType().toString(),
                getClientId(), getClientName(), getSender(), 
                getMessage());
    }
}