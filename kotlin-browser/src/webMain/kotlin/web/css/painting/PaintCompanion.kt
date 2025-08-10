package web.css.painting

import js.array.ReadonlyArray
import js.core.JsString
import web.cssom.CustomPropertyName
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

@ExperimentalWebApi
external interface PaintCompanion {
    val inputProperties: ReadonlyArray<CustomPropertyName<*>>?
        get() = definedExternally

    val inputArguments: ReadonlyArray<JsString>?
        get() = definedExternally

    val contextOptions: PaintRenderingContext2DSettings?
        get() = definedExternally
}
