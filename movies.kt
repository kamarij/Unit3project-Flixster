package com.example.project3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class movies {

    /*
    constructing the view
    * */

//    RecyclerView.Adapter<movies.ViewHolder>() {

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).

//        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//            val title: TextView
//            val img: ImageView
//            val overview: TextView
//
//            init {
//                // Define click listener for the ViewHolder's View.
//                title = view.findViewById(R.id.title)
//                img = view.findViewById(R.id.img)
//                overview = view.findViewById(R.id.overview)
//            }
//        }
//        **/

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.activity_main, viewGroup, false)

            return ViewHolder(view)
        }

        /*
        * updates the recyclerView adapter with new data. this is where the
        * networking magic happens
        * */
    /*
    * what happens when a particular movie is clicked
    * */
}