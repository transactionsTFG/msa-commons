package msa.commons.consts;

public class JMSQueueNames {
    private JMSQueueNames() {}   
    /* JNDI AGENCY */
    public static final String AGENCY_MONITORING_ERROR_QUEUE = "jms/agencyMonitoringErrorQueue";
    public static final String AGENCY_USER_SERVICE_QUEUE = "jms/userServiceQueue";
    public static final String AGENCY_ORCHESTATOR_QUEUE = "jms/agencyOrchestatorQueue";
    public static final String AGENCY_TYPE_USER_SERVICE_QUEUE = "jms/typeUserServiceQueue";
    public static final String AGENCY_COUNTRY_SERVICE_QUEUE = "jms/countryQueue";
    /* JNDI HOTEL */
    public static final String AGENCY_HOTEL_BOOKING_SERVICE_QUEUE = "jms/hotelBookingServiceQueue";
    public static final String AGENCY_HOTEL_ROOM_SERVICE_QUEUE = "jms/hotelRoomServiceQueue";
    public static final String HOTEL_ORCHESTRATOR_QUEUE = "jms/hotelOrchestatorQueue";
    public static final String HOTEL_BOOKING_QUEUE = "jms/hotelBookingQueue";
    public static final String HOTEL_CUSTOMER_QUEUE = "jms/hotelCustomerQueue";
    public static final String HOTEL_ROOM_QUEUE = "jms/hotelRoomQueue";
    /* JNDI AIRLINE */
    public static final String AIRLINE_MONITORING_ERROR_QUEUE = "jms/airlineMonitoringErrorQueue";
    public static final String AIRLINE_AIRCRAFT_QUEUE = "jms/aircraftQueue";
    public static final String AIRLINE_FLIGHT_QUEUE = "jms/flightQueue";
    public static final String AIRLINE_AIRPORT = "jms/airportQueue";
    public static final String AIRLINE_CUSTOMER = "jms/customerQueue";
    public static final String AIRLINE_ORCHESTATOR_QUEUE = "jms/airlineOrchestatorQueue";
    public static final String AIRLINE_RESERVATION_QUEUE = "jms/reservationQueue";
}
