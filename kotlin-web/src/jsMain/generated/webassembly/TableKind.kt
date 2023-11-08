// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webassembly

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TableKind {
    companion object {
        @JsValue("anyfunc")
        val anyfunc: TableKind

        @JsValue("externref")
        val externref: TableKind
    }
}
