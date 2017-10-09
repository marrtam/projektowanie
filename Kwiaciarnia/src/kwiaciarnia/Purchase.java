package kwiaciarnia;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gregorz Trela on 09.10.17.
 */
public class Purchase {
    int ClientId;
    Map<Product, Integer> Products;
    Timestamp PurchaseDate;
    Double Total = 0.0;

    public Purchase(int clientId, Map<Product, Integer> products) {
        ClientId = clientId;
        Products = products;
        PurchaseDate = new Timestamp(System.currentTimeMillis());
        products.forEach((key, value) -> Total += (key.getPrice()*value));
    }
}
