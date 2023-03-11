@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


@Suppress("NAME_CONTAINS_ILLEGAL_CHARS")
@JsName("""(/*union*/{idle: 'idle', loading: 'loading'}/*union*/)""")
external enum class RevalidationState {
    idle,
    loading,

    ;
}
