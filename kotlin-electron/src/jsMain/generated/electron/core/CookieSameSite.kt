package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{unspecified: 'unspecified', noRestriction: 'no_restriction', lax: 'lax', strict: 'strict'}/*union*/)""")
sealed external interface CookieSameSite {
    companion object {
        val unspecified: CookieSameSite
        val noRestriction: CookieSameSite
        val lax: CookieSameSite
        val strict: CookieSameSite
    }
}
