package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{A: 'A', AAAA: 'AAAA'}/*union*/)""")
sealed external interface ResolveHostOptionsQueryType {
    companion object {
        val A: ResolveHostOptionsQueryType
        val AAAA: ResolveHostOptionsQueryType
    }
}
