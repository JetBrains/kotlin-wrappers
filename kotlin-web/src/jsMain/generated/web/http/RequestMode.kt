// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

// language=JavaScript
@JsName("""(/*union*/{cors: 'cors', navigate: 'navigate', noCors: 'no-cors', sameOrigin: 'same-origin'}/*union*/)""")
sealed external interface RequestMode {
    companion object {
        val cors: RequestMode
        val navigate: RequestMode
        val noCors: RequestMode
        val sameOrigin: RequestMode
    }
}
