// Automatically generated - do not modify!

package dom

sealed external class Text(
    data: String = definedExternally,
) : CharacterData,
    Slottable {
    /** Returns the combined data of all direct Text node siblings. */
    val wholeText: String

    /** Splits data at the given offset and returns the remainder as Text node. */
    fun splitText(offset: Number): Text
}
