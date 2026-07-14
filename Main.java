public class Main {

    public static void main(
            String[] args
    ) {

        Inventory inventory =
                new Inventory();

        SampleData.load(
                inventory
        );

        InventoryReport.print(
                inventory
        );

    }

}
