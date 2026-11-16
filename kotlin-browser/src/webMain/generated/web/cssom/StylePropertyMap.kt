// Automatically generated - do not modify!

package web.cssom

/**
 * The **`StylePropertyMap`** interface of the CSS Typed Object Model API provides a representation of a CSS declaration block that is an alternative to CSSStyleDeclaration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap)
 */
open external class StylePropertyMap
private constructor() :
    StylePropertyMapReadOnly {
    /**
     * The **`append()`** method of the StylePropertyMap interface adds one or more values to the end of a list-valued CSS property's value list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/append)
     */
    open fun append(
        property: String,
        vararg values: CSSStyleValue,
    )

    /**
     * The **`append()`** method of the StylePropertyMap interface adds one or more values to the end of a list-valued CSS property's value list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/append)
     */
    open fun append(
        property: String,
        vararg values: String,
    )

    /**
     * The **`clear()`** method of the StylePropertyMap interface removes all declarations in the StylePropertyMap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/clear)
     */
    open fun clear()

    /**
     * The **`delete()`** method of the StylePropertyMap interface removes the CSS declaration using the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/delete)
     */
    open fun delete(property: String)

    /**
     * The **`set()`** method of the StylePropertyMap interface changes the CSS declaration using the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/set)
     */
    open fun set(
        property: String,
        vararg values: CSSStyleValue,
    )

    /**
     * The **`set()`** method of the StylePropertyMap interface changes the CSS declaration using the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/set)
     */
    open fun set(
        property: String,
        vararg values: String,
    )
}
