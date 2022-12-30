// Automatically generated - do not modify!

package web.dom

sealed external class CharacterData :
    Node,
    ChildNode,
    NonDocumentTypeChildNode {
    var data: String
    val length: Int
    override val ownerDocument: Document
    fun appendData(data: String)
    fun deleteData(
        offset: Number,
        count: Number,
    )

    fun insertData(
        offset: Number,
        data: String,
    )

    fun replaceData(
        offset: Number,
        count: Number,
        data: String,
    )

    fun substringData(
        offset: Number,
        count: Number,
    ): String
}
