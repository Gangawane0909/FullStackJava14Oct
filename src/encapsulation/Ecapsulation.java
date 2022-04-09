package encapsulation;

public class Ecapsulation {

    //instance variable/global variable
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
    class Sample {
    public static void main(String[] args) {
        Ecapsulation obj = new Ecapsulation();
        obj.setId(0);
        obj.setName("Shradha");
        obj.setAddress("Mirajagon");


        System.out.println("Id=>" +obj.getId() + "name=>" +obj.getName() + "address=>" +obj.getAddress());

    }

}

/**
 *
 */

