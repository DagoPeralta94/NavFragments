package com.example.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navcomponents.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    val args: SecondFragmentArgs by navArgs()
    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = args.name
        binding.txtName.text = name

        binding.btNav2.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
            onDestroyView()
        }
    }

}