package system.model;

public class Phone {
    public final Long id;
    private String numberOfPhone;

    public Phone(Long id, String numberOfPhone) {
        this.id = id;
        this.numberOfPhone = numberOfPhone;
    }

    public Phone(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }
}
