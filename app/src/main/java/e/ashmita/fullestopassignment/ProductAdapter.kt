package e.ashmita.fullestopassignment

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import e.ashmita.fullestopassignment.databinding.ProductListingItemBinding


class ProductAdapter(val list: ArrayList<Product>, val context: Context) :
    RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            ProductListingItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(list.get(position).productImage)
            .placeholder(R.drawable.ic_launcher_background).into(holder.product_Image)
        holder.product_name.text = list[position].productName
        holder.product_price.text = list[position].productPrice
        holder.count.text = list[position].quantity.toString()

        holder.add_btn.setOnClickListener {
            val item = list[position]
            item.quantity = item.quantity?.plus(1)
            list[position] = item
            notifyDataSetChanged()
        }

        holder.remove_btn.setOnClickListener {
            val item = list[position]
            item.quantity?.let {
                if (it > 1) {
                    item.quantity = item.quantity?.minus(1)
                    list[position] = item
                    notifyDataSetChanged()
                }
            }


        }


    }

    class MyViewHolder(view: ProductListingItemBinding) : RecyclerView.ViewHolder(view.root) {
        val product_Image = view.productImage
        val product_name = view.productName
        val product_price = view.productQty
        val add_btn = view.plusbtn
        val remove_btn = view.minusbtn
        val count = view.quantity


    }
}