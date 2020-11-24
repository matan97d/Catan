public class Tile {
    Resource resource;
    Number number;
    Boolean active;

    public Tile(Resource resource, Number number, Boolean active) {
        this.resource = resource;
        this.number = number;
        this.active = active;
    }

    public Boolean IsActive() {
        return active;
    }
}
