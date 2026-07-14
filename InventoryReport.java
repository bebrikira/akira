import java.util.List;

public class InventoryReport {

    public static void print(
            Inventory inventory
    ) {

        System.out.println("========================");
        System.out.println(Config.TITLE);
        System.out.println("========================");
        System.out.println();

        List<Product> products =
                inventory.getProducts();

        for (Product product : products) {

            System.out.println(
                    product.getName()
            );

            System.out.println(
                    "Quantity: "
                            + product.getQuantity()
            );

            System.out.println(
                    "Price: $"
                            + product.getPrice()
            );

            System.out.println();

        }

        System.out.println("------------------------");

        System.out.println(
                "Products: "
                        + products.size()
        );

        System.out.printf(
                "Inventory Value: $%.2f%n",
                InventoryService.totalValue(
                        products
                )
        );

        System.out.println(
                "Low Stock: "
                        + InventoryService.lowStock(
                        products
                )
        );

    }

}
