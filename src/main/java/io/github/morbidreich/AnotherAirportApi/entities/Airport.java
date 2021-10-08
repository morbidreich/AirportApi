package io.github.morbidreich.AnotherAirportApi.entities;

public class Airport {

    private String icaoCode;
    private String iataCode;
    private String fullName;

    public Airport() {
    }

    public Airport(String icaoCode, String iataCode, String fullName) {
        super();
        this.icaoCode = icaoCode;
        this.iataCode = iataCode;
        this.fullName = fullName;
    }



    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Airport{" +
                ", icaoCode='" + icaoCode + '\'' +
                ", iataCode='" + iataCode + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
