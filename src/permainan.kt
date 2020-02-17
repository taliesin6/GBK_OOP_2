class permainan {
    fun cek(pilihanPemain1:String?, pilihanPemain2:String?){
        if (pilihanPemain1.equals(pilihanPemain2)) {
            println("SERI tidak ada yang menang dan tidak ada yang kalah")
        } else if (pilihanPemain1.equals("BATU") && pilihanPemain2.equals("GUNTING") ||
            pilihanPemain1.equals("GUNTING") && pilihanPemain2.equals("KERTAS" )||
            pilihanPemain1.equals("KERTAS" )&& pilihanPemain2.equals("BATU") ){
            println("Pemain 1 MENANG, Pemain 2 KALAH, Hahaha")
        } else if (pilihanPemain1.equals("BATU") && pilihanPemain2.equals("KERTAS")||
            pilihanPemain1.equals("GUNTING") && pilihanPemain2.equals("BATU") ||
            pilihanPemain1.equals("KERTAS") && pilihanPemain2.equals("GUNTING")) {
            println("Pemain 1 KALAH, Pemain 2 MENANG, Huhuhu")
        }

    }

    fun ambilPilihan(nomer: Int?):String? {
        var pemain : String?
        do { print("Pemain $nomer pilih apa ? (Gunting, Batu, Kertas) : ")
            pemain = readLine()!!.toUpperCase().trim()
            if(pemain.equals("GUNTING") || pemain.equals("BATU") || pemain.equals("KERTAS")){
                break
            } else {
                println("Pilihan Salah! pilih antara Gunting, Batu, atau Kertas")
            }
        } while (true)
        return pemain
    }

    //
}