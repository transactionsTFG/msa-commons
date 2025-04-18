package msa.commons.event;

/* ENTIDAD_ACCION_EVENTOINICIAL_COMMIT/ROLLBACK */
public enum EventId {
    /* MICROSERVICIO DE TIPO USUARIO */
    VALIDATE_TYPE_USER,
    /* MICROSERVICIO DE USUARIO */
    CREATE_USER,
    FAILED_USER,
    /* MICROSERVICIO DE COUNTRY */
    GET_COUNTRY_BY_ID,
    GET_COUNTRY_BY_NAME,
    /* MICROSERVICIO DE RESERVA DE HOTEL */
    CREATE_BOOKING,
    FAILED_BOOKING,
    VALIDATE_CUSTOMER_AND_ROOMS,
    /* MICROSERVICIO DE HABITACIONES DE HOTEL */
    GET_ROOM,
    /* MICROSERVICIO DE Aeronave */
    AIRCRAFT_VALIDATE_CAPACITY_RESERVATION_AIRLINE_CREATE_RESERVATION,
    AIRCRAFT_PROPAGATION_SAVE_RESERVATION_AIRLINE_CREATE_RESERVATION_COMMIT_SAGA,
    AIRCRAFT_VALIDATE_CAPACITY_RESERVATION_AIRLINE_MODIFY_RESERVATION,
    /* MICROSERVICIO DE Aeropuerto */
    GET_AIRPORT_BY_ID,
    /* MICROSERVICIO DE Vuelo */
    FLIGHT_VALIDATE_FLIGHT_RESERVATION_AIRLINE_CREATE_RESERVATION,
    FLIGHT_VALIDATE_FLIGHT_RESERVATION_AIRLINE_MODIFY_RESERVATION,
    FLIGHT_VALIDATE_FLIGHT_RESERVATION_AIRLINE_REMOVE_RESERVATION,
    FLIGHT_UPDATE_FLIGHT_AIRLINE_CREATE_RESERVATION_COMMIT_SAGA,
    FLIGHT_UPDATE_FLIGHT_AIRLINE_CREATE_RESERVATION_ROLLBACK_SAGA,
    FLIGHT_UPDATE_FLIGHT_BY_AIRLINE_MODIFY_RESERVATION_COMMIT_SAGA,
    FLIGHT_UPDATE_FLIGHT_BY_AIRLINE_MODIFY_RESERVATION_ROLLBACK_SAGA,
    FLIGHT_UPDATE_FLIGHT_BY_AIRLINE_REMOVE_RESERVATION_COMMIT_SAGA,
    FLIGHT_UPDATE_FLIGHT_BY_AIRLINE_REMOVE_RESERVATION_ROLLBACK_SAGA,
    /* MICROSERVICIO DE Cliente Aerolinea */
    CUSTOMER_AIRLINE_GET_CUSTOMER_RESERVATION_AIRLINE_CREATE_RESERVATION,
    CUSTOMER_AIRLINE_CREATE_CUSTOMER_RESERVATION_AIRLINE_CREATE_RESERVATION_COMMIT_SAGA,
    CUSTOMER_AIRLINE_CREATE_CUSTOMER_RESERVATION_AIRLINE_CREATE_RESERVATION_ROLLBACK_SAGA,
    /* MICROSERVICIO DE Reserva Aerolinea */
    RESERVATION_AIRLINE_CREATE_RESERVATION_BEGIN_SAGA,
    RESERVATION_AIRLINE_CREATE_RESERVATION_COMMIT_SAGA,
    RESERVATION_AIRLINE_CREATE_RESERVATION_ROLLBACK_SAGA,
    RESERVATION_AIRLINE_MODIFY_RESERVATION_BEGIN_SAGA,
    RESERVATION_AIRLINE_MODIFY_RESERVATION_COMMIT_SAGA,
    RESERVATION_AIRLINE_MODIFY_RESERVATION_ROLLBACK_SAGA,
    RESERVATION_AIRLINE_REMOVE_RESERVATION_BEGIN_SAGA,
    RESERVATION_AIRLINE_REMOVE_RESERVATION_COMMIT_SAGA,
    RESERVATION_AIRLINE_REMOVE_RESERVATION_ROLLBACK_SAGA,
}

