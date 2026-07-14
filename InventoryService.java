import java.util.List;

public class InventoryService {

    public static double totalValue(
            List<Product> products
    ) {

        double total = 0;

        for (Product product : products) {

            total += product.totalValue();

        }

        return total;

    }

    public static int lowStock(
            List<Product> products
    ) {

        int count = 0;

        for (Product product : products) {

            if (product.getQuantity()
                    < Config.LOW_STOCK) {

                count++;

            }

        }

        return count;

    }

}
