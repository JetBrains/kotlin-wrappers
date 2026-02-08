// Automatically generated - do not modify!

package electron.core

sealed external interface ProxyConfigMode {
    companion object
}

inline val ProxyConfigMode.Companion.direct: ProxyConfigMode
    get() = js.reflect.unsafeCast("direct")

inline val ProxyConfigMode.Companion.auto_detect: ProxyConfigMode
    get() = js.reflect.unsafeCast("auto_detect")

inline val ProxyConfigMode.Companion.pac_script: ProxyConfigMode
    get() = js.reflect.unsafeCast("pac_script")

inline val ProxyConfigMode.Companion.fixed_servers: ProxyConfigMode
    get() = js.reflect.unsafeCast("fixed_servers")

inline val ProxyConfigMode.Companion.system: ProxyConfigMode
    get() = js.reflect.unsafeCast("system")
