// Automatically generated - do not modify!

package web.push

import js.core.ReadonlyArray
import web.permissions.PermissionState
import kotlin.js.Promise

sealed external class PushManager {
    fun getSubscription(): Promise<PushSubscription?>
    fun permissionState(options: PushSubscriptionOptionsInit = definedExternally): Promise<PermissionState>
    fun subscribe(options: PushSubscriptionOptionsInit = definedExternally): Promise<PushSubscription>

    companion object {
        val supportedContentEncodings: ReadonlyArray<String>
    }
}
