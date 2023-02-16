package com.example.binlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.binlist.databinding.FragmentNavBinding
import viewModel.NavFragmentViewModel


class NavFragment : Fragment() {
    private var _binding: FragmentNavBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: NavFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNavBinding.inflate(inflater, container, false)

        binding.history.setOnClickListener {
            findNavController().navigate(R.id.action_navFragment_to_navFragment2)

            var numberInt = binding.number.text.toString().toInt()
        }
        return binding.root
    }

}

class NavFragmenViewModel {

}
