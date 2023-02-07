// Automatically generated - do not modify!

package web.dom

import js.core.ArrayLike
import js.core.JsIterable

sealed external class DOMTokenList :
    ArrayLike<String>,
    JsIterable<String> {
    /**
     * Returns the associated set as string.
     *
     * Can be set, to change the associated attribute.
     */
    var value: String

    /**
     * Adds all arguments passed, except those already present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
     */
    fun add(vararg tokens: String)

    /** Returns true if token is present, and false otherwise. */
    fun contains(token: String): Boolean

    /** Returns the token with index index. */
    fun item(index: Int): String?

    /**
     * Removes arguments passed, if they are present.
     *
     * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
     *
     * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
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
     */
    fun replace(
        token: String,
        newToken: String,
    ): Boolean

    /**
     * Returns true if token is in the associated attribute's supported tokens. Returns false otherwise.
     *
     * Throws a TypeError if the associated attribute has no supported tokens defined.
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
     */
    fun toggle(
        token: String,
        force: Boolean = definedExternally,
    ): Boolean

    fun forEach(action: (item: String) -> Unit)
}
