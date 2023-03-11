@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


@Suppress("NAME_CONTAINS_ILLEGAL_CHARS")
@JsName("""(/*union*/{post: 'post', put: 'put', patch: 'patch', delete: 'delete'}/*union*/)""")
external enum class MutationFormMethod {
    post,
    put,
    patch,
    delete,

    ;
}
