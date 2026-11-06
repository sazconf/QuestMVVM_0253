package com.example.mvvm.view.uicontroller

import androidx.navigation.NavHostController

enum class Navigasi {
    Formulir,
    Detail
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
) {
    navController.popBackStack(Navigasi.Formulir.name, inclusive = false)
}
