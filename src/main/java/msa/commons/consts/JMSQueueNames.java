package msa.commons.consts;

public class JMSQueueNames {
    private JMSQueueNames() {}   
    /* JNDI AGENCY */
    public static final String AGENCY_MONITORING_ERROR_QUEUE = "jms/monitoringErrorQueue";
    public static final String AGENCY_USER_SERVICE_QUEUE = "jms/userServiceQueue";
    public static final String AGENCY_ORCHESTATOR_QUEUE = "jms/orchestatorQueue";
    public static final String AGENCY_TYPE_USER_SERVICE_QUEUE = "jms/typeUserServiceQueue";
    public static final String AGENCY_COUNTRY_SERVICE_QUEUE = "jms/countryQueue";
    /* JNDI HOTEL */
    public static final String AGENCY_HOTEL_BOOKING_SERVICE_QUEUE = "jms/hoteBookingServiceQueue";
    public static final String AGENCY_HOTEL_ROOM_SERVICE_QUEUE = "jms/hoteRoomServiceQueue";
    /* JNDI AIRLINE */
    public static final String AIRLINE_MONITORING_ERROR_QUEUE = "jms/monitoringErrorQueue";
    public static final String AIRLINE_AIRCRAFT_QUEUE = "jms/aircraftQueue";
    public static final String AIRLINE_FLIGHT_QUEUE = "jms/flightQueue";
    public static final String AIRLINE_AIRPORT = "jms/airportQueue";
    public static final String AIRLINE_CUSTOMER = "jms/customerQueue";
    public static final String AIRLINE_ORCHESTATOR_QUEUE = "jms/orchestatorQueue";
    public static final String AIRLINE_RESERVATION_QUEUE = "jms/reservationQueue";
}
