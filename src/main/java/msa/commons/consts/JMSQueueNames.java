package msa.commons.consts;

public class JMSQueueNames {
    private JMSQueueNames() {}   
    /* JNDI ConnectionFactory */
    public static final String CONNECTION_FACTORY_LOCAL = "jms/connectionFactory";
    public static final String CONNECTION_FACTORY_AGENCY = "jmsremote/connectionFactoryAgency";
    public static final String CONNECTION_FACTORY_AIRLINE = "jmsremote/connectionFactoryAirline";
    /* JNDI AGENCY */
    public static final String AGENCY_MONITORING_ERROR_QUEUE = "jms/agencyMonitoringErrorQueue";
    public static final String AGENCY_USER_SERVICE_QUEUE = "jms/userServiceQueue";
    public static final String AGENCY_ORCHESTATOR_QUEUE = "jms/agencyOrchestatorQueue";
    public static final String AGENCY_TYPE_USER_SERVICE_QUEUE = "jms/typeUserServiceQueue";
    public static final String AGENCY_COUNTRY_SERVICE_QUEUE = "jms/countryQueue";
    public static final String AGENCY_TRAVEL_SERVICE_QUEUE = "jms/travelQueue";
    public static final String ORCHESTRATOR_AIRLINE_QUEUE = "jmsremote/orchestratorAirline";
    
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
    public static final String REMOTE_ORCHESTRATOR_AGENCY_QUEUE = "jmsremote/orchestratorAgency";
}
