package com.example.celciuswarehouse.domain.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>: Fragment() {

    protected lateinit var viewModel: VM
    //binding
    private var _binding : VB? = null

    protected val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = bindingInflater.invoke(inflater,container,false)
        viewModel =provideViewModel()

        return requireNotNull(_binding).root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    abstract fun provideViewModel():VM

    abstract fun setupView(binding:VB)

    abstract fun setonClickListener()

    abstract fun observeViewModel()

    abstract  val bindingInflater: (LayoutInflater,ViewGroup?,Boolean) -> VB


}