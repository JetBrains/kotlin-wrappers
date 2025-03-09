// Automatically generated - do not modify!

package web.cssom

import js.core.JsAny
import seskar.js.JsNativeGetter
import seskar.js.JsNativeSetter

external interface CustomProperties {
    @JsNativeGetter
    operator fun <T : JsAny> get(
        name: CustomPropertyName<T>,
    ): T?

    @JsNativeSetter
    operator fun <T : JsAny> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
