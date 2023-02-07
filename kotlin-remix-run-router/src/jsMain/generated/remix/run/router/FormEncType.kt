@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


@JsName("""(/*union*/{applicationXWwwFormUrlencoded: 'application/x-www-form-urlencoded', multipartFormData: 'multipart/form-data'}/*union*/)""")
external enum class FormEncType {
    applicationXWwwFormUrlencoded,
    multipartFormData,

    ;
}

