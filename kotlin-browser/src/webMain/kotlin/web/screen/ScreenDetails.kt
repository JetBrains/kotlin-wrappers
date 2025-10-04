package web.screen

import js.array.ReadonlyArray
import web.device.DeviceOrientationEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails)
 */
@ExperimentalWebApi
open external class ScreenDetails
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/currentScreen)
     */
    val currentScreen: ScreenDetailed

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/screens)
     */
    val screens: ReadonlyArray<ScreenDetailed>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/currentscreenchange_event)
     */
    var oncurrentscreenchange: EventHandler<DeviceOrientationEvent, ScreenDetails, ScreenDetails>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/screenschange_event)
     */
    var onscreenschange: EventHandler<DeviceOrientationEvent, ScreenDetails, ScreenDetails>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/currentscreenchange_event)
 */
@ExperimentalWebApi
inline val <C : ScreenDetails> C.currentScreenChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "currentscreenchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetails/screenschange_event)
 */
@ExperimentalWebApi
inline val <C : ScreenDetails> C.screensChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "screenschange")
