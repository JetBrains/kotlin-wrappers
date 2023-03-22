// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.locks

// language=JavaScript
@JsName("""(/*union*/{exclusive: 'exclusive', shared: 'shared'}/*union*/)""")
sealed external interface LockMode {
    companion object {
        val exclusive: LockMode
        val shared: LockMode
    }
}
