// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface PowerSaveBlockerStartType

inline val PowerSaveBlockerStartType.Companion.preventAppSuspension: PowerSaveBlockerStartType
    get() = js.reflect.unsafeCast("prevent-app-suspension")

inline val PowerSaveBlockerStartType.Companion.preventDisplaySleep: PowerSaveBlockerStartType
    get() = js.reflect.unsafeCast("prevent-display-sleep")
