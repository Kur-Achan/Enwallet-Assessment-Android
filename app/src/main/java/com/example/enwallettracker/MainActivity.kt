package com.example.enwallettracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallettracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager=LinearLayoutManager(this)
        displayExpenses()

    }
    fun displayExpenses(){
        val expenses1 = expenses("", "Salary", "1st July","KES 42000")
        val expenses2 = expenses("", "Salary", "1st July","KES 42000")
        val expenses3 = expenses("", "Salary", "1st July","KES 42000")
        val expenses4 = expenses("", "Salary", "1st July","KES 42000")
        val expenses5 = expenses("", "Salary", "1st July","KES 42000")
        val expenses6 = expenses("", "Salary", "1st July","KES 42000")
        val expenses7 = expenses("", "Salary", "1st July","KES 42000")
        val expenses8 = expenses("", "Salary", "1st July","KES 42000")
        val expenses9 = expenses("", "Salary", "1st July","KES 42000")


        val expensesList = listOf(expenses1, expenses2, expenses3, expenses4, expenses5, expenses6, expenses7, expenses8,expenses9)
        val expensesAdapter = ExpensesAdapter(expensesList)
        binding.rvWallet.adapter=expensesAdapter

    }
}



