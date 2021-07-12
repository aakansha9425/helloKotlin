package Collections

fun main() {
    // this is immutable if u don't store it nothing is changes in that map
    //key value pair immuatble
    val map1 = mapOf<Int, Any>(1 to "chinki", 2 to "aakansha ")
    println(map1)
    println(map1.contains("chinki"))
    //containkey,containvalue

    println(map1.getOrDefault(3, "arpana"))
    println(map1)
    //to add temporarily
    println(map1.plus(Pair(5, "wer")))
    //to remove
    println(map1.minus(2))

    println("\n")
    AsHashMap()
    println("\n")
    mutableHashmap()
}

fun mutableHashmap() {
    val mutablemap= mutableMapOf<Int,String>(1 to "chinki",2 to "aaki", 3 to "aallya")
    mutablemap.put(4,"four")
    println(mutablemap)

}

fun AsHashMap() {
    val hmap1 = hashMapOf<Int, Any>(1 to "chimki", 2 to "aakiii", 3 to "four");
    val hmap2 = hashMapOf<Int, Any>(1 to "chimki");
    var hmap3 = HashMap<Int, Any>()// another way to create hashmap we can not pur value directly in here
    println(hmap1)
    hmap1.put(3, "hello")
    hmap1.put(2, "jesica")
    println(hmap1)
    println(hmap1.size)
    println(hmap1.get(2))
    hmap1.remove(2)
    println(hmap1)
    println(hmap1)
    hmap1.putAll(hmap2)
    hmap1.replace(1, "aaki")
    println(hmap1.keys)
    hmap3 = hmap1.clone() as HashMap<Int, Any>
    println(hmap3)
}
