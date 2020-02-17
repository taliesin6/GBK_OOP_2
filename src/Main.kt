// 2do
// tambahin fitur scoring
// tambahin main dengan komputer
// tambahin menu
// tambahin class
// implementasi inheritance
// impelmenetasi enum
// ver 0.0.8

fun main(){
    println("====================")
    println("MULAI GAME SUIT")
    println("====================")

    val pemain1 = pemain()
    val pemain2 = pemain()
    val main = permainan()

    pemain1.pilihan = main.ambilPilihan(1)
    pemain2.pilihan = main.ambilPilihan(2)

    println("Pemain 1 memilih ${pemain1.pilihan} dan Pemain 2 memilih ${pemain2.pilihan}")
    main.cek(pemain1.pilihan,pemain2.pilihan)

}


