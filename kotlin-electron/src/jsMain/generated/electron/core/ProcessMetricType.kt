package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{Browser: 'Browser', Tab: 'Tab', Utility: 'Utility', Zygote: 'Zygote', SandboxHelper: 'Sandbox helper', GPU: 'GPU', PepperPlugin: 'Pepper Plugin', PepperPluginBroker: 'Pepper Plugin Broker', Unknown: 'Unknown'}/*union*/)""")
sealed external interface ProcessMetricType {
    companion object {
        val Browser: ProcessMetricType
        val Tab: ProcessMetricType
        val Utility: ProcessMetricType
        val Zygote: ProcessMetricType
        val SandboxHelper: ProcessMetricType
        val GPU: ProcessMetricType
        val PepperPlugin: ProcessMetricType
        val PepperPluginBroker: ProcessMetricType
        val Unknown: ProcessMetricType
    }
}
