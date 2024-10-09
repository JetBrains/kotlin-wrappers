// Automatically generated - do not modify!

package web.dom.observers

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationObserverInit {
    /**
     * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
     */
    val attributeFilter: ReadonlyArray<String>?

    /**
     * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
     */
    val attributeOldValue: Boolean?

    /**
     * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
     */
    val attributes: Boolean?

    /**
     * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
     */
    val characterData: Boolean?

    /**
     * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
     */
    val characterDataOldValue: Boolean?

    /**
     * Set to true if mutations to target's children are to be observed.
     */
    val childList: Boolean?

    /**
     * Set to true if mutations to not just target, but also target's descendants are to be observed.
     */
    val subtree: Boolean?
}
