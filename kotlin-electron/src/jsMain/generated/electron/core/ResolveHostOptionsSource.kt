package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{any: 'any', system: 'system', dns: 'dns', mdns: 'mdns', localOnly: 'localOnly'}/*union*/)""")
sealed external interface ResolveHostOptionsSource {
    companion object {
        val any: ResolveHostOptionsSource
        val system: ResolveHostOptionsSource
        val dns: ResolveHostOptionsSource
        val mdns: ResolveHostOptionsSource
        val localOnly: ResolveHostOptionsSource
    }
}
