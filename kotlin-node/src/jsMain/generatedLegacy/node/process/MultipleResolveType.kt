// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.process

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MultipleResolveType {
    companion object {
        @JsValue("resolve")
        val resolve: MultipleResolveType

        @JsValue("reject")
        val reject: MultipleResolveType
    }
}
