// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface DisplayTouchSupport {
    companion object {
        @seskar.js.JsValue("available")
        val available: DisplayTouchSupport

        @seskar.js.JsValue("unavailable")
        val unavailable: DisplayTouchSupport

        @seskar.js.JsValue("unknown")
        val unknown: DisplayTouchSupport
    }
}
