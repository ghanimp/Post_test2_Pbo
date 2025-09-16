## Ghani Mandala Putra
## 2409116042

---------


<img width="353" height="223" alt="image" src="https://github.com/user-attachments/assets/9ebae54f-43ff-4fbe-8a0c-b2e80f963158" />


Pertama saya membagi file saya pada 3 package
- Main (Post_test1) sebagai class yang menjalankan program.
- Model (Pemain) berisi model pemain.
- Service (PemainService) berisi sistem CRUD.


<img width="464" height="113" alt="image" src="https://github.com/user-attachments/assets/5e3a111b-cd1a-4792-b4f2-52e5eeb4e6a8" />


Pada class main terdapat code yang digunakan untuk menjalankan program
- Package merupakan tempat file tersimpan
- import scanner digunakan untuk melakukan inputan
- import service digunakan agar dapat mengakses servicepemain



<img width="1029" height="404" alt="image" src="https://github.com/user-attachments/assets/a993b41b-de98-404d-b5a5-1f814c75b240" />


Gambar ini adalah gambaran dari pilihan yang tersedia untuk user saat baru masuk program.


<img width="1064" height="771" alt="image" src="https://github.com/user-attachments/assets/42222e43-8015-489a-a7bf-482d5b17eec7" />


Selanjutnya adalah kode dimana user akan melakukan input, dan juga sistem akan otomatis menyesuaikan input yang dimasukan oleh user dengan case.


<img width="509" height="220" alt="image" src="https://github.com/user-attachments/assets/c7656c88-e60e-4ccd-bf45-eddd4d7b1756" />


Kode pada gambar menunjukkan sebuah class bernama Pemain yang berada di dalam package model. Class ini berfungsi sebagai blueprint atau struktur data untuk menyimpan informasi pemain sepak bola. Di dalamnya terdapat lima atribut dengan akses private yaitu nama, klub, posisi, nomorPunggung, dan usia.


<img width="1058" height="205" alt="image" src="https://github.com/user-attachments/assets/9e59a386-f346-43d2-afd3-3d0c40815e49" />


Kode pada gambar tersebut menunjukkan constructor milik class Pemain. Constructor ini dipanggil ketika membuat objek pemain baru agar semua data langsung terisi. Parameter yang diminta yaitu nama, klub, posisi, nomorPunggung, dan usia. Di dalam constructor, setiap parameter tersebut kemudian disimpan ke atribut class dengan menggunakan keyword this untuk membedakan antara variabel class dan parameter.


<img width="612" height="327" alt="image" src="https://github.com/user-attachments/assets/4e9ebaac-8aad-40f2-9ffd-428256074a16" />


Kode yang terlihat pada gambar adalah contoh getter dan setter pada class Pemain.


<img width="584" height="416" alt="image" src="https://github.com/user-attachments/assets/ec175dae-973d-4c0c-8c18-8373ddd98c42" />


Kode yang terlihat pada gambar adalah contoh getter dan setter pada class Pemain.


<img width="651" height="314" alt="image" src="https://github.com/user-attachments/assets/9f69eb28-2f46-4774-bbf9-1387fe69bb95" />


Kode ini adalah lanjutan dari getter dan setter pada class Pemain.
Method setNomorPunggung(int nomorPunggung) digunakan untuk mengubah nilai atribut nomorPunggung. Method getUsia() berfungsi untuk mengambil nilai atribut usia, sedangkan setUsia(int usia) digunakan untuk mengubah nilai atribut usia.


<img width="991" height="167" alt="image" src="https://github.com/user-attachments/assets/9b78d932-bbde-4ef7-841a-612a7586e5f6" />


Kode pada gambar tersebut adalah implementasi method toString() yang dioverride dari class Object. Method ini dipakai untuk mengubah objek Pemain menjadi representasi string yang mudah dibaca.


<img width="522" height="149" alt="image" src="https://github.com/user-attachments/assets/4a912fbf-0b81-4001-ace0-75cc82e54b8b" />


Sama seperti sebelumnya ini untuk menyimpan file, menginput, dan mengakses class.


