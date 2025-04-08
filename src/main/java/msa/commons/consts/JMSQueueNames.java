package msa.commons.consts;

public class JMSQueueNames {
    private JMSQueueNames() {}   
    public static final String AGENCY_MONITORING_ERROR_QUEUE = "jms/monitoringErrorQueue";
    public static final String AGENCY_USER_SERVICE_QUEUE = "jms/userServiceQueue";
    public static final String AGENCY_ORCHESTATOR_QUEUE = "jms/orchestatorQueue";
    public static final String AGENCY_TYPE_USER_SERVICE_QUEUE = "jms/typeUserServiceQueue";
    public static final String AGENCY_COUNTRY_SERVICE_QUEUE = "jms/countryQueue";
    public static final String AGENCY_HOTEL_BOOKING_SERVICE_QUEUE = "jms/hoteBookingServiceQueue";
    public static final String AGENCY_HOTEL_ROOM_SERVICE_QUEUE = "jms/hoteRoomServiceQueue";
    public static final String HOTEL_ORCHESTRATOR_QUEUE = "jms/orchestatorQueue";
}
