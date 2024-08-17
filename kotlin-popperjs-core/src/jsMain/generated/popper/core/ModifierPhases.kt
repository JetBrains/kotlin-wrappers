// Automatically generated - do not modify!

package popper.core

import seskar.js.JsValue

sealed external interface ModifierPhases {
    companion object {
        @JsValue("beforeRead")
        val beforeRead: ModifierPhases

        @JsValue("read")
        val read: ModifierPhases

        @JsValue("afterRead")
        val afterRead: ModifierPhases

        @JsValue("beforeMain")
        val beforeMain: ModifierPhases

        @JsValue("main")
        val main: ModifierPhases

        @JsValue("afterMain")
        val afterMain: ModifierPhases

        @JsValue("beforeWrite")
        val beforeWrite: ModifierPhases

        @JsValue("write")
        val write: ModifierPhases

        @JsValue("afterWrite")
        val afterWrite: ModifierPhases
    }
}
