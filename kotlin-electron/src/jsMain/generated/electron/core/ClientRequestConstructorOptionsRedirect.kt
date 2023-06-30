package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{follow: 'follow', error: 'error', manual: 'manual'}/*union*/)""")
sealed external interface ClientRequestConstructorOptionsRedirect {
    companion object {
        val follow: ClientRequestConstructorOptionsRedirect
        val error: ClientRequestConstructorOptionsRedirect
        val manual: ClientRequestConstructorOptionsRedirect
    }
}
