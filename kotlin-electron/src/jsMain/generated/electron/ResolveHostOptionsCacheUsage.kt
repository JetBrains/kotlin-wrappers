package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{allowed: 'allowed', staleAllowed: 'staleAllowed', disallowed: 'disallowed'}/*union*/)""")
sealed external interface ResolveHostOptionsCacheUsage {
    companion object {
        val allowed: ResolveHostOptionsCacheUsage
        val staleAllowed: ResolveHostOptionsCacheUsage
        val disallowed: ResolveHostOptionsCacheUsage
    }
}
