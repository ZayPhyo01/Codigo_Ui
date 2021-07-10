package com.codigo.codigouitest.adapter

import android.content.Context
import android.view.ViewGroup
import com.codigo.codigouitest.R
import com.codigo.codigouitest.BaseRecyclerAdapter
import com.codigo.codigouitest.BaseViewHolder
import com.codigo.codigouitest.viewholders.SearchResultCarsViewHolder
import com.codigo.codigouitest.viewholders.SearchResultMenuViewHolder
import com.codigo.codigouitest.vo.SearchResultHomeVO

class SearchResultAdapter(c: Context) :
    BaseRecyclerAdapter<SearchResultHomeVO, BaseViewHolder<SearchResultHomeVO>>(c) {
    companion object {
        val VIEW_TYPE_MENUS = 1
        val VIEW_TYPE_CARS = 2
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<SearchResultHomeVO> {
        if (viewType == VIEW_TYPE_MENUS) {
            val view = inflater.inflate(R.layout.item_view_search_result_menus, parent, false)
            return SearchResultMenuViewHolder(view)
        } else {
            val view = inflater.inflate(R.layout.item_view_car_lists, parent, false)
            return SearchResultCarsViewHolder(view)
        }
    }

    override fun getItemViewType(position: Int): Int {

        return if (dataList!!.get(position) is SearchResultHomeVO.Menu) {
            VIEW_TYPE_MENUS
        } else {
            VIEW_TYPE_CARS
        }

    }
}