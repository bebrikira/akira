public class SampleData {

    public static void load(
            Inventory inventory
    ) {

        inventory.add(
                new Product(
                        "Laptop",
                        8,
                        950
                )
        );

        inventory.add(
                new Product(
                        "Keyboard",
                        20,
                        35
                )
        );

        inventory.add(
                new Product(
                        "Mouse",
                        18,
                        18
                )
        );

        inventory.add(
                new Product(
                        "Monitor",
                        4,
                        260
                )
        );

        inventory.add(
                new Product(
                        "USB Hub",
                        15,
                        22
                )
        );

    }

}
