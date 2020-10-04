package com.pecpaker.retrofittestapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pecpaker.retrofittestapi.repository.Repository
import com.pecpaker.retrofittestapi.viewModel.LatumViewModel
import com.pecpaker.retrofittestapi.viewModel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: LatumViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository =  Repository()

        val viewModelFactory =  ViewModelFactory(repository)

        viewModel = ViewModelProvider(this, viewModelFactory).get(LatumViewModel::class.java)
        viewModel.getLatum()

        //observer
        viewModel.myResponse.observe(this, Observer {
            res -> Log.d("Title", res.title.toString())
        })


    }
}