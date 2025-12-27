// Automatically generated - do not modify!

package electron.core

sealed external interface PowerSaveBlockerStartType {
    companion object {
        @seskar.js.JsValue("prevent-app-suspension")
        val preventAppSuspension: PowerSaveBlockerStartType

        @seskar.js.JsValue("prevent-display-sleep")
        val preventDisplaySleep: PowerSaveBlockerStartType
    }
}
