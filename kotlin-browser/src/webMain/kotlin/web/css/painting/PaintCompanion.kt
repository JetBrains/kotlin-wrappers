package web.css.painting

import js.array.ReadonlyArray
import js.core.JsString
import web.cssom.CustomPropertyName
import kotlin.js.definedExternally

external interface PaintCompanion {
    val inputProperties: ReadonlyArray<CustomPropertyName<*>>?
        get() = definedExternally

    val inputArguments: ReadonlyArray<JsString>?
        get() = definedExternally

    val contextOptions: PaintRenderingContext2DSettings?
        get() = definedExternally
}
