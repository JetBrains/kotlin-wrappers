// Automatically generated - do not modify!

package web.serviceworker

import web.events.EventType
import kotlin.js.definedExternally

/**
 * The parameter passed into an install event handler function, the **`InstallEvent`** interface represents an install action that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker. As a child of ExtendableEvent, it ensures that functional events such as FetchEvent are not dispatched during installation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InstallEvent)
 */
open external class InstallEvent(
    override val type: EventType<InstallEvent>,
    init: ExtendableEventInit = definedExternally,
) : ExtendableEvent
