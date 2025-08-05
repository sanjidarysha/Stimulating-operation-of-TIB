package modulepkg.tib.m1_sanjida_2312257;

public class ManagewitnessModel {private String id,name;
    int age;
    String contactinfo,note;

    public ManagewitnessModel(String id, String name, int age, String contactinfo, String note) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactinfo = contactinfo;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ManagewitnessModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactinfo='" + contactinfo + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
