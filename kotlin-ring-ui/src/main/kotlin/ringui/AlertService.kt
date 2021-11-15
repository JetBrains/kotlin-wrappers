@file:JsModule("@jetbrains/ring-ui/components/alert-service/alert-service")
@file:JsNonModule

package ringui

import kotlinext.js.ReadonlyArray
import react.Key
import react.ReactNode

@JsName("default")
external object AlertService {
    fun remove(key: Key)
    fun removeWithoutAnimation(key: Key)
    fun addAlert(
        message: String,
        type: AlertType,
        timeout: Int = definedExternally,
        options: AlertProps = definedExternally
    ): Key

    fun addAlert(
        message: ReadonlyArray<ReactNode>,
        type: AlertType,
        timeout: Int = definedExternally,
        options: AlertProps = definedExternally
    ): Key

    fun error(message: String, timeout: Int): Key
    fun error(message: ReadonlyArray<ReactNode>, timeout: Int): Key
    fun message(message: String, timeout: Int): Key
    fun message(message: ReadonlyArray<ReactNode>, timeout: Int): Key
    fun warning(message: String, timeout: Int): Key
    fun warning(message: ReadonlyArray<ReactNode>, timeout: Int): Key
    fun successMessage(message: String, timeout: Int): Key
    fun successMessage(message: ReadonlyArray<ReactNode>, timeout: Int): Key
    fun loadingMessage(message: String, timeout: Int): Key
    fun loadingMessage(message: ReadonlyArray<ReactNode>, timeout: Int): Key
}
