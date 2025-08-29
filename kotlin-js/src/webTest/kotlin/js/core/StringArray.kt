package js.core

import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("Array")
external class StringArray(
    a: String = definedExternally,
    b: String = definedExternally,
    c: String = definedExternally,
    d: String = definedExternally,
) {

    val length: Int
}
