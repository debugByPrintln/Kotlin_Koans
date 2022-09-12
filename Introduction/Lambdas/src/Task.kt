fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { a:Int -> a%2 == 0 }
