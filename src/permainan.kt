class permainan {
    fun cek(pilihanPemain1:String?, pilihanPemain2:String?){
        if (pilihanPemain1 == pilihanPemain2) {
            println("SERI tidak ada yang menang dan tidak ada yang kalah")
        } else if (pilihanPemain1 == "batu" && pilihanPemain2 == "gunting" ||
            pilihanPemain1 == "gunting" && pilihanPemain2 == "kertas" ||
            pilihanPemain1 == "kertas" && pilihanPemain2 == "batu") {
            println("Pemain 1 Menang, Pemain 2 Kalah, Hahaha")
        } else if (pilihanPemain1 == "batu" && pilihanPemain2 == "kertas" ||
            pilihanPemain1 == "gunting" && pilihanPemain2 == "batu" ||
            pilihanPemain1 == "kertas" && pilihanPemain2 == "gunting") {
            println("Pemain 1 Kalah, Pemain 2 Menang, Huhuhu")
        }

    }

    fun ambilPilihan(nomer: Int?):String? {
        var pemain : String?
        do { print("Pemain $nomer pilih apa ? (Gunting, Batu, Kertas) : ")
            pemain = readLine()!!.toLowerCase().trim()
            if(pemain == "gunting" || pemain == "batu" || pemain == "kertas"){
                break
            } else {
                println("Pilihan Salah! pilih antara Gunting, Batu, atau Kertas")
            }
        } while (true)
        return pemain
    }

    //
}