// Automatically generated - do not modify!

package electron.core

sealed external interface ProxyConfigMode {
    companion object {
        @seskar.js.JsValue("direct")
        val direct: ProxyConfigMode

        @seskar.js.JsValue("auto_detect")
        val auto_detect: ProxyConfigMode

        @seskar.js.JsValue("pac_script")
        val pac_script: ProxyConfigMode

        @seskar.js.JsValue("fixed_servers")
        val fixed_servers: ProxyConfigMode

        @seskar.js.JsValue("system")
        val system: ProxyConfigMode
    }
}
