 fun main(){
        print(soulShotMaster())
    }

 fun soulShotMaster(): String {
     println("Сколько процентов необходимо вкачать : ")
     var allPercent: Double = readLine()?.toDouble() ?: error("Вы должны ввести число")
     while (allPercent > 100) {
         println("Количество процентов не может быть больше 100 \nПовторите попытку")
         allPercent = readLine()?.toDouble() ?: error("Вы должны ввести число")
     }

     println("Введите кол-во % на монстра :")
     var monsterPercent: Double = readLine()?.toDouble() ?: error("Вы должны ввести число")
     while (monsterPercent > 100) {
         println("Количество процентов за монстра не может быть больше 100 \nПовторите попытку")
         monsterPercent = readLine()?.toDouble() ?: error("Вы должны ввести число")
     }

     println("Введите кол-во зарядов души за монстра :")
     val soulShotCountForMonster: Double = readLine()?.toDouble() ?: error("Вы должны ввести число")
     println("Введите стоимость заряда души : ")
     val soulShotPrice: Double = readLine()?.toDouble() ?: error("Вы должны ввести число")

     val monsterCount = allPercent / monsterPercent
     val soulShotAllCount = monsterCount * soulShotCountForMonster
     val soulShotAllPrice = soulShotAllCount * soulShotPrice

     return "Необходимо убить : ${String.format("%.2f", monsterCount)}\n" +
             "Необходимо сосок : ${String.format("%.2f", soulShotAllCount)}\n" +
             "Необходимо адены на соски : ${String.format("%.2f", soulShotAllPrice)}"
 }

