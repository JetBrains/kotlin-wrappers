@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


@JsName("""(/*union*/{post: 'post', put: 'put', patch: 'patch', delete: 'delete'}/*union*/)""")
external enum class MutationFormMethod {
    post,
    put,
    patch,
    delete,

    ;
}

