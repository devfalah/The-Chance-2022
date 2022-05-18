
fun calculatePercentageOfCharacterA(characters: List<String>): Double {
    var  numberOfCharacterA  = 0
    if (characters.isEmpty())
        return -1.0

    characters.forEach{
        if(it!="a"&&it!="b"){
            return -1.0

        }
        else if(it=="a"){
            numberOfCharacterA++
        }

    }
    val percentageOfCharacterA=(numberOfCharacterA.toDouble()/characters.size*100)
    return  String.format("%.1f",percentageOfCharacterA).toDouble()

}