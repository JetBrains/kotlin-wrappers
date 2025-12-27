// Automatically generated - do not modify!

package electron.core

sealed external interface ProcessMetricType {
    companion object {
        @seskar.js.JsValue("Browser")
        val Browser: ProcessMetricType

        @seskar.js.JsValue("Tab")
        val Tab: ProcessMetricType

        @seskar.js.JsValue("Utility")
        val Utility: ProcessMetricType

        @seskar.js.JsValue("Zygote")
        val Zygote: ProcessMetricType

        @seskar.js.JsValue("Sandbox helper")
        val `Sandbox helper`: ProcessMetricType

        @seskar.js.JsValue("GPU")
        val GPU: ProcessMetricType

        @seskar.js.JsValue("Pepper Plugin")
        val `Pepper Plugin`: ProcessMetricType

        @seskar.js.JsValue("Pepper Plugin Broker")
        val `Pepper Plugin Broker`: ProcessMetricType

        @seskar.js.JsValue("Unknown")
        val Unknown: ProcessMetricType
    }
}
