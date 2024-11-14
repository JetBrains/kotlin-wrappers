// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.window

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.gamepad.GamepadEvent
import web.history.HashChangeEvent
import web.history.PageTransitionEvent
import web.history.PopStateEvent
import web.messaging.MessageEvent
import web.promise.PromiseRejectionEvent
import web.storage.StorageEvent

external interface WindowEventHandlers :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
     */
    var onafterprint: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
     */
    var onbeforeprint: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
     */
    var onbeforeunload: EventHandler<BeforeUnloadEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepadconnected_event)
     */
    var ongamepadconnected: EventHandler<GamepadEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/gamepaddisconnected_event)
     */
    var ongamepaddisconnected: EventHandler<GamepadEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
     */
    var onhashchange: EventHandler<HashChangeEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
     */
    var onlanguagechange: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
     */
    var onoffline: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
     */
    var ononline: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
     */
    var onpagehide: EventHandler<PageTransitionEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagereveal_event)
     */
    var onpagereveal: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
     */
    var onpageshow: EventHandler<PageTransitionEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageswap_event)
     */
    var onpageswap: EventHandler<Event, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
     */
    var onpopstate: EventHandler<PopStateEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
     */
    var onrejectionhandled: EventHandler<PromiseRejectionEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
     */
    var onstorage: EventHandler<StorageEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
     */
    var onunhandledrejection: EventHandler<PromiseRejectionEvent, WindowEventHandlers, WindowEventHandlers>?
        get() = definedExternally
        set(value) = definedExternally
}
