// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ConfigMinVersion {
    companion object {
        @seskar.js.JsValue("tls1")
        val tls1: ConfigMinVersion

        @seskar.js.JsValue("tls1.1")
        val tls11: ConfigMinVersion

        @seskar.js.JsValue("tls1.2")
        val tls12: ConfigMinVersion

        @seskar.js.JsValue("tls1.3")
        val tls13: ConfigMinVersion
    }
}
