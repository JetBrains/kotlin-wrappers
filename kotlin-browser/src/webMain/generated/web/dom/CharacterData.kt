// Automatically generated - do not modify!

package web.dom

/**
 * The **`CharacterData`** abstract interface represents a Node object that contains characters.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData)
 */
open external class CharacterData
private constructor() :
    Node,
    ChildNode,
    NonDocumentTypeChildNode {
    /**
     * The **`data`** property of the CharacterData interface represent the value of the current object's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/data)
     */
    var data: String

    /**
     * The read-only **`CharacterData.length`** property returns the number of characters in the contained data, as a positive integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/length)
     */
    val length: Int
    override val ownerDocument: Document

    /**
     * The **`appendData()`** method of the CharacterData interface adds the provided data to the end of the node's current data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/appendData)
     */
    fun appendData(data: String)

    /**
     * The **`deleteData()`** method of the CharacterData interface removes all or part of the data from this `CharacterData` node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/deleteData)
     */
    fun deleteData(
        offset: Int,
        count: Int,
    )

    /**
     * The **`insertData()`** method of the CharacterData interface inserts the provided data into this `CharacterData` node's current data, at the provided offset from the start of the existing data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/insertData)
     */
    fun insertData(
        offset: Int,
        data: String,
    )

    /**
     * The **`replaceData()`** method of the CharacterData interface removes a certain number of characters of the existing text in a given `CharacterData` node and replaces those characters with the text provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceData)
     */
    fun replaceData(
        offset: Int,
        count: Int,
        data: String,
    )

    /**
     * The **`substringData()`** method of the CharacterData interface returns a portion of the existing data, starting at the specified index and extending for a given number of characters afterwards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/substringData)
     */
    fun substringData(
        offset: Int,
        count: Int,
    ): String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    override var textContent: String? // String
}
