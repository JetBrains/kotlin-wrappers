@file:JsModule("@jetbrains/ring-ui/components/alert-service/alert-service")
@file:JsNonModule

package ringui

import react.ReactNode

external interface AlertServiceInterface {
    fun remove(key: String)
    fun removeWithoutAnimation(key: String)
    fun addAlert(
        message: String,
        type: AlertType,
        timeout: Int = definedExternally,
        options: AlertProps = definedExternally
    ): String

    fun addAlert(
        message: Array<out ReactNode>,
        type: AlertType,
        timeout: Int = definedExternally,
        options: AlertProps = definedExternally
    ): String

    fun error(message: String, timeout: Int): String
    fun error(message: Array<out ReactNode>, timeout: Int): String
    fun message(message: String, timeout: Int): String
    fun message(message: Array<out ReactNode>, timeout: Int): String
    fun warning(message: String, timeout: Int): String
    fun warning(message: Array<out ReactNode>, timeout: Int): String
    fun successMessage(message: String, timeout: Int): String
    fun successMessage(message: Array<out ReactNode>, timeout: Int): String
    fun loadingMessage(message: String, timeout: Int): String
    fun loadingMessage(message: Array<out ReactNode>, timeout: Int): String
}

@JsName("default")
external val AlertService: AlertServiceInterface = definedExternally
