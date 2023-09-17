package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{always: 'always', default: 'default', never: 'never'}/*union*/)""")
sealed external interface X509CheckOptionsSubject {
    companion object {
        val always: X509CheckOptionsSubject
        val default: X509CheckOptionsSubject
        val never: X509CheckOptionsSubject
    }
}
