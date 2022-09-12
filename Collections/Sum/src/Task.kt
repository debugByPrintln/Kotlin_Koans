// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double =
        //toList function is unnecessary
        customer.orders.flatMap { it.products }.toList().sumOf { it.price }
