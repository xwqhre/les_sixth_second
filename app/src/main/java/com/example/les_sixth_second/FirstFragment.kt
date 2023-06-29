package com.example.les_sixth_second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.les_sixth_second.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {
    override fun inlateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding {

        return FragmentFirstBinding.inflate(inflater, container, false)
    }


    override fun initClick() {
        super.initClick()

        binding.btn.setOnClickListener {
            val text = binding.editText.text.toString()
            val secondFragment = SecondFragment()
            val bundle = Bundle().apply {
                putString("key", text)
            }
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.container, secondFragment).addToBackStack(null).commit()
        }
    }
}

