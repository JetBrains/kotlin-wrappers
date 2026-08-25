// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface PowerMonitorGetCurrentThermalStateResult

inline val PowerMonitorGetCurrentThermalStateResult.Companion.unknown: PowerMonitorGetCurrentThermalStateResult
    get() = js.reflect.unsafeCast("unknown")

inline val PowerMonitorGetCurrentThermalStateResult.Companion.nominal: PowerMonitorGetCurrentThermalStateResult
    get() = js.reflect.unsafeCast("nominal")

inline val PowerMonitorGetCurrentThermalStateResult.Companion.fair: PowerMonitorGetCurrentThermalStateResult
    get() = js.reflect.unsafeCast("fair")

inline val PowerMonitorGetCurrentThermalStateResult.Companion.serious: PowerMonitorGetCurrentThermalStateResult
    get() = js.reflect.unsafeCast("serious")

inline val PowerMonitorGetCurrentThermalStateResult.Companion.critical: PowerMonitorGetCurrentThermalStateResult
    get() = js.reflect.unsafeCast("critical")
