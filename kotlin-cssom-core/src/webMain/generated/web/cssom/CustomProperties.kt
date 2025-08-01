// Automatically generated - do not modify!

package web.cssom

import js.core.JsAny

external interface CustomProperties {
    operator fun <T : JsAny> get(
        name: CustomPropertyName<T>,
    ): T?

    operator fun <T : JsAny> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
