/**
 * Created by marko on 27. 02. 2017.
 */

public class Location {
    private String NameOfLocation;
    private long latitude;
    private long longitude;

    public Location(String nameOfLocation, long latitude, long longitude) {
        NameOfLocation = nameOfLocation;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNameOfLocation() {
        return NameOfLocation;
    }

    public void setNameOfLocation(String nameOfLocation) {
        NameOfLocation = nameOfLocation;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "NameOfLocation='" + NameOfLocation + '\'' +
                ", Latitude='" + latitude+ '\'' +
                ", Longitude='" + longitude + '\'' +
                '}';
    }
}
