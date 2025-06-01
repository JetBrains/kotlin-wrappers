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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/mediaCapabilities)
     */
    val mediaCapabilities: MediaCapabilities

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/permissions)
     */
    val permissions: Permissions

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/serviceWorker)
     */
    val serviceWorker: ServiceWorkerContainer
}
