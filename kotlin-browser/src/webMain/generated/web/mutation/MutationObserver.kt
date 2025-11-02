// Automatically generated - do not modify!

package web.mutation

import js.array.ReadonlyArray
import web.dom.Node
import kotlin.js.definedExternally

/**
 * The **`MutationObserver`** interface provides the ability to watch for changes being made to the DOM tree. It is designed as a replacement for the older Mutation Events feature, which was part of the DOM3 Events specification.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver)
 */
open external class MutationObserver(
    callback: MutationCallback,
) {
    /**
     * The MutationObserver method **`disconnect()`** tells the observer to stop watching for mutations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/disconnect)
     */
    fun disconnect()

    /**
     * The MutationObserver method **`observe()`** configures the MutationObserver callback to begin receiving notifications of changes to the DOM that match the given options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe)
     */
    fun observe(
        target: Node,
        options: MutationObserverInit = definedExternally,
    )

    /**
     * The MutationObserver method **`takeRecords()`** returns a list of all matching DOM changes that have been detected but not yet processed by the observer's callback function, leaving the mutation queue empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/takeRecords)
     */
    fun takeRecords(): ReadonlyArray<MutationRecord>
}
