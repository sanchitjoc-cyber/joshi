package week8.workshop8;




public class ShoppingApp
{
    public static void main(String[] args) {
        // Create ShoppingCart object
        ShoppingCart cart = new ShoppingCart("Dyson", 100000, 2);

        // Display cart details
        cart.displayCart();

        // Calculate total price
        double total = cart.calculateTotal();
        System.out.println("Total Price: Rs." + total);

        // Calculate discounted total with a festival offer (e.g., 10% discount)
        double discountedTotal = cart.calculateDiscountedTotal(10);
        System.out.println("Discounted Total (10% off): Rs." + discountedTotal);

        // Update quantity using setter
        cart.setQuantity(3);
        System.out.println("\nAfter updating quantity:");
        cart.displayCart();
    }
}