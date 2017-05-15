/**
 * Created by marko on 27. 02. 2017.
 */

import java.util.ArrayList;

public class DataAll {
    private ArrayList<Product> listOfProducts = new ArrayList<>();
    private ArrayList<Seller> listOfSellers = new ArrayList<>();
    private ArrayList<Model> listOfCars = new ArrayList<>();
    //private ArrayList<Location> listOfLocations;
    private User me;

    public DataAll() {
        me = new User("UD","Undefined","None","unregistered@mail.com");
        listOfProducts = new ArrayList<Product>();
        listOfSellers = new ArrayList<Seller>();
        listOfCars = new ArrayList<Model>();
        //listOfLocations = new ArrayList<Location>();
    }

    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public Model addCarsToList(String idBrand, String nameBrand, String idModel, String nameModel  ) {
        /*Model nov = new Model(new Brand("H","Honda"),"SiR","Civic");
        Model ta = new Model(new Brand("N","Nissan"),"GTR","R35");
        Model tisti = new Model(new Brand("M","Mazda"),"FD3S","RX-7");
        Model nek = new Model(new Brand("T","Toyota"),"AE86","Corolla");
        listOfCars.add(nov);
        listOfCars.add(ta);
        listOfCars.add(tisti);
        listOfCars.add(nek);*/
        Model nov = new Model(new Brand(idBrand,nameBrand),idModel,nameModel);
        listOfCars.add(nov);
        return nov;
    }
    public Seller addSellersToList(String idSeller, String nameSeller, String contactSeller) {
        /*Seller mike = new Seller("MB","Mike Brewer","041555111");
        Seller edd = new Seller("EC","Edd China", "041111222");
        listOfSellers.add(mike);
        listOfSellers.add(edd);*/
        Seller nov = new Seller(idSeller,nameSeller,contactSeller);
        listOfSellers.add(nov);
        return nov;
    }
    public Product addProductsToList(String idBrand, String nameBrand, String idModel, String nameModel, String nameProduct, Integer priceProduct, long date, String nameLoc, long latitude, long longitude, String optText, String idSeller, String contactSeller, String sellerName) {
        /*Model nov = new Model(new Brand("H","Honda"),"SiR","Civic");
        Model ta = new Model(new Brand("N","Nissan"),"GTR","R35");
        Model tisti = new Model(new Brand("M","Mazda"),"FD3S","RX-7");
        Model nek = new Model(new Brand("T","Toyota"),"AE86","Corolla");
        Location tu = new Location("Leeds, UK",2212212,113121);
        Location tam = new Location("Birmingham, UK",4241421,1235543);
        Location nekje = new Location("Blackpool, UK",3215654,3457544);
        Location drugje = new Location("Boston, USA",3273432,5238532);
        Product prvi = new Product(nov,"Selling",1500,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111"));
        Product drugi = new Product(nov,"Buying",4500,"Used",System.currentTimeMillis(),tam,new Seller("EC","Edd China", "041111222"));
        Product tretji = new Product(nov,"Buying",15000,"Worn-Out",System.currentTimeMillis(),nekje,new Seller("MB","Mike Brewer","041555111"));
        Product cetrti = new Product(nov,"Selling",300,"For Parts",System.currentTimeMillis(),drugje,new Seller("EC","Edd China", "041111222"));
        listOfProducts.add(prvi);
        listOfProducts.add(drugi);
        listOfProducts.add(tretji);
        listOfProducts.add(cetrti);*/
        Product nov = new Product(new Model(new Brand(idBrand,nameBrand), idModel,nameModel),nameProduct,priceProduct,nameLoc,date,new Location(nameLoc,latitude,longitude),new Seller(idSeller,sellerName,contactSeller));
        listOfProducts.add(nov);
        return nov;
    }

    @Override
    public String toString() {
        return "DataAll{" +
                "User:" + me + '\'' +
                ", ListOfProducts='" + listOfProducts + '\'' +
                '}';
    }

    public static DataAll scenarijA() {
        DataAll da = new DataAll();
        da.me = new User("MW","Marko Watzak","watzo","marko.watzak@hotmail.com");

        Model nov = new Model(new Brand("H","Honda"),"SiR","Civic");
        Model ta = new Model(new Brand("N","Nissan"),"GTR","R35");
        Model tisti = new Model(new Brand("M","Mazda"),"FD3S","RX-7");
        Model nek = new Model(new Brand("T","Toyota"),"AE86","Corolla");
        nov = da.addCarsToList("H","Honda","SiR","Civic");
        ta = da.addCarsToList("N","Nissan","GTR","R35");
        tisti = da.addCarsToList("M","Mazda","FD3S","RX-7");
        nek = da.addCarsToList("T","Toyota","AE86","Corolla");

        Seller mike = new Seller("MB","Mike Brewer","041555111");
        Seller edd = new Seller("EC","Edd China", "041111222");
        mike = da.addSellersToList("MB","Mike Brewer","041555111");
        edd = da.addSellersToList("EC","Edd China", "041111222");

        Location tu = new Location("Leeds, UK",2212212,113121);
        Location tam = new Location("Birmingham, UK",4241421,1235543);
        Location nekje = new Location("Blackpool, UK",3215654,3457544);
        Location drugje = new Location("Boston, USA",3273432,5238532);

        Product prvi = new Product(nov,"Selling",1500,"New",System.currentTimeMillis(),tu,new Seller("MB","Mike Brewer","041555111"));
        Product drugi = new Product(nov,"Buying",4500,"Used",System.currentTimeMillis(),tam,new Seller("EC","Edd China", "041111222"));
        Product tretji = new Product(nov,"Buying",15000,"Worn-Out",System.currentTimeMillis(),nekje,new Seller("MB","Mike Brewer","041555111"));
        Product cetrti = new Product(nov,"Selling",300,"For Parts",System.currentTimeMillis(),drugje,new Seller("EC","Edd China", "041111222"));

        da.addProductsToList("H","Honda","SiR","Civic","Selling",1500,System.currentTimeMillis(),"Leeds, UK",2212212,113121,"","MB","Mike Brewer","041555111");
        da.addProductsToList("H","Honda","SiR","Civic","Buying",1500,System.currentTimeMillis(),"Leeds, UK",2212212,113121,"","MB","Mike Brewer","041555111");
        da.addProductsToList("H","Honda","SiR","Civic","Buying",1500,System.currentTimeMillis(),"Leeds, UK",2212212,113121,"","MB","Mike Brewer","041555111");
        da.addProductsToList("H","Honda","SiR","Civic","Buying",1500,System.currentTimeMillis(),"Leeds, UK",2212212,113121,"","MB","Mike Brewer","041555111");
        return da;
    }
}

