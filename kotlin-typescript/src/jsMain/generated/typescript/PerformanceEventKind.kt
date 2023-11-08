// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PerformanceEventKind {
    companion object {
        @JsValue("UpdateGraph")
        val UpdateGraph: PerformanceEventKind

        @JsValue("CreatePackageJsonAutoImportProvider")
        val CreatePackageJsonAutoImportProvider: PerformanceEventKind
    }
}
