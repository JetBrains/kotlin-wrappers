// Automatically generated - do not modify!

package dom.observers

import kotlinx.js.ReadonlyArray

sealed external interface MutationObserverInit {
    /** Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted. */
    var attributeFilter: ReadonlyArray<String>?

    /** Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded. */
    var attributeOldValue: Boolean?

    /** Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified. */
    var attributes: Boolean?

    /** Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified. */
    var characterData: Boolean?

    /** Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded. */
    var characterDataOldValue: Boolean?

    /** Set to true if mutations to target's children are to be observed. */
    var childList: Boolean?

    /** Set to true if mutations to not just target, but also target's descendants are to be observed. */
    var subtree: Boolean?
}
