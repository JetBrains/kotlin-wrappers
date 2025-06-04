// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.workers

import web.mediacapabilities.MediaCapabilities
import web.navigator.*
import web.permissions.Permissions
import web.serviceworker.ServiceWorkerContainer

/**
 * The **`WorkerNavigator`** interface represents a subset of the Navigator interface allowed to be accessed from a Worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator)
 */
sealed /* final */
external class WorkerNavigator
protected /* private */ constructor() :
    NavigatorBadge,
    NavigatorConcurrentHardware,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorStorage {
    /**
     * The read-only **`mediaCapabilities`** property of the WorkerNavigator interface references a MediaCapabilities object that can expose information about the decoding and encoding capabilities for a given format and output capabilities (as defined by the Media Capabilities API).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/mediaCapabilities)
     */
    val mediaCapabilities: MediaCapabilities

    /**
     * The **`permissions`** read-only property of the WorkerNavigator interface returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/permissions)
     */
    val permissions: Permissions

    /**
     * The **`serviceWorker`** read-only property of the WorkerNavigator interface returns the ServiceWorkerContainer object for the associated document, which provides access to registration, removal, upgrade, and communication with the ServiceWorker.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/serviceWorker)
     */
    val serviceWorker: ServiceWorkerContainer
}
