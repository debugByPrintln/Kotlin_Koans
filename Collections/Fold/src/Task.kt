// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val products : Set<Product> = customers.flatMap { it.getOrderedProducts() }.toSet()
    return customers.fold(products){orderedByAll: Set<Product>, customer: Customer -> orderedByAll.intersect(customer.getOrderedProducts()) }
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap { it.products }