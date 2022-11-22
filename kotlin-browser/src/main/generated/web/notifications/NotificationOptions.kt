// Automatically generated - do not modify!

package web.notifications

import kotlinx.js.EpochTimeStamp
import kotlinx.js.ReadonlyArray

sealed external interface NotificationOptions {
    var actions: ReadonlyArray<NotificationAction>?
    var badge: String?
    var body: String?
    var data: Any?
    var dir: NotificationDirection?
    var icon: String?
    var image: String?
    var lang: String?
    var renotify: Boolean?
    var requireInteraction: Boolean?
    var silent: Boolean?
    var tag: String?
    var timestamp: EpochTimeStamp?
    var vibrate: ReadonlyArray<Int> /* VibratePattern */?
}
