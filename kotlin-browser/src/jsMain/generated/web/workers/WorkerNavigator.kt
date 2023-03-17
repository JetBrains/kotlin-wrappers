// Automatically generated - do not modify!

@file:Suppress(
    "SEALED_INHERITOR_IN_DIFFERENT_PACKAGE",
)

package web.workers

import web.media.capabilities.MediaCapabilities
import web.navigator.*
import web.permissions.Permissions

sealed external class WorkerNavigator :
    NavigatorConcurrentHardware,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorStorage {
    val mediaCapabilities: MediaCapabilities
    val permissions: Permissions
}
