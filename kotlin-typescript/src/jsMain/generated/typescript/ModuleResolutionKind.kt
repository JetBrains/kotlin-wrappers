// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ModuleResolutionKind {
    companion object {
        @JsIntValue(1)
        val Classic: ModuleResolutionKind

        @JsIntValue(2)
        val Node10: ModuleResolutionKind

        @JsIntValue(3)
        val Node16: ModuleResolutionKind

        @JsIntValue(99)
        val NodeNext: ModuleResolutionKind

        @JsIntValue(100)
        val Bundler: ModuleResolutionKind
    }
}
