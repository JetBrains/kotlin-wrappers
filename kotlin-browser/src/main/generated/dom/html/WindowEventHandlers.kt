// Automatically generated - do not modify!

package dom.html

import dom.events.BeforeUnloadEvent
import dom.events.PromiseRejectionEvent
import web.events.Event
import web.events.EventHandler
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.messaging.MessageEvent
import web.storage.StorageEvent

external interface WindowEventHandlers {
    var onafterprint: EventHandler<Event>?
    var onbeforeprint: EventHandler<Event>?
    var onbeforeunload: EventHandler<BeforeUnloadEvent>?
    var ongamepadconnected: EventHandler<GamepadEvent>?
    var ongamepaddisconnected: EventHandler<GamepadEvent>?
    var onhashchange: EventHandler<HashChangeEvent>?
    var onlanguagechange: EventHandler<Event>?
    var onmessage: EventHandler<MessageEvent<*>>?
    var onmessageerror: EventHandler<MessageEvent<*>>?
    var onoffline: EventHandler<Event>?
    var ononline: EventHandler<Event>?
    var onpagehide: EventHandler<PageTransitionEvent>?
    var onpageshow: EventHandler<PageTransitionEvent>?
    var onpopstate: EventHandler<PopStateEvent>?
    var onrejectionhandled: EventHandler<PromiseRejectionEvent>?
    var onstorage: EventHandler<StorageEvent>?
    var onunhandledrejection: EventHandler<PromiseRejectionEvent>?
    var onunload: EventHandler<Event>?
}
