package com.example;

/**
 * Created by marko on 27. 02. 2017.
 */

public class Model {
    private String IDModel;
    private String NameModel;
    private Brand ModelBrand;

    public Model(Brand modelBrand, String idModel, String nameModel) {
        this.ModelBrand = modelBrand;
        this.IDModel = idModel;
        this.NameModel = nameModel;
    }

    public String getIDModel() {
        return IDModel;
    }

    public void setIDModel(String IDModel) {
        this.IDModel = IDModel;
    }

    public String getNameModel() {
        return NameModel;
    }

    public void setNameModel(String nameModel) {
        NameModel = nameModel;
    }

    public Brand getModelBrand() {
        return ModelBrand;
    }

    public void setModelBrand(Brand modelBrand) {
        ModelBrand = modelBrand;
    }

    @Override
    public String toString() {
        return "ModelOfCar{" +
                "CarBrand'" + ModelBrand.getNameBrand() + '\'' +
                ", IDModel='" + IDModel+ '\'' +
                ", NameModel='" + NameModel + '\'' +
                '}';
    }
}
