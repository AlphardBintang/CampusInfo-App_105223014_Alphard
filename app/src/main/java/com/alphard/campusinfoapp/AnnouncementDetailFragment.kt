package com.alphard.campusinfoapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.alphard.campusinfoapp.databinding.FragmentAnnouncementDetailBinding

class AnnouncementDetailFragment : Fragment(R.layout.fragment_announcement_detail) {
    private var _binding: FragmentAnnouncementDetailBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAnnouncementDetailBinding.bind(view)

        val id = arguments?.getInt("announcementId") ?: 0

        binding.tvDetailTitle.text = "Detail Pengumuman ID: $id"
        binding.tvDetailDescription.text = "Isi pengumuman lengkap untuk ID $id akan ditampilkan di sini."
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}