// Automatically generated - do not modify!

package dom.xpath

import dom.Node

sealed external class XPathResult {
    val booleanValue: Boolean
    val invalidIteratorState: Boolean
    val numberValue: Double
    val resultType: Short
    val singleNodeValue: Node?
    val snapshotLength: Int
    val stringValue: String
    fun iterateNext(): Node?
    fun snapshotItem(index: Int): Node?
    val ANY_TYPE: Short
    val ANY_UNORDERED_NODE_TYPE: Short
    val BOOLEAN_TYPE: Short
    val FIRST_ORDERED_NODE_TYPE: Short
    val NUMBER_TYPE: Short
    val ORDERED_NODE_ITERATOR_TYPE: Short
    val ORDERED_NODE_SNAPSHOT_TYPE: Short
    val STRING_TYPE: Short
    val UNORDERED_NODE_ITERATOR_TYPE: Short
    val UNORDERED_NODE_SNAPSHOT_TYPE: Short
}
