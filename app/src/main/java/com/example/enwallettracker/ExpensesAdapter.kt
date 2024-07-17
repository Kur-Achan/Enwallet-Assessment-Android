package com.example.enwallettracker


import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView


class ExpensesAdapter (var expenseList: List<expenses>):RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.wallet_item, parent, false)
        return ExpensesViewHolder((itemView))

    }
    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.tvMoney.text = expense.Money
        holder.tvSalary.text = expense.Salary
        holder.tvDate.text = expense.date


    }
    override fun getItemCount(): Int {
        return expenseList.size
    }
}
class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvMoney = itemView.findViewById<TextView>(R.id.tvMoney)
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)


}