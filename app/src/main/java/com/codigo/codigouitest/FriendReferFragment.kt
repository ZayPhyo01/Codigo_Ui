package com.codigo.codigouitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FriendReferFragment : Fragment() {


    companion object {
        fun newInstance(): FriendReferFragment {
            return FriendReferFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_refer_friend , container , false)
    }
}