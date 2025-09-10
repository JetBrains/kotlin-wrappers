package web.css.painting

import js.array.ReadonlyArray
import js.core.JsString
import js.reflect.JsClass
import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi
import kotlin.js.JsAny

@ExperimentalWebApi
open class PaintReference
protected constructor(
    val value: JsClass<Paint>,
    inputProperties: ReadonlyArray<JsAny /* PropertyName<*> | CustomPropertyName<*> */>? = null,
    inputArguments: ReadonlyArray<JsString>? = null,
    contextOptions: PaintRenderingContext2DSettings? = null,
) {
    init {
        val static = unsafeCast<PaintStatic>(value)

        if (inputProperties != null) {
            static.inputProperties = inputProperties
        }

        if (inputArguments != null) {
            static.inputArguments = inputArguments
        }

        if (contextOptions != null) {
            static.contextOptions = contextOptions
        }
    }
}
