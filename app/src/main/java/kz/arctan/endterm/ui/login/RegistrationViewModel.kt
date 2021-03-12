package kz.arctan.endterm.ui.login

import androidx.lifecycle.ViewModel
import java.util.regex.Pattern

class RegistrationViewModel : ViewModel() {
    var username: String = ""
    var firstName: String = ""
    var lastName: String = ""
    var password: String = ""


    // A placeholder password validation check
    private fun isPasswordValid(): Boolean {
        val regex =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$"
        val pattern = Pattern.compile(regex)
        val matcher = pattern.matcher(password)
        return password.length > 8 && matcher.matches()
    }
}