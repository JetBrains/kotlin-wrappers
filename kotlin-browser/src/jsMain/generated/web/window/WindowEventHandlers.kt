// Automatically generated - do not modify!

package web.window

import web.events.Event
import web.events.EventHandler
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.messaging.MessageEvent
import web.promise.PromiseRejectionEvent
import web.storage.StorageEvent

external interface WindowEventHandlers {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
     */
    var onafterprint: EventHandler<Event, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
     */
    var onbeforeprint: EventHandler<Event, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
     */
    var onbeforeunload: EventHandler<BeforeUnloadEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
     */
    var ongamepadconnected: EventHandler<GamepadEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
     */
    var ongamepaddisconnected: EventHandler<GamepadEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
     */
    var onhashchange: EventHandler<HashChangeEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
     */
    var onlanguagechange: EventHandler<Event, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
     */
    var onoffline: EventHandler<Event, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
     */
    var ononline: EventHandler<Event, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
     */
    var onpagehide: EventHandler<PageTransitionEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
     */
    var onpageshow: EventHandler<PageTransitionEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
     */
    var onpopstate: EventHandler<PopStateEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
     */
    var onrejectionhandled: EventHandler<PromiseRejectionEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
     */
    var onstorage: EventHandler<StorageEvent, *>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
     */
    var onunhandledrejection: EventHandler<PromiseRejectionEvent, *>?
        get() = definedExternally
        set(value) = definedExternally
}
