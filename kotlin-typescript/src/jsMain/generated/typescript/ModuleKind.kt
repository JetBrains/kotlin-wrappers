// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ModuleKind {
    companion object {
        @JsIntValue(0)
        val None: ModuleKind

        @JsIntValue(1)
        val CommonJS: ModuleKind

        @JsIntValue(2)
        val AMD: ModuleKind

        @JsIntValue(3)
        val UMD: ModuleKind

        @JsIntValue(4)
        val System: ModuleKind

        @JsIntValue(5)
        val ES2015: ModuleKind

        @JsIntValue(6)
        val ES2020: ModuleKind

        @JsIntValue(7)
        val ES2022: ModuleKind

        @JsIntValue(99)
        val ESNext: ModuleKind

        @JsIntValue(100)
        val Node16: ModuleKind

        @JsIntValue(199)
        val NodeNext: ModuleKind
    }
}
