package com.alphard.campusinfoapp

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val announcementList: List<Announcement> = listOf(
        Announcement(1, "Libur Idul Fitri 1446 H", "25 Maret 2026", "Akademik", "Segenap civitas akademika Universitas Pertamina mengucapkan selamat hari raya..."),
        Announcement(2, "Pendaftaran Beasiswa Pertamina 2026", "28 Maret 2026", "Beasiswa", "Terbuka bagi mahasiswa semester 2 dan 4 dengan IPK minimal 3.5..."),
        Announcement(3, "Workshop Mobile Development", "02 April 2026", "Event", "Pelajari cara membangun aplikasi Android modern menggunakan Jetpack Compose..."),
        Announcement(4, "Update Jadwal UTS Semester Genap", "05 April 2026", "Akademik", "Jadwal ujian tengah semester kini tersedia di portal mahasiswa..."),
        Announcement(5, "Lomba Inovasi Mahasiswa (LIM)", "10 April 2026", "Kompetisi", "Tunjukkan ide kreatifmu dan menangkan total hadiah jutaan rupiah...")
    )
}