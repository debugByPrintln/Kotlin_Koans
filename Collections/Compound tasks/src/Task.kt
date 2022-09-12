// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {

    //Решение без доп функции getOrderedAndDeliveredProducts()
    //return customer.orders.filter { it.isDelivered }.flatMap { it.products }.maxByOrNull { it.price }

    val orderedProducts = customer.getOrderedAndDeliveredProducts()
    return orderedProducts.maxByOrNull { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val orderedProducts = customers.flatMap { it.getOrderedProducts() }
    return orderedProducts.count{it == product}
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap { it.products }

fun Customer.getOrderedAndDeliveredProducts(): List<Product> =
    orders.filter { it.isDelivered }.flatMap { it.products }