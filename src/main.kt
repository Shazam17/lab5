import java.io.BufferedReader
import java.io.File


fun main(){
    val bufferedReader: BufferedReader =
        File("C:\\Users\\JohnPower\\IdeaProjects\\lab5\\src\\text.txt").bufferedReader()



    var vowels = arrayListOf<Char>('A','E','Y','I','O')

    val inputString = bufferedReader.use { it.readText() }
    var words = inputString.split(" ")

    var isVowel = fun (letter:Char) :Boolean {
        var isIn = false
        vowels.forEach { if(letter == it) return true}
        return false
    }

    words.forEach { if(isVowel(it[0])) print("${it.decapitalize()} ") else print("${it} ") }


}
