# 1. Tipe Data Primitif di Java
  ## Java memiliki 8 tipe data primitif yang digunakan untuk menyimpan nilai dasar:

| Tipe Data | Ukuran         | Contoh Nilai | Keterangan                                   |
| --------- | -------------- | ------------ | -------------------------------------------- |
| `byte`    | 1 byte (8 bit) | 100          | Bilangan bulat kecil (-128 sampai 127)       |
| `short`   | 2 byte         | 30000        | Bilangan bulat (-32,768 sampai 32,767)       |
| `int`     | 4 byte         | 100000       | Bilangan bulat umum (paling sering dipakai)  |
| `long`    | 8 byte         | 10000000000L | Bilangan bulat besar (pakai `L` di akhir)    |
| `float`   | 4 byte         | 3.14f        | Bilangan desimal (pakai `f` di akhir)        |
| `double`  | 8 byte         | 3.14159      | Bilangan desimal presisi tinggi              |
| `char`    | 2 byte         | 'A'          | Karakter tunggal (pakai tanda petik tunggal) |
| `boolean` | 1 bit          | true / false | Nilai logika                                 |

# 2. Tipe Data Non-Primitif (Reference Types)
## Tipe data ini bukan nilai langsung, melainkan referensi ke objek:

| Tipe Data   | Contoh                   | Keterangan                   |
| ----------- | ------------------------ | ---------------------------- |
| `String`    | "Halo"                   | Teks (kumpulan karakter)     |
| `Array`     | `{1, 2, 3}`              | Kumpulan nilai               |
| `Class`     | `Scanner`, `Random`, dll | Objek dari class tertentu    |
| `Interface` | `Runnable`, `List`, dll  | Struktur kontrak untuk class |


## 🔹 Perbedaan Utama: Primitif vs Reference (Referensi)
| Aspek                  | Tipe Data **Primitif**                     | Tipe Data **Referensi**                          |
| ---------------------- | ------------------------------------------ | ------------------------------------------------ |
| **Isi Variabel**       | Menyimpan **nilai langsung**               | Menyimpan **alamat memori** (referensi ke objek) |
| **Contoh**             | `int`, `double`, `boolean`, `char`, dst    | `String`, `Array`, `Class`, `Scanner`, dll       |
| **Ukuran**             | Tetap (misal `int` = 4 byte)               | Ukuran bervariasi, tergantung objek              |
| **Nilai Default**      | 0, false, '\u0000'                         | `null` (belum ada objek)                         |
| **Lokasi di Memori**   | Disimpan di **stack**                      | Disimpan di **heap**, referensinya di stack      |
| **Bisa punya method?** | ❌ Tidak (contoh: `int` tidak punya method) | ✅ Ya (contoh: `String.length()`)                 |

| Tipe      | Menyimpan apa? | Lokasi Memori                    | Cocok untuk...                 |
| --------- | -------------- | -------------------------------- | ------------------------------ |
| Primitif  | Nilai langsung | Stack                            | Data kecil & sederhana         |
| Referensi | Alamat objek   | Heap (dengan referensi di Stack) | Struktur data kompleks & objek |
