// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface IncludePackageJsonAutoImports {
    companion object {
        @JsValue("auto")
        val auto: IncludePackageJsonAutoImports

        @JsValue("on")
        val on: IncludePackageJsonAutoImports

        @JsValue("off")
        val off: IncludePackageJsonAutoImports
    }
}
