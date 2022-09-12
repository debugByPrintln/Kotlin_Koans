// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> {
    val c : Comparator<Customer> = Comparator{c1:Customer, c2:Customer -> c1.orders.size - c2.orders.size}

    return customers.sortedWith(c).reversed()

    //return customers.sortedByDescending { it.orders.size } -- chto takoe it???
}