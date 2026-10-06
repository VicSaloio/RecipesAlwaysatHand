package br.com.fiap.alwaysathand.navigation

sealed class Destination(val route: String) {

    object InitialScreen: Destination(route = "initial")
    object SignupScreen: Destination(route = "signup")


    object HomeScreen: Destination(route = "home/{email}"){
        fun creatRoutes(email: String): String {
            return "home/$email"
        }
    }


    object LoginScreen: Destination(route = "login")

}