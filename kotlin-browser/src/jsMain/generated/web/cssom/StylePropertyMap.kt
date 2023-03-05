// Automatically generated - do not modify!

package web.cssom

sealed external class StylePropertyMap :
    StylePropertyMapReadOnly {
    fun append(
        property: String,
        vararg values: Any, /* CSSStyleValue | string */
    )

    fun clear()
    fun delete(property: String)
    fun set(
        property: String,
        vararg values: Any, /* CSSStyleValue | string */
    )
}
