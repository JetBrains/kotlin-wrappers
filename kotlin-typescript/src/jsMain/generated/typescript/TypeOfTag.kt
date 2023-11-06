// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TypeOfTag {
    companion object {
        @JsValue("undefined")
        val undefined: TypeOfTag

        @JsValue("number")
        val number: TypeOfTag

        @JsValue("bigint")
        val bigint: TypeOfTag

        @JsValue("boolean")
        val boolean: TypeOfTag

        @JsValue("string")
        val string: TypeOfTag

        @JsValue("symbol")
        val symbol: TypeOfTag

        @JsValue("object")
        val `object`: TypeOfTag

        @JsValue("function")
        val function: TypeOfTag
    }
}
