// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ModuleDetectionKind {
    companion object {
        /**
         * Files with imports, exports and/or import.meta are considered modules
         */
        @JsIntValue(1)
        val Legacy: ModuleDetectionKind

        /**
         * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
         */
        @JsIntValue(2)
        val Auto: ModuleDetectionKind

        /**
         * Consider all non-declaration files modules, regardless of present syntax
         */
        @JsIntValue(3)
        val Force: ModuleDetectionKind
    }
}
