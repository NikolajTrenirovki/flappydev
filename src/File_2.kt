fun main(){
    println(getResult(arrayOf(2, 3, 5, 3, 1, 2, 1,5,4)))
    println(getResult(arrayOf(2, 3, 5, 3, 1, 2, 1))) // 5
    println(getResult(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1))) // 5
    println(getResult(arrayOf(1, 1, 1, 1, 10))) // 10


}

fun getResult(socks: Array<Int>): Int {
    // Write your code here...
    var result: Int = 0
    var array: Array<Int> = socks
    array.sort()
    println("arraySize ${array.size}")
    for(index in array.indices){
        println("array[$index] ${array[index]}")
        if(index == array.size-1){
            println("index $index")
            result = array[index]
            break
        }
        if ((index%2 == 0) and (array[index] != array[index+1])){
            result = array[index]
            break
        }
    }
    return result
}

/*
Собираясь по утрам на работу, Джо устал каждый раз находить носки без пары.
Он пронумеровал все свои носки и написал программу, которая выявляет номер носка, который не имеет пару.

Теперь у Джо всегда отличные носки и больше свободного времени

Ввод:
socks - массив чисел, который всегда имеет одно беспарное число

Вывод:
integer - значение числа без пары

Example:

socks = [2, 3, 5, 3, 1, 2, 1]
getResult(socks) -> 5*/
