// Automatically generated - do not modify!

package web.cssom

/**
 * The **`StylePropertyMap`** interface of the CSS Typed Object Model API provides a representation of a CSS declaration block that is an alternative to CSSStyleDeclaration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap)
 */
sealed /* final */
external class StylePropertyMap
protected /* private */ constructor() :
    StylePropertyMapReadOnly {
    /**
     * The **`append()`** method of the StylePropertyMap interface adds the passed CSS value to the StylePropertyMap with the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/append)
     */
    fun append(
        property: String,
        vararg values: CSSStyleValue,
    )

    fun append(
        property: String,
        vararg values: String,
    )

    /**
     * The **`clear()`** method of the StylePropertyMap interface removes all declarations in the StylePropertyMap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/clear)
     */
    fun clear()

    /**
     * The **`delete()`** method of the StylePropertyMap interface removes the CSS declaration with the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/delete)
     */
    fun delete(property: String)

    /**
     * The **`set()`** method of the StylePropertyMap interface changes the CSS declaration with the given property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StylePropertyMap/set)
     */
    fun set(
        property: String,
        vararg values: CSSStyleValue,
    )

    fun set(
        property: String,
        vararg values: String,
    )
}
