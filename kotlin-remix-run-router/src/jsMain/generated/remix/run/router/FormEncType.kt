package remix.run.router


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{applicationXWwwFormUrlencoded: 'application/x-www-form-urlencoded', multipartFormData: 'multipart/form-data', applicationJson: 'application/json', textPlain: 'text/plain'}/*union*/)""")
sealed external interface FormEncType {
    companion object {
        val applicationXWwwFormUrlencoded: FormEncType
        val multipartFormData: FormEncType
        val applicationJson: FormEncType
        val textPlain: FormEncType
    }
}
