public class Pasport {
private long numPassport;
private String lastName;
private String firstName;
private String midlName;
private  String dateBD;

    public Pasport(long numPassport, String lastName, String firstName, String midlName, String dateBD) {
        this.numPassport = numPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midlName = midlName;
        this.dateBD = dateBD;
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getDateBD() {
        return dateBD;
    }

    @Override
    public String toString() {
        return "Pasport:" +
                "номер паспорта-" + numPassport +"фамилия - "+ lastName + '\'' +
                 "имя - " +firstName  +
                ", отчество -  " + midlName +
                ", дата рождения -" + dateBD
                ;
    }

}
