// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{bold: 'bold', normal: 'normal', bolder: 'bolder', lighter: 'lighter'}/*union*/)""")
sealed external interface FontWeight {
    companion object {
        val bold: FontWeight
        val normal: FontWeight
        val bolder: FontWeight
        val lighter: FontWeight
    }
}

inline fun FontWeight(value: Int): FontWeight =
    value.unsafeCast<FontWeight>()
