// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
    return customers.filter {
        val (u, d) = it.orders.partition { it.isDelivered == false }
        u.size > d.size
    }.toSet()
}