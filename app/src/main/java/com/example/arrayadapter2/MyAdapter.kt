package com.example.arrayadapter2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(itemImages: List<Int>, itemNames: List<String>, itemEmails: List<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val images: List<Int>
    private val names: List<String>
    private val emails: List<String>


    // Provide a suitable constructor (depends on the kind of dataset)
    init {
        images = itemImages
        names = itemNames
        emails = itemEmails
    }


    // Provide a reference to the views for each data item
    // COmplex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // each data item is just a string in this case
        val imageView: ImageView
        val textView: TextView
        val emailView: TextView

        init {
            imageView = view.findViewById(R.id.image_view)
            textView = view.findViewById(R.id.text_view)
            emailView = view.findViewById(R.id.email_view)
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create anew view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false)

        // set the view's size, margins, paddings and layout parameters

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.imageView.setImageResource(images[position])
        holder.textView.setText(names[position])
        holder.emailView.setText(emails[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return names.count()
    }

}