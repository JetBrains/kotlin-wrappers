// Automatically generated - do not modify!

package web.screen

import kotlinx.js.Void
import web.events.EventTarget
import kotlin.js.Promise

sealed external class ScreenOrientation :
    EventTarget {
    val angle: Double

    // onchange: ((this: ScreenOrientation, ev: Event) => any) | null
    val type: OrientationType
    fun lock(orientation: OrientationLockType): Promise<Void>
    fun unlock()
}
