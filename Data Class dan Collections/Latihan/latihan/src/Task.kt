/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
        "type" to "Motorcycle",
        "maxSpeed" to "230Km/s",
        "maxTank" to "10Ltr"
    )

    // TODO 2
    val Type = vehicle.getValue("type")
    val MaxSpeed = vehicle.getValue("maxSpeed")
    val MaxTank = vehicle.getValue("maxTank")

    // TODO 3
    println("Vehicle")
    println("Type: "+Type)
    println("Maximal Speed: "+MaxSpeed)
    println("Maximal Tank: "+MaxTank)

}