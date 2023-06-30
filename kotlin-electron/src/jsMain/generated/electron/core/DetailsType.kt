package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{Utility: 'Utility', Zygote: 'Zygote', SandboxHelper: 'Sandbox helper', GPU: 'GPU', PepperPlugin: 'Pepper Plugin', PepperPluginBroker: 'Pepper Plugin Broker', Unknown: 'Unknown'}/*union*/)""")
sealed external interface DetailsType {
    companion object {
        val Utility: DetailsType
        val Zygote: DetailsType
        val SandboxHelper: DetailsType
        val GPU: DetailsType
        val PepperPlugin: DetailsType
        val PepperPluginBroker: DetailsType
        val Unknown: DetailsType
    }
}
