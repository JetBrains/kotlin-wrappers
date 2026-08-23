// Automatically generated - do not modify!

package web.mutation

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#options)
 */
@JsPlainObject
external interface MutationObserverInit {
    /**
     * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#attributefilter)
     */
    var attributeFilter: ReadonlyArray<JsString>?

    /**
     * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#attributeoldvalue)
     */
    var attributeOldValue: Boolean?

    /**
     * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#attributes)
     */
    var attributes: Boolean?

    /**
     * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#characterdata)
     */
    var characterData: Boolean?

    /**
     * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#characterdataoldvalue)
     */
    var characterDataOldValue: Boolean?

    /**
     * Set to true if mutations to target's children are to be observed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#childlist)
     */
    var childList: Boolean?

    /**
     * Set to true if mutations to not just target, but also target's descendants are to be observed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe#subtree)
     */
    var subtree: Boolean?
}
