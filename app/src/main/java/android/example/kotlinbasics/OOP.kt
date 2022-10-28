package android.example.kotlinbasics

fun main(){
//    var omar = Person("Omar", "Hosny", 5);
//    var fCar = Car("BMW");
//    println(fCar.getBrand())
//    fCar.setBrand("MERCIDEC");
//    println(fCar.getBrand())

//    val user1 = User("omar", 1);
//    // Distructuring
//    val (name, id) = user1;
//    print("$name \n")
//    print(id)

//    var mob1 = MobilePhone("IOS","APPLE","011");
//    mob1.chargeBattery(15);

//    val bm = BMW("BM","2002",225);
//    bm.drive(500);
//    val persons: List<String> = listOf("omar", "hosny");
//    print(persons.subList(0, persons.size));
    print("Hello")
}



//class Person {
//    var age: Int? = null;
//    var fName: String? =  null;
//    var lName: String? = null;
//
//    constructor(fName: String, lName: String, age: Int){
//            this.fName = fName
//            this.lName = lName
//            this.age = age
//        print("Person Created => ${fName}")
//    }
//    init {
//
//    }
//}


//class Car{
//    private var myBrand: String? = null;
//
//    constructor(brand: String){
//        this.myBrand = brand;
//    }
//
//    fun getBrand(): String{
//
//        return this.myBrand ?: ""
//    }
//
//    fun setBrand(brand: String) {
//        this.myBrand = brand;
//    }
//}

//data class User(val name: String, val id: Int){}


//class MobilePhone(osName: String, brand: String, model: String){
//    private var battery: Int = 20;
//
//    fun chargeBattery(value: Int){
//        println("was $battery and now => ${battery + value}");
//        this.battery+= value;
//    }
//
//    init {
//        println("The phone $model from $brand uses $osName as its Operating System")
//    }
//}
// **********************************
// Inheritance
//open class Viechel(val name : String, val brand: String) { // open keyword to make the class inheritable
//    open var range: Int = 0;
//    open fun drive(distance: Int){
//        print("Drove For $distance KM");
//    }
//}
//
//class BMW(name: String, brand: String, maxSpeed: Int) : Viechel(name, brand){
//    override var range: Int = 500;
//    override fun drive(distance: Int) {
//        print("Drove For $distance KM")
//    }
//}
// ************************


//interface Person {
//    val name: String;
//    val age: Int;
//    fun sayHello(){
//        print("Hello my name is $name \n");
//    }
//    fun getAge():String
//}
//
//class Employee(override val name: String, override val age: Int) : Person{
//    override fun sayHello() {
//        super.sayHello()
//    }
//
//    override fun getAge(): String {
//        return age.toString();
//    }
//}


//*****************
//Abstraction
//abstract class absClass{
//    abstract var name:String;
//    abstract fun go();
//    fun back(){
//
//    }
//}
//
//class robot(override var name: String) : absClass() {
//    override fun go() {
//        TODO("Not yet implemented")
//    }
//}


