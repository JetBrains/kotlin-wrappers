// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface PowerMonitorGetSystemIdleStateResult

inline val PowerMonitorGetSystemIdleStateResult.Companion.active: PowerMonitorGetSystemIdleStateResult
    get() = js.reflect.unsafeCast("active")

inline val PowerMonitorGetSystemIdleStateResult.Companion.idle: PowerMonitorGetSystemIdleStateResult
    get() = js.reflect.unsafeCast("idle")

inline val PowerMonitorGetSystemIdleStateResult.Companion.locked: PowerMonitorGetSystemIdleStateResult
    get() = js.reflect.unsafeCast("locked")

inline val PowerMonitorGetSystemIdleStateResult.Companion.unknown: PowerMonitorGetSystemIdleStateResult
    get() = js.reflect.unsafeCast("unknown")
