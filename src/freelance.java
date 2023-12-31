public class freelance extends clientType {
    private String name;
    private String surname;
    private String id;

    public freelance(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getFull() {
        return this.name + " " + this.surname + " " + this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}