// Generated by Karakum - do not modify it manually!

package electron.core


@seskar.js.JsVirtual
sealed external interface SystemPreferencesGetMediaAccessStatusResult {
    companion object {
        @seskar.js.JsValue("not-determined")
        val notDetermined: SystemPreferencesGetMediaAccessStatusResult

        @seskar.js.JsValue("granted")
        val granted: SystemPreferencesGetMediaAccessStatusResult

        @seskar.js.JsValue("denied")
        val denied: SystemPreferencesGetMediaAccessStatusResult

        @seskar.js.JsValue("restricted")
        val restricted: SystemPreferencesGetMediaAccessStatusResult

        @seskar.js.JsValue("unknown")
        val unknown: SystemPreferencesGetMediaAccessStatusResult
    }
}
