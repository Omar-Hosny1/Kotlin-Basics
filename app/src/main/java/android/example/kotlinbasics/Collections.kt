package android.example.kotlinbasics

fun main(){
//    ******************** Arrays ********************
//    val numbers: IntArray = intArrayOf(0,1,2,3,4,5,6,7)
//    val numbers = arrayOf(0,1,2,3,4,5,6,7);
//    print(numbers.contentToString() + "\n")
//    for(element in numbers){
//        print("$element  ")
//    }
//    for(i in 0 until numbers.size){
//        print(numbers[i]);
//    }
//
//    val fruits = arrayOf(Fruit("mango", 55), Fruit("Water melon", 70));
//    print("\n" + fruits.contentToString());
//    ******************** Arrays ********************



//    ******************** Lists ********************
//    val fruits = listOf<Fruit>(Fruit("",4));
//    val days = listOf<Int>(1, 2 , 3 ,4); // immutable => can't add eles to it
//    days.toMutableList(); => mutable => cant add eles to it

//    for(i in 0 until days.size){
//        print(days[i]);
//    }
//    val mutableListDays = mutableListOf<String>("omar");
//    mutableListDays.add(1,"hosny");
//    println("\n" + mutableListDays.toString());
//
//    val removeList = listOf("hosny");
//    mutableListDays.removeAll(removeList);
//    print(mutableListDays);
//    mutableListDays.removeAll(mutableListDays); // its empty now
//    ******************** Lists ********************


//    ******************** Sets ********************
//    val fruits: Set<Fruit> = setOf(Fruit("Orange",10));
//    val fruits = setOf(1,2,3,2,1);
//    println(fruits.toString())
//    ******************** Sets ********************

//    ******************** Maps ********************
//    val daysOfTheWeek = mapOf(1 to "sunday", 2 to "monday"); // immutable
//    val daysOfTheWeek = mutableMapOf(1 to "sunday", 2 to "monday"); // mutable
//    daysOfTheWeek.put(3, "Wednesday")
//    daysOfTheWeek[4] = "Monday" // => another way of insertion
//    println(daysOfTheWeek[2]);
//    for (key in daysOfTheWeek.keys){
//        println("key => $key")
//        println(daysOfTheWeek[key])
//    }
//    ******************** Maps ********************

}

data class Fruit(val name: String, val price: Int)