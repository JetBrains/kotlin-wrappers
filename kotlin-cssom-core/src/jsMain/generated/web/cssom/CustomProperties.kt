// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsNativeGetter
import seskar.js.JsNativeSetter

external interface CustomProperties {
    @JsNativeGetter
    operator fun <T : Any> get(
        name: CustomPropertyName<T>,
    ): T?

    @JsNativeSetter
    operator fun <T : Any> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
