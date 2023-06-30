package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{include: 'include', omit: 'omit'}/*union*/)""")
sealed external interface ClientRequestConstructorOptionsCredentials {
    companion object {
        val include: ClientRequestConstructorOptionsCredentials
        val omit: ClientRequestConstructorOptionsCredentials
    }
}
