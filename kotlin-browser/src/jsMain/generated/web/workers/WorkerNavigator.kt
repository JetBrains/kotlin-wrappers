// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.workers

import web.media.capabilities.MediaCapabilities
import web.navigator.*
import web.permissions.Permissions
import web.serviceworker.ServiceWorkerContainer

/**
 * A subset of the Navigator interface allowed to be accessed from a Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.navigator property obtained by calling window.self.navigator.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator)
 */
sealed external class WorkerNavigator :
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
