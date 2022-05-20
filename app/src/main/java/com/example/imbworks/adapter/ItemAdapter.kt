package com.example.imbworks.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.imbworks.R
import androidx.recyclerview.widget.RecyclerView
import com.example.imbworks.model.Affirmation
import com.example.imbworks.ui.gallery.GalleryFragment

class ItemAdapter(
    private val context: GalleryFragment,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // 리사이클러 뷰의 새로운 뷰 홀더를 만들기 위해 레이아웃 관리자가 호출하는 함수
        // 재사용할 수 있는 기존 뷰 홀더가 없는 경우, 뷰 홀더는 단일 목록 항목 뷰를 나타냄

        // parent
        // 새 목록 항목 뷰가 하위 요소로 사용되어 연뎔되는 뷰 그룹, 상위요소는 리사이클러뷰

        // viewType
        // 동일한 리사이클러 뷰에 뷰 유형이 여러개 있는 경우 중요함

        // context에서 레이아웃 인스턴스를 가져옴
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // 목록 항목 뷰의 콘텐츠를 바꾸기 위해 레이아웃 관리자가 호출하는 함수
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)

    }

//    override fun getItemCount(): Int {
//        return dataset.size
//    }
    override fun getItemCount() = dataset.size
}