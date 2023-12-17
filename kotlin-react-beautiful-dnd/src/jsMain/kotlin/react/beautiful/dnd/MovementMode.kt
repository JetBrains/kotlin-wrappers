@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

import seskar.js.JsValue
import seskar.js.JsVirtual

// There are two seperate modes that a drag can be in
// FLUID: everything is done in response to highly granular input (eg mouse)
// SNAP: items move in response to commands (eg keyboard);
@JsVirtual
sealed external interface MovementMode {
    companion object {
        @JsValue("FLUID")
        val FLUID: MovementMode

        @JsValue("SNAP")
        val SNAP: MovementMode
    }
}
