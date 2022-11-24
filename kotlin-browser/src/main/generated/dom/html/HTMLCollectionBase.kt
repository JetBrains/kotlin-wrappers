// Automatically generated - do not modify!

package dom.html

import dom.Element
import kotlinx.js.ArrayLike

sealed external interface HTMLCollectionBase<T : Element> :
    ArrayLike<T> {
    /** Retrieves an object from various collections. */
    fun item(index: Int): T?
}
