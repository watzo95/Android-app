/**
 * Created by marko on 27. 02. 2017.
 */

public class Brand {
    private String IDBrand;
    private String NameBrand;

    public Brand(String idBrand, String nameBrand) {
        this.IDBrand = idBrand;
        this.NameBrand = nameBrand;
    }

    public String getIDBrand() {
        return IDBrand;
    }

    public String getNameBrand() {
        return NameBrand;
    }

    public void setIDBrand(String IDBrand) {
        this.IDBrand = IDBrand;
    }

    public void setNameBrand(String nameBrand) {
        NameBrand = nameBrand;
    }

    @Override
    public String toString() {
        return "BrandOfCar{" +
                "IDBrand='" + IDBrand + '\'' +
                ", NameBrand='" + NameBrand + '\'' +
                '}';
    }
}
