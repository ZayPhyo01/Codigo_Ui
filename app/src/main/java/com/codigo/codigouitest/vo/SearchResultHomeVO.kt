package com.codigo.codigouitest.vo

sealed class SearchResultHomeVO {
    data class Menu(val id: Int = 1) : SearchResultHomeVO()

    data class Cars(val id: Int = 1) : SearchResultHomeVO()
}