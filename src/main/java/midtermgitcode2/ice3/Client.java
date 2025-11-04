package midtermgitcode2.ice3;

class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void breadReady() {
        System.out.println(name + " received bread");
    }
}
