@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{post: 'post', put: 'put', patch: 'patch', delete: 'delete'}/*union*/)""")
sealed external interface MutationFormMethod {
    companion object {
        val post: MutationFormMethod
        val put: MutationFormMethod
        val patch: MutationFormMethod
        val delete: MutationFormMethod
    }
}
