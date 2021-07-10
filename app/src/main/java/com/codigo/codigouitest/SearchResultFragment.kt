package com.codigo.codigouitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codigo.codigouitest.adapter.SearchResultAdapter
import com.codigo.codigouitest.vo.SearchResultHomeVO
import kotlinx.android.synthetic.main.fragment_search_results.*

class SearchResultFragment : Fragment() {

    lateinit var adapter: SearchResultAdapter

    companion object {
        fun newInstance(): Fragment {
            return SearchResultFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = SearchResultAdapter(requireContext())
        rvSearchCars.adapter = adapter
        adapter.addNewDataList(listOf(
            SearchResultHomeVO.Menu(),
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
            SearchResultHomeVO.Cars() ,
        ))

    }
}