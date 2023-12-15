// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package node.vm

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ModuleStatus {
    companion object {
        @JsValue("unlinked")
        val unlinked: ModuleStatus

        @JsValue("linking")
        val linking: ModuleStatus

        @JsValue("linked")
        val linked: ModuleStatus

        @JsValue("evaluating")
        val evaluating: ModuleStatus

        @JsValue("evaluated")
        val evaluated: ModuleStatus

        @JsValue("errored")
        val errored: ModuleStatus
    }
}
