// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{None: 0, IntrinsicNamedElement: 1, IntrinsicIndexedElement: 2, IntrinsicElement: 3}/*union*/)""")
sealed external interface JsxFlags {
    companion object {
        val None: JsxFlags

        /** An element from a named property of the JSX.IntrinsicElements interface */
        val IntrinsicNamedElement: JsxFlags

        /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
        val IntrinsicIndexedElement: JsxFlags
        val IntrinsicElement: JsxFlags
    }
}
