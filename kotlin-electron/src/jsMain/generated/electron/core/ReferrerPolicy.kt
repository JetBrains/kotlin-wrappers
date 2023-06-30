package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', unsafeUrl: 'unsafe-url', noReferrerWhenDowngrade: 'no-referrer-when-downgrade', noReferrer: 'no-referrer', origin: 'origin', strictOriginWhenCrossOrigin: 'strict-origin-when-cross-origin', sameOrigin: 'same-origin', strictOrigin: 'strict-origin'}/*union*/)""")
sealed external interface ReferrerPolicy {
    companion object {
        val default: ReferrerPolicy
        val unsafeUrl: ReferrerPolicy
        val noReferrerWhenDowngrade: ReferrerPolicy
        val noReferrer: ReferrerPolicy
        val origin: ReferrerPolicy
        val strictOriginWhenCrossOrigin: ReferrerPolicy
        val sameOrigin: ReferrerPolicy
        val strictOrigin: ReferrerPolicy
    }
}
