package jsondatabase

fun main() {
    val cells = List(100) { "" }.toMutableList()

    do {
        val input = readln()
        val inputList = input.split(" ")

        println(
            when (inputList.first()) {
                "get" -> {
                    if (inputList.size == 2 && inputList[0] == "get" && inputList[1].toInt() <= 100 && cells[inputList[1].toInt() - 1].isNotEmpty()) {
                        cells[inputList[1].toInt() - 1]
                    } else {
                        "ERROR"
                    }
                }

                "set" -> {
                    if (inputList.size >= 3 && inputList[0] == "set" && inputList[1].toInt() <= 100) {
                        cells[inputList[1].toInt() - 1] = inputList.slice(2..<inputList.size).joinToString(" ")
                        "OK"
                    } else {
                        "ERROR"
                    }
                }

                "delete" -> {
                    if (inputList.size == 2 && inputList[0] == "delete" && inputList[1].toInt() <= 100) {
                        cells[inputList[1].toInt() - 1] = ""
                        "OK"
                    } else {
                        "ERROR"
                    }
                }

                "exit" -> {
                    break
                }

                else -> {
                    "ERROR"
                }
            }
        )
    } while (true)
}