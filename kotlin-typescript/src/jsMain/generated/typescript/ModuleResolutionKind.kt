// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ModuleResolutionKind {
    companion object {
        @JsIntValue(1)
        val Classic: ModuleResolutionKind

        @JsIntValue(2)
        val NodeJs: ModuleResolutionKind

        @JsIntValue(3)
        val Node16: ModuleResolutionKind

        @JsIntValue(99)
        val NodeNext: ModuleResolutionKind
    }
}
