package remix.run.router


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{idle: 'idle', loading: 'loading'}/*union*/)""")
sealed external interface RevalidationState {
    companion object {
        val idle: RevalidationState
        val loading: RevalidationState
    }
}
