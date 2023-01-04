package com.ferrero.appla.fraggg2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.ferrero.appla.databinding.FragmentGamyyyBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlin.random.Random


class GamyyyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGamyyyBinding = FragmentGamyyyBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentGamyyyBinding: FragmentGamyyyBinding? = null
    private val binding get() = fragmentGamyyyBinding ?: throw RuntimeException("FragmentGamyyyBinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                val num = Random.nextInt(from = 100, until = 1000)
                Toast.makeText(requireContext(), "Earned $num points", Toast.LENGTH_SHORT).show()
                delay(3000)
                requireActivity().onBackPressed()
            }

        } catch (e: Exception){
            efrfrgtgttg5()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentGamyyyBinding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Oops something bad, please try again...",
            Toast.LENGTH_SHORT
        ).show()
        requireActivity().onBackPressed()
    }
}