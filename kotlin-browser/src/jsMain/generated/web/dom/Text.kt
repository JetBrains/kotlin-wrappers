// Automatically generated - do not modify!

package web.dom

sealed external class Text(
    data: String = definedExternally,
) : CharacterData,
    Slottable {
    /**
     * Returns the combined data of all direct Text node siblings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/wholeText)
     */
    val wholeText: String

    /**
     * Splits data at the given offset and returns the remainder as Text node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/splitText)
     */
    fun splitText(offset: Number): Text
}
