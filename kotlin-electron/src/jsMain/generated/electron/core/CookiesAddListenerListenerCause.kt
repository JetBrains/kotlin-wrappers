// Generated by Karakum - do not modify it manually!

package electron.core


@seskar.js.JsVirtual
sealed external interface CookiesAddListenerListenerCause {
    companion object {
        @seskar.js.JsValue("explicit")
        val explicit: CookiesAddListenerListenerCause

        @seskar.js.JsValue("overwrite")
        val overwrite: CookiesAddListenerListenerCause

        @seskar.js.JsValue("expired")
        val expired: CookiesAddListenerListenerCause

        @seskar.js.JsValue("evicted")
        val evicted: CookiesAddListenerListenerCause

        @seskar.js.JsValue("expired-overwrite")
        val expiredOverwrite: CookiesAddListenerListenerCause
    }
}
