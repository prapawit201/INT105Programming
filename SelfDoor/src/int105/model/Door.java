package int105.model;

public abstract class Door {

    private int doorId;
    private boolean status;

    public Door(int doorId) {
        this.doorId = doorId;
    }

    public int getDoorId() {
        return doorId;
    }

    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract boolean lock();

    public abstract boolean unlock(Key key);

    @Override
    public String toString() {
        return "Door{" + "doorId=" + doorId + ", status=" + status + '}';
    }

}
