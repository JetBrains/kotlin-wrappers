package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{unspecified: 'unspecified', noRestriction: 'no_restriction', lax: 'lax', strict: 'strict'}/*union*/)""")
sealed external interface CookiesSetDetailsSameSite {
    companion object {
        val unspecified: CookiesSetDetailsSameSite
        val noRestriction: CookiesSetDetailsSameSite
        val lax: CookiesSetDetailsSameSite
        val strict: CookiesSetDetailsSameSite
    }
}
