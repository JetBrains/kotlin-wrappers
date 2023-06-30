package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{allow: 'allow', disable: 'disable'}/*union*/)""")
sealed external interface ResolveHostOptionsSecureDnsPolicy {
    companion object {
        val allow: ResolveHostOptionsSecureDnsPolicy
        val disable: ResolveHostOptionsSecureDnsPolicy
    }
}