<img width="762" height="362" alt="image" src="https://github.com/user-attachments/assets/3a883d79-a02d-47f1-aea0-0c12e3eaeab6" />


Kode pada gambar tersebut adalah bagian awal dari class PemainService. Class ini berperan sebagai lapisan logika (service) untuk mengelola data pemain. Terdapat atribut pemainList bertipe ArrayList<Pemain> yang digunakan untuk menyimpan kumpulan objek pemain, serta atribut input yang merupakan objek Scanner untuk membaca input pengguna dari console.


<img width="770" height="291" alt="image" src="https://github.com/user-attachments/assets/19a2f03a-2770-4594-8720-a07b3bfba1a9" />


Kode pada gambar tersebut adalah bagian dari proses validasi input nomor punggung pemain. Variabel nomorPunggung bertipe int disiapkan untuk menampung nilai yang diinput pengguna. Program menggunakan loop while (true) agar terus meminta input hingga pengguna memasukkan angka yang valid. Di dalamnya terdapat blok try untuk mencoba mengonversi input string menjadi integer dengan Integer.parseInt().


<img width="872" height="384" alt="image" src="https://github.com/user-attachments/assets/b7781b68-abd7-4fa8-b824-18aa3ba6dc89" />


Kode pada gambar ini adalah lanjutan proses input data pemain untuk atribut usia serta proses penyimpanan data ke dalam pemainList. Pertama dibuat variabel usia bertipe int yang nilainya diminta dari pengguna melalui loop while (true).


<img width="717" height="371" alt="image" src="https://github.com/user-attachments/assets/12b6ed32-ebf1-4495-b43b-d87c290182a8" />


Kode ini merupakan kode untuk menampilkan pemain.


<img width="833" height="445" alt="image" src="https://github.com/user-attachments/assets/f7bd551a-e338-4f4b-9c72-ae7bd04f2827" />


Kode ini digunakan update pemain jika saat melakukan penginputan terdapat kesalahan.


<img width="1053" height="712" alt="image" src="https://github.com/user-attachments/assets/91dc1b1f-0823-419f-8990-026b8ae145c4" />


Sistem akan otomatis mencari nama yang diinput.
Jika nama yang dimasukkan salah maka tidak dapat melakukan update.


<img width="848" height="460" alt="image" src="https://github.com/user-attachments/assets/391ab7ef-5f98-4182-a569-7850448e7334" />


Kode ini digunakan untuk menghapus pemain yang mungkin sudah pensiun atau sudah keluar dari liga inggris.


<img width="998" height="209" alt="image" src="https://github.com/user-attachments/assets/efe71cd3-8607-4e4b-8ee6-74e5f4fb02de" />


Ini merupakan lanjutan dari kode menghapus pemain.


<img width="863" height="578" alt="image" src="https://github.com/user-attachments/assets/4daf54e5-b212-4599-bb76-2b72af9452c6" />


Ini merupakan kode untuk sistem mencari nama yang dimasukkan dengan sesuai.


# Output


<img width="557" height="217" alt="image" src="https://github.com/user-attachments/assets/748de609-71d8-4b86-aeed-79b68d44bfa0" />


<img width="398" height="183" alt="image" src="https://github.com/user-attachments/assets/59927317-4590-4ce5-a6c1-ac14415cf831" />


<img width="846" height="95" alt="image" src="https://github.com/user-attachments/assets/51700331-783d-4976-b7f7-1beefc7b72b0" />


<img width="526" height="210" alt="image" src="https://github.com/user-attachments/assets/790eaade-f462-4942-b7d2-ea16f44822d0" />


<img width="858" height="369" alt="image" src="https://github.com/user-attachments/assets/b79f6c0b-f9a6-4089-acd5-c8ea3b3db6b3" />


<img width="846" height="127" alt="image" src="https://github.com/user-attachments/assets/91f4371f-464e-4bae-b471-b7edbe350509" />


<img width="800" height="122" alt="image" src="https://github.com/user-attachments/assets/9e2750be-7044-4a45-a596-9465cf0a0c8f" />



