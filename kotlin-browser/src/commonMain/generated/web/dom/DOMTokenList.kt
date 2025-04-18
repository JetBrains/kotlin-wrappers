// Automatically generated - do not modify!

package web.dom

import js.array.JsTuple2
import js.collections.ListLike
import js.core.JsInt
import js.core.JsString
import js.iterable.JsIterator
import kotlin.js.definedExternally

/**
 * The **`DOMTokenList`** interface represents a set of space-separated tokens.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList)
 */
external class DOMTokenList
private constructor() :
    ListLike<JsString> {
    /**
     * Returns the number of tokens.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/length)
     */
    override val length: Int

    /**
     * Returns the associated set as string.
     *
     * Can be set, to change the associated attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/value)
     */
    var value: String

    /**
     * Adds all arguments passed, except those already present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/add)
     */
    fun add(vararg tokens: String)

    /**
     * Returns true if token is present, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/contains)
     */
    fun contains(token: String): Boolean

    /**
     * Returns the token with index index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/item)
     */
    fun item(index: Int): String?

    /**
     * Removes arguments passed, if they are present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/remove)
     */
    fun remove(vararg tokens: String)

    /**
     * Replaces token with newToken.
     *
     * Returns true if token was replaced with newToken, and false otherwise.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/replace)
     */
    fun replace(
        token: String,
        newToken: String,
    ): Boolean

    /**
     * Returns true if token is in the associated attribute's supported tokens. Returns false otherwise.
     *
     * Throws a TypeError if the associated attribute has no supported tokens defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/supports)
     */
    fun supports(token: String): Boolean

    /**
     * If force is not given, "toggles" token, removing it if it's present and adding it if it's not present. If force is true, adds token (same as add()). If force is false, removes token (same as remove()).
     *
     * Returns true if token is now present, and false otherwise.
     *
     * Throws a "SyntaxError" DOMException if token is empty.
     *
     * Throws an "InvalidCharacterError" DOMException if token contains any spaces.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/toggle)
     */
    fun toggle(
        token: String,
        force: Boolean = definedExternally,
    ): Boolean

    override fun entries(): JsIterator<JsTuple2<JsInt, JsString>>
    override fun keys(): JsIterator<JsInt>
    override fun values(): JsIterator<JsString>
    override fun forEach(action: (item: JsString) -> Unit)
}
