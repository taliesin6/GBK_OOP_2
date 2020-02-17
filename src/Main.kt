// 2do
// tambahin fitur scoring
// tambahin main dengan komputer
// tambahin menu - done
// tambahin class
// implementasi inheritance
// impelmenetasi enum
// ver 0.0.9

fun main(){

    var input = 0

    do {
        println("====================")
        println("MULAI GAME SUIT")
        println("====================")
        println("1. Bermain dengan Player 2")
        println("2. Bermain dengan Komputer")
        println("3. Bermain dengan Komputer (Skor)")
        println("4. Akhiri permainan")

        print("Masukan Input : ")

        input = readLine()!!.toInt()
        when(input){
            1 -> {
                println("Bermain dengan player 2")
                val pemain1 = pemain()
                val pemain2 = pemain()
                val main = permainan()
                pemain1.pilihan = main.ambilPilihan(1)
                pemain2.pilihan = main.ambilPilihan(2)

                println("Pemain 1 memilih ${pemain1.pilihan} dan Pemain 2 memilih ${pemain2.pilihan}")
                main.cek(pemain1.pilihan,pemain2.pilihan)
            }
            2 -> {
                println("Bermain dengan Komputer")
                val pemain1 = pemain()
                val Komputer = pemain()
                val main = permainan()
                pemain1.pilihan = main.ambilPilihan(1)
                Komputer.pilihan = main.ambilPilihanK()

                println("Pemain 1 memilih ${pemain1.pilihan} dan Pemain 2 memilih ${Komputer.pilihan}")
                main.cek2(pemain1.pilihan,Komputer.pilihan)
            }
            3 -> {
                println("Bermain dengan Komputer (Skor)")
                val pemain1 = pemain()
                val Komputer = pemain()
                val main = permainan()
                var SkorPemain1:Int = 5000
                var SkorKomputer:Int = 5000

                println("skor Pemain 1 $SkorPemain1")
                println("skor Komputer $SkorKomputer")
                do {
                pemain1.pilihan = main.ambilPilihan(1)
                print("Mau Bertaruh berapa coy...")
                var tambahanSkor:Int = readLine()!!.toInt()
                Komputer.pilihan = main.ambilPilihanK()

                println("Pemain 1 memilih ${pemain1.pilihan} dan Pemain 2 memilih ${Komputer.pilihan}")
                main.cek2(pemain1.pilihan,Komputer.pilihan)

                    if (pemain1.pilihan.equals(Komputer.pilihan)) {
                        SkorPemain1 = SkorPemain1 + 0
                        SkorKomputer = SkorKomputer + 0
                    } else if (pemain1.pilihan.equals("BATU") && Komputer.pilihan.equals("GUNTING") ||
                        pemain1.pilihan.equals("GUNTING") && Komputer.pilihan.equals("KERTAS" )||
                        pemain1.pilihan.equals("KERTAS" )&& Komputer.pilihan.equals("BATU") ){
                        SkorPemain1 = SkorPemain1 + tambahanSkor
                        SkorKomputer = SkorKomputer - tambahanSkor
                    } else if (pemain1.pilihan.equals("BATU") && Komputer.pilihan.equals("KERTAS")||
                        pemain1.pilihan.equals("GUNTING") && Komputer.pilihan.equals("BATU") ||
                        pemain1.pilihan.equals("KERTAS") && Komputer.pilihan.equals("GUNTING")) {
                        SkorPemain1 = SkorPemain1 - tambahanSkor
                        SkorKomputer = SkorKomputer + tambahanSkor
                    }
                    println("skor Pemain 1 $SkorPemain1")
                    println("skor Komputer $SkorKomputer")

                }
                 while (SkorPemain1 != 10000)
            }
            4 -> {
                println("Permainan Berakhir")
            }

        }
    } while (input != 4)

}


