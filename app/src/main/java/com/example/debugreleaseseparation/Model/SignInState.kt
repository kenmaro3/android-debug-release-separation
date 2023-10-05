package com.example.debugreleaseseparation.Model

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)