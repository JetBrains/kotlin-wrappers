package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{direct: 'direct', autoDetect: 'auto_detect', pacScript: 'pac_script', fixedServers: 'fixed_servers', system: 'system'}/*union*/)""")
sealed external interface ConfigMode {
    companion object {
        val direct: ConfigMode
        val autoDetect: ConfigMode
        val pacScript: ConfigMode
        val fixedServers: ConfigMode
        val system: ConfigMode
    }
}
