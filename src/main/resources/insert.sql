  INSERT INTO AIRPORT
(AIRPORT_ID, AIRPORTNAME)
VALUES
(1, 'BORISPOL');
INSERT INTO FLIGHT
(FLIGHT_ID, AIRPORT_ID, FLIGHTTITLE, DEPARTURE, DESTINATION, FLIGHTTYPE, CLASSNUMBER, SEATNUMBER)
VALUES
(1, 1, 'KIEV-HURGADA', 'KIEV', 'HURGADA', 'LUX', 1, 12),
(2, 1, 'KIEV-KHARKOV', 'KIEV', 'KHARKOV', 'SEMILUX', 2, 30),
(3, 1, 'KIEV-SIMFEROPOL', 'KIEV', 'SIMFEROPOL', 'BUDGET', 3, 52);
INSERT INTO PASSENGER
(PASS_ID, NAME, SURNAME, PATRONYMIC, PHONE)
VALUES
(1, 'A', 'B', 'V', '52'),
(2, 'J', 'L', 'K', '63'),
(3, 'V', 'N', 'M', '14');
INSERT INTO TICKET
(ID, PASS_ID, FLIGHT_ID, TICKET_PRICE)
VALUES
(1, 1, 1, 1400),
(2, 2, 2, 700),
(3, 3, 3, 900);