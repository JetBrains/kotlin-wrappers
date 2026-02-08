// Automatically generated - do not modify!

package electron.core

sealed external interface ProcessMetricType {
    companion object
}

inline val ProcessMetricType.Companion.Browser: ProcessMetricType
    get() = js.reflect.unsafeCast("Browser")

inline val ProcessMetricType.Companion.Tab: ProcessMetricType
    get() = js.reflect.unsafeCast("Tab")

inline val ProcessMetricType.Companion.Utility: ProcessMetricType
    get() = js.reflect.unsafeCast("Utility")

inline val ProcessMetricType.Companion.Zygote: ProcessMetricType
    get() = js.reflect.unsafeCast("Zygote")

inline val ProcessMetricType.Companion.`Sandbox helper`: ProcessMetricType
    get() = js.reflect.unsafeCast("Sandbox helper")

inline val ProcessMetricType.Companion.GPU: ProcessMetricType
    get() = js.reflect.unsafeCast("GPU")

inline val ProcessMetricType.Companion.`Pepper Plugin`: ProcessMetricType
    get() = js.reflect.unsafeCast("Pepper Plugin")

inline val ProcessMetricType.Companion.`Pepper Plugin Broker`: ProcessMetricType
    get() = js.reflect.unsafeCast("Pepper Plugin Broker")

inline val ProcessMetricType.Companion.Unknown: ProcessMetricType
    get() = js.reflect.unsafeCast("Unknown")
