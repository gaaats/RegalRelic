package com.ferrero.appla.fraag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.ferrero.appla.R
import com.ferrero.appla.databinding.FragmentStartyBinding
import com.ferrero.appla.gaaame.GameTask
import com.ferrero.appla.gaaame.GameViev


class StartyFragment : Fragment(), GameTask {


    val intList = listOf(
        R.drawable.ee1,
        R.drawable.ee2,
    )

    private var fragmentStartyBinding: FragmentStartyBinding? = null
    private val startyBinding get() = fragmentStartyBinding ?: throw RuntimeException("FragmentStartyBinding = null")

    private var gameViev: GameViev? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStartyBinding = FragmentStartyBinding.inflate(inflater, container, false)
        return startyBinding.root
    }



    override fun onDestroy() {
        fragmentStartyBinding = null
        super.onDestroy()
    }

    override fun clclcllcgimi(score: Int) {
        val jujuujuj = "Score : $score"
        startyBinding.root.removeView(gameViev)
        startyBinding.tvScoreGame1.text = jujuujuj
        startyBinding.btnStart.visibility = View.VISIBLE
        gtjgtjigtjigt()
        gameViev = null

        gtkgtkgkogtk()
    }

    private fun gtjgtjigtjigt() {
        startyBinding.tvScoreGame1.visibility = View.VISIBLE
        startyBinding.imgLogoGame1.visibility = View.VISIBLE
    }

    private fun gtkgtkgkogtk() {
        findNavController().navigate(R.id.action_startyFragment_to_gamyyyFragment)
    }

    private fun eepepepep() {
        Toast.makeText(
            requireContext(),
            "Oops error, please try again...",
            Toast.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {
            startyBinding.btnStart.setOnClickListener {
                gameViev =
                    GameViev(requireContext(), this, R.drawable.person, intList)
                gameViev!!.setBackgroundResource(R.drawable.baaaaakkkaa)
                gameViev!!.background.alpha = 230
                startyBinding.root.addView(gameViev)
                startyBinding.btnStart.visibility = View.GONE
                gtkktgtk()
            }
        } catch (e: Exception) {
            eepepepep()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtkktgtk() {
        startyBinding.tvScoreGame1.visibility = View.GONE
        startyBinding.imgLogoGame1.visibility = View.GONE
    }

}