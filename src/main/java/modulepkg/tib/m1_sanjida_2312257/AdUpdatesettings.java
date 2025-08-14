package modulepkg.tib.m1_sanjida_2312257;

public class AdUpdatesettings {private String currentp,newp,confirmp;

    public AdUpdatesettings(String currentp, String newp, String confirmp) {
        this.currentp = currentp;
        this.newp = newp;
        this.confirmp = confirmp;
    }

    public String getCurrentp() {
        return currentp;
    }

    public void setCurrentp(String currentp) {
        this.currentp = currentp;
    }

    public String getNewp() {
        return newp;
    }

    public void setNewp(String newp) {
        this.newp = newp;
    }

    public String getConfirmp() {
        return confirmp;
    }

    public void setConfirmp(String confirmp) {
        this.confirmp = confirmp;
    }

    @Override
    public String toString() {
        return "AdUpdatesettings{" +
                "currentp='" + currentp + '\'' +
                ", newp='" + newp + '\'' +
                ", confirmp='" + confirmp + '\'' +
                '}';
    }
}
