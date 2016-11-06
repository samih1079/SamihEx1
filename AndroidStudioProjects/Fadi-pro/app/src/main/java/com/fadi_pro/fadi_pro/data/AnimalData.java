package com.fadi_pro.fadi_pro.data;

/**
 * Created by משתמש on 12/06/2015.
 */
import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("AnimalData")
public class AnimalData extends ParseObject
{
    private String Animalname;
    private String owener;
    private String AnimalType;
    private String age;
    private String takenVaccination;
    private String phone;
    private String identityCard;
    private String adress;
    private String ZIPcode;
    private int id;


    public AnimalData(String name, String age, String takenVaccination, String phone, String identityCard, String adress, String ZIPcode, int id) {
        this.Animalname = name;
        this.age = age;
        this.takenVaccination = takenVaccination;
        this.phone = phone;
        this.identityCard = identityCard;
        this.adress = adress;
        this.ZIPcode = ZIPcode;
        this.id = id;
    }

    public String getOwener() {
        owener=getString("owener");
        return owener;
    }

    public void setOwener(String owener) {
        put("owener",owener);
        this.owener = owener;
    }

    public AnimalData()
    {
        super();
    }

    public String getName() {
        Animalname=getString("Animalname");
        return Animalname;
    }

    public void setName(String name) {
        put("Animalname",Animalname);
        this.Animalname = name;
    }
    public void setAnimalType(String AnimalType) {
        put("AnimalType", AnimalType);
        this.Animalname = AnimalType;
    }

    public String getAge() {
        age=getString("age");
        return age;
    }
    public String getAnimalType() {
        AnimalType=getString("AnimalType");
        return AnimalType;}

    public void setAge(String age) {
        put("age",age);
        this.age = age;
    }

    public String getTakenVaccination() {
        takenVaccination=getString("takenVaccination");
        return takenVaccination;
    }

    public void setTakenVaccination(String takenVaccination) {
        put("takenVaccination",takenVaccination);
        this.takenVaccination = takenVaccination;
    }

    public String getPhone() {
        phone=getString("phone");
        return phone;
    }

    public void setPhone(String phone) {
        put("phone",phone);
        this.phone = phone;
    }

    public String getIdentityCard() {
        identityCard=getString("identityCard");
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        put("identityCard",identityCard);
        this.identityCard = identityCard;
    }

    public String getAdress() {
        adress=getString("adress");
        return adress;
    }

    public void setAdress(String adress) {
        put("adress",adress);
        adress = adress;
    }

    public String getZIPcode() {
        ZIPcode=getString("ZIPcode");
        return ZIPcode;
    }

    public void setZIPcode(String ZIPcode) {
        put("ZIPcode",ZIPcode);
        this.ZIPcode = ZIPcode;
    }

    public int getId() {
        id=getInt("id");
        return id;
    }

    public void setId(int id) {
        put("id",id);
        this.id = id;
    }
}
