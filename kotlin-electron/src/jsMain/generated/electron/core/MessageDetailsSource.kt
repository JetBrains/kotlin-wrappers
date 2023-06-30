package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{javascript: 'javascript', xml: 'xml', network: 'network', consoleApi: 'console-api', storage: 'storage', rendering: 'rendering', security: 'security', deprecation: 'deprecation', worker: 'worker', violation: 'violation', intervention: 'intervention', recommendation: 'recommendation', other: 'other'}/*union*/)""")
sealed external interface MessageDetailsSource {
    companion object {
        val javascript: MessageDetailsSource
        val xml: MessageDetailsSource
        val network: MessageDetailsSource
        val consoleApi: MessageDetailsSource
        val storage: MessageDetailsSource
        val rendering: MessageDetailsSource
        val security: MessageDetailsSource
        val deprecation: MessageDetailsSource
        val worker: MessageDetailsSource
        val violation: MessageDetailsSource
        val intervention: MessageDetailsSource
        val recommendation: MessageDetailsSource
        val other: MessageDetailsSource
    }
}
