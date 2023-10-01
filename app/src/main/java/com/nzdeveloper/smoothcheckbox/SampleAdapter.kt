package com.nzdeveloper.smoothcheckbox

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nzdeveloper.smoothcheckbox.databinding.ItemBinding
import com.nzdeveloper.smoothcheckboxlibrary.SmoothCheckBox

class SampleAdapter(private var data: ArrayList<Bean>) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {


    private lateinit var context:Context
    inner class ViewHolder(val itemBinding: ItemBinding): RecyclerView.ViewHolder(itemBinding.root)  {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val from = LayoutInflater.from(parent.context)
        val itemBinding = ItemBinding.inflate(from,parent, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = data[position]
        holder.itemBinding.tv.text = String.format(context.getString(R.string.string_item_subffix) + position)
        holder.itemBinding.scb.setChecked(bean.isChecked)
        holder.itemBinding.scb.setOnCheckedChangeListener(object : SmoothCheckBox.OnCheckedChangeListener{
            override fun onCheckedChanged(checkBox: SmoothCheckBox?, isChecked: Boolean) {
                bean.isChecked = isChecked
            }
        })

        holder.itemView.setOnClickListener {
            bean.isChecked = !bean.isChecked
            holder.itemBinding.scb.setChecked(bean.isChecked, true)
        }


    }
}