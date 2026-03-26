package com.alphard.campusinfoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alphard.campusinfoapp.databinding.ItemAnnouncementBinding

class AnnouncementAdapter(private val onClick: (Announcement) -> Unit) :
    ListAdapter<Announcement, AnnouncementAdapter.AnnouncementViewHolder>(DiffCallback) {

    class AnnouncementViewHolder(private val binding: ItemAnnouncementBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(announcement: Announcement, onClick: (Announcement) -> Unit) {
            binding.apply {
                tvTitle.text = announcement.title
                tvDate.text = announcement.date
                tvCategory.text = announcement.category
                root.setOnClickListener { onClick(announcement) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnouncementViewHolder {
        val binding = ItemAnnouncementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnnouncementViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnnouncementViewHolder, position: Int) {
        holder.bind(getItem(position), onClick)
    }

    object DiffCallback : DiffUtil.ItemCallback<Announcement>() {
        override fun areItemsTheSame(oldItem: Announcement, newItem: Announcement) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Announcement, newItem: Announcement) = oldItem == newItem
    }
}