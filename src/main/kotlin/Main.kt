fun okryglenie(chislo: String?): Int{
    var col: Int = chislo!!.length
    if (col > 3){
        var a: Int = col - 3
        var i: Int = 0
        var b: Int = 0
        while (i < a){
             print(chislo[b])
            i++
            b++
        }
        print("K")
    }
    else{
        print(chislo)
    }
    return 0
}

fun okonchanie(chislo: String?): Int{
    var col: Int = chislo!!.length
    var pes: Int = col - 1
    var sobaka: Char = chislo[pes]
    if (sobaka =='1'){
        print("$chislo год")
    }
    else if (sobaka =='2'|| sobaka =='3' || sobaka =='4'){
        print("$chislo года")
    }
    else{
        print("$chislo лет")
    }
    return 0
}

class Words{
    init {
        println("Класс Words создан!")
    }
}

class Message constructor(var username: String){
    fun introduse(){
        println("Привет, меня зовут ${this.username}")
    }
}

fun main(args: Array<String>) {

    val dog = Message("Dog")
    dog.introduse()

//    var dog: Int = 1
//    while (dog <= 5){
//        if (dog == 1){
//            println(1)
//        }
//        else if (dog == 2){
//            println(22)
//        }
//        else if (dog == 3){
//            println(333)
//        }
//        else if (dog == 4){
//            println(4444)
//        }
//        else{
//            println(55555)
//        }
//        dog++
//
//    }

//    var dog: Int = 5
//    var gav: Int = readLine()!!.toInt()
//    while (dog != gav){
//        println("Вы не угадали.Введите число заново")
//        gav = readLine()!!.toInt()
//    }
//    println("Молодец!")

//    var dog: Int = readLine()!!.toInt()
//    for (i in 1..dog){
//        var gav: Int = dog % i
//        if (gav == 0){
//            print("$i ,")
//        }
//    }

//    var dog: String? = readLine()
//    var gav: Int = dog!!.length
//    var chetnoe: Int = 0
//    var nechetnoe: Int = 0
//    for(i in 0..gav-1){
//        if (dog[i] == '1' || dog[i] == '3'|| dog[i] == '5'|| dog[i] == '7'|| dog[i] == '9'){
//            nechetnoe++
//        }
//        else{
//            chetnoe++
//        }
//    }
//    println("Четных: $chetnoe")
//    println("Нечетных: $nechetnoe")


//    var dog: Int = 0
//    for (i in 1..100){
//        if (i % 4 == 0){
//            dog += i
//        }
//    }
//    println(dog)

//    var i = 5
//    var dog: Int = 0
//    while(i <= 57){
//        if (i != 34 || i != 46 || i != 52){
//            dog += i
//        }
//        i++
//    }
//    println(dog)

//    var chislo: Int = 5
//    var bykva: Char = 'F'
//    var slovo: String = "Привет"
//    var DvoichnoeChislo: Double = 90.2
//    val neizmenyaemaya: Int = 67
//    println(slovo)

//    var line: String? = readLine()
//
//    if (line != null) {
//        for(c in line) {
//            print(c)
//            print(",")
//        }
//    }

//    val n = readLine()
//    val nn: Int = n!!.toInt()
//    val nnn: Int = nn*2
//
//    println("$nn$nnn")

//    var name: String? = readLine()
//    var age: String? = readLine()
//
//    println("Привет, $name! Тебе уже $age")

//    var days: Int = 2642
//    var years: Int = days / 365
//    var weeks: Int = (days - (years * 365)) / 7
//    var day: Int = days - (years * 365) - (weeks * 7)
//    println ("Лет:$years, недель:$weeks, дней:$day")

//    var line: String? = readLine()
//    okonchanie(line)
//    okryglenie(line)

}
