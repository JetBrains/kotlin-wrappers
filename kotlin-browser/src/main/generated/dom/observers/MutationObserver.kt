// Automatically generated - do not modify!

package dom.observers

import dom.Node
import js.core.ReadonlyArray

external class MutationObserver(
    callback: MutationCallback,
) {
    /** Stops observer from observing any mutations. Until the observe() method is used again, observer's callback will not be invoked. */
    fun disconnect()

    /**
     * Instructs the user agent to observe a given target (a node) and report any mutations based on the criteria given by options (an object).
     *
     * The options argument allows for setting mutation observation options via object members.
     */
    fun observe(
        target: Node,
        options: MutationObserverInit = definedExternally,
    )

    /** Empties the record queue and returns what was in there. */
    fun takeRecords(): ReadonlyArray<MutationRecord>
}
