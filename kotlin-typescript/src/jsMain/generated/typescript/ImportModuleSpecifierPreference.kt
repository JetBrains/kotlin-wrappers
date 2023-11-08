// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ImportModuleSpecifierPreference {
    companion object {
        @JsValue("shortest")
        val shortest: ImportModuleSpecifierPreference

        @JsValue("project-relative")
        val projectRelative: ImportModuleSpecifierPreference

        @JsValue("relative")
        val relative: ImportModuleSpecifierPreference

        @JsValue("non-relative")
        val nonRelative: ImportModuleSpecifierPreference
    }
}
