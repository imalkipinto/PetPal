package com.petpal.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    
    private val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        handleException(exception)
    }
    
    protected fun launchSafely(block: suspend () -> Unit) {
        viewModelScope.launch(exceptionHandler) {
            block()
        }
    }
    
    protected open fun handleException(exception: Throwable) {
        // Handle exceptions here - log, show error messages, etc.
        exception.printStackTrace()
    }
}