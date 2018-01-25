package phpTravelers;

/**
 * Created by aleksandra on 1/25/18.
 */
public enum PropertyTypes {

    Apartment(5,"Apartment"),
    Hotel(6,"Hotel"),
    GuestHouse(7,"Guest House"),
    Motel(8,"Motel"),
    Residence(9,"Residence"),
    Resort(10,"Resort"),
    TimeShare(11,"Time Share"),
    ExtendedStay(12,"Extended Stay"),
    Villa(13,"Villa");

    int index;
    String name;

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    PropertyTypes(int index, String name) {
        this.index = index;
        this.name = name;
    }


    }
