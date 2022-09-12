// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
        return customers.all { it.city ==  city }
}

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean {
        return customers.any { it.city == city }
}

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int {
        return customers.count { customer: Customer -> customer.city == city  }
}
// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? {
        return customers.find{ it.city == city }
}
