// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface PowerMonitorGetSystemIdleStateResult {
    companion object {
        @seskar.js.JsValue("active")
        val active: PowerMonitorGetSystemIdleStateResult

        @seskar.js.JsValue("idle")
        val idle: PowerMonitorGetSystemIdleStateResult

        @seskar.js.JsValue("locked")
        val locked: PowerMonitorGetSystemIdleStateResult

        @seskar.js.JsValue("unknown")
        val unknown: PowerMonitorGetSystemIdleStateResult
    }
}
