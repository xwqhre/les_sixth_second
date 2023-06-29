package com.example.les_sixth_second

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.les_sixth_second.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override fun inlateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater, container, false)
    }

    override fun initClick() {
        super.initClick()

        val result = arguments?.getString("key")
        binding.tittle.text = result

    }
}