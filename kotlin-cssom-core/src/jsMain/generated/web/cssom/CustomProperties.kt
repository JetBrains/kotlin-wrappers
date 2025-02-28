// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsNativeInvoke

external interface CustomProperties {
    @JsNativeInvoke
    operator fun <T : Any> get(
        name: CustomPropertyName<T>,
    ): T?

    @JsNativeInvoke
    operator fun <T : Any> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
