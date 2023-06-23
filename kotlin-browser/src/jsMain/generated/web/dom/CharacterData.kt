// Automatically generated - do not modify!

package web.dom

/**
 * The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData)
 */
sealed external class CharacterData :
    Node,
    ChildNode,
    NonDocumentTypeChildNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/data) */
    var data: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/length) */
    val length: Int
    override val ownerDocument: Document

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/appendData) */
    fun appendData(data: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/deleteData) */
    fun deleteData(
        offset: Number,
        count: Number,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/insertData) */
    fun insertData(
        offset: Number,
        data: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceData) */
    fun replaceData(
        offset: Number,
        count: Number,
        data: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/substringData) */
    fun substringData(
        offset: Number,
        count: Number,
    ): String
}
