public class House {
    private String address;
    private boolean isDecorated;
    private int treatsPerTreater;

    public House(String address, boolean isDecorated, int treatsPerTreater) {
        this.address = address;
        this.isDecorated = isDecorated;
        this.treatsPerTreater = treatsPerTreater;
    }

    public boolean isDecorated() {
        return isDecorated;
    }

    public int getTreatsPerTreater() {
        return treatsPerTreater;
    }
}
