// Automatically generated - do not modify!

package web.dom.observers

import js.core.ReadonlyArray
import web.dom.Node

/**
 * Provides the ability to watch for changes being made to the DOM tree. It is designed as a replacement for the older Mutation Events feature which was part of the DOM3 Events specification.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver)
 */
external class MutationObserver(
    callback: MutationCallback,
) {
    /**
     * Stops observer from observing any mutations. Until the observe() method is used again, observer's callback will not be invoked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/disconnect)
     */
    fun disconnect()

    /**
     * Instructs the user agent to observe a given target (a node) and report any mutations based on the criteria given by options (an object).
     *
     * The options argument allows for setting mutation observation options via object members.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe)
     */
    fun observe(
        target: Node,
        options: MutationObserverInit = definedExternally,
    )

    /**
     * Empties the record queue and returns what was in there.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/takeRecords)
     */
    fun takeRecords(): ReadonlyArray<MutationRecord>
}
