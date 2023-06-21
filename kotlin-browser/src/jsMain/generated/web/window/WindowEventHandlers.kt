// Automatically generated - do not modify!

package web.window

import web.events.Event
import web.events.EventHandler
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.messaging.MessageEvent
import web.storage.StorageEvent

external interface WindowEventHandlers {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event) */
    var onafterprint: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event) */
    var onbeforeprint: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event) */
    var onbeforeunload: EventHandler<BeforeUnloadEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event) */
    var ongamepadconnected: EventHandler<GamepadEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event) */
    var ongamepaddisconnected: EventHandler<GamepadEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event) */
    var onhashchange: EventHandler<HashChangeEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event) */
    var onlanguagechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event) */
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event) */
    var onoffline: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event) */
    var ononline: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event) */
    var onpagehide: EventHandler<PageTransitionEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event) */
    var onpageshow: EventHandler<PageTransitionEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event) */
    var onpopstate: EventHandler<PopStateEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event) */
    var onrejectionhandled: EventHandler<PromiseRejectionEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event) */
    var onstorage: EventHandler<StorageEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event) */
    var onunhandledrejection: EventHandler<PromiseRejectionEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event) */
    var onunload: EventHandler<Event>?
}
