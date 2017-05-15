package com.example;

/**
 * Created by marko on 27. 02. 2017.
 */

public class Product {
    private Model ModelName;
    private String NameOfProduct;
    private Integer PriceOfProduct;
    private String OptionalText;
    private long DateOfPost;
    private Location ProductLocation;
    private Seller SellerName;

    public Product(Model modelName, String nameOfProduct, Integer priceOfProduct, String optionalText, long dateOfPost, Location productLocation, Seller sellerName) {
        this.ModelName = modelName;
        this.NameOfProduct = nameOfProduct;
        this.PriceOfProduct = priceOfProduct;
        this.OptionalText = optionalText;
        this.DateOfPost = dateOfPost;
        this.ProductLocation = productLocation;
        this.SellerName = sellerName;
    }

    public Model getModelName() {
        return ModelName;
    }

    public void setModelName(Model modelName) {
        ModelName = modelName;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public Integer getPriceOfProduct() {
        return PriceOfProduct;
    }

    public void setPriceOfProduct(Integer priceOfProduct) {
        PriceOfProduct = priceOfProduct;
    }

    public String getOptionalText() {
        return OptionalText;
    }

    public void setOptionalText(String optionalText) {
        OptionalText = optionalText;
    }

    public long getDateOfPost() {
        return DateOfPost;
    }

    public void setDateOfPost(long dateOfPost) {
        DateOfPost = dateOfPost;
    }

    public Location getProductLocation() {
        return ProductLocation;
    }

    public void setProductLocation(Location productLocation) {
        ProductLocation = productLocation;
    }

    public Seller getSellerName() {
        return SellerName;
    }

    public void setSellerName(Seller sellerName) {
        SellerName = sellerName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ModelCar'" + ModelName.getNameModel() + '\'' +
                ", NameOfProduct='" + NameOfProduct+ '\'' +
                ", PriceOfProduct='" + PriceOfProduct + '\'' +
                ", DateOfPost='" + DateOfPost + '\'' +
                ", ProductLocation='" + ProductLocation.getNameOfLocation() + '\'' +
                ", OptionalText='" + OptionalText + '\'' +
                ", SellerName='" + SellerName.getNameSeller() + '\'' +
                '}';
    }
}
