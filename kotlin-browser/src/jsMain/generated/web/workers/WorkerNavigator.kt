// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.workers

import web.media.capabilities.MediaCapabilities
import web.navigator.*
import web.permissions.Permissions

sealed external class WorkerNavigator :
    NavigatorBadge,
    NavigatorConcurrentHardware,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorStorage {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/mediaCapabilities) */
    val mediaCapabilities: MediaCapabilities

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/permissions) */
    val permissions: Permissions
}
