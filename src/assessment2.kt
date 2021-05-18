fun main() {
bookList()
getNumber()
}
data class Book(var title:String,var author:String,var pages:Int)
fun bookList() {
    var book = listOf(
        Book("Born a crime", "Trevor", 23),
        Book("Bible","John",245),
         Book("Coloan","Muhammad",756)
    )
    var descendingTitle=book.sortedByDescending { book -> book.title }
    println(descendingTitle)
}
fun getNumber(){
    var x = 1
    do {
        println(x*x)
        x--
    } while (x*x <= 3000)
}
class  Truck( var registration:String, var totalWeight:Double, var capacity:Int){
    fun load(weight: Int){
        var weight=weight+totalWeight
        println(weight)
        totalWeight++
    }
    fun  unload(weight: Int){
        var weight=weight-totalWeight
        println(weight)
        totalWeight++
    }
    fun weightCheck(){
        if (totalWeight>50){
            return ${}
        }

    }
}
class Trairel( var registration:String, var totalWeight:Double, var capacity:Int){

}