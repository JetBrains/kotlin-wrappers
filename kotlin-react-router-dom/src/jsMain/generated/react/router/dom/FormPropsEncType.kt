package react.router.dom


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{applicationXWwwFormUrlencoded: 'application/x-www-form-urlencoded', multipartFormData: 'multipart/form-data', textPlain: 'text/plain'}/*union*/)""")
sealed external interface FormPropsEncType {
    companion object {
        val applicationXWwwFormUrlencoded: FormPropsEncType
        val multipartFormData: FormPropsEncType
        val textPlain: FormPropsEncType
    }
}
