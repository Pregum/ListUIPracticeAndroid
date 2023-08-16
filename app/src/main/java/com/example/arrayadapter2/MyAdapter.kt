package com.example.arrayadapter2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(dataSet: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val localDataSet: List<String>

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet List<String> containing the data to populate views to be used
     * by REcyclerView.
     */
    init {
        localDataSet = dataSet
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var _textView: TextView

        init {
            _textView = view.findViewById(R.id.text_view)
        }

        val textView: TextView
            get() { return _textView }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.textView.setText(localDataSet[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return localDataSet.count()
    }

}