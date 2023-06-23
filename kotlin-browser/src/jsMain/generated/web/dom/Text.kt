// Automatically generated - do not modify!

package web.dom

/**
 * The textual content of Element or Attr. If an element has no markup within its content, it has a single child implementing Text that contains the element's text. However, if the element contains markup, it is parsed into information items and Text nodes that form its children.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text)
 */
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
