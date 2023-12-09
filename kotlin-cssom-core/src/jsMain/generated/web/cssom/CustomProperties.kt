// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsNative

external interface CustomProperties {
    @JsNative
    operator fun <T : Any> get(
        name: CustomPropertyName<T>,
    ): T?

    @JsNative
    operator fun <T : Any> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
