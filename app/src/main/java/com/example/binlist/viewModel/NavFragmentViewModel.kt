package viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class NavFragmentViewModel : ViewModel() {
    private val _numberState = MutableStateFlow("")
    var numberState: StateFlow<String> = _numberState

    fun setNumber(number: Int) {
        _numberState.value = number.toString()
    }
}