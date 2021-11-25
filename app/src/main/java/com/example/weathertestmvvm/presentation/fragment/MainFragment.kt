package com.example.weathertestmvvm.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weathertestmvvm.R
import com.example.weathertestmvvm.databinding.FragmentMainBinding
import com.example.weathertestmvvm.presentation.MainViewModel

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding
        get() = _binding!!

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.testVM.observe(viewLifecycleOwner, Observer{
            binding.mainTextView.text = it
        })

        binding.mainButton.setOnClickListener {
            viewModel.changeData()
            Toast.makeText(context, viewModel.testVM.value, Toast.LENGTH_SHORT).show()
        }
    }

}