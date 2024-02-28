// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.fonts

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface FontFaceSetLoadEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.loading()"),
    )
    @JsValue("loading")
    val LOADING: EventType<FontFaceSetLoadEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.loadingDone()"),
    )
    @JsValue("loadingdone")
    val LOADING_DONE: EventType<FontFaceSetLoadEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FontFaceSetLoadEvent.loadingError()"),
    )
    @JsValue("loadingerror")
    val LOADING_ERROR: EventType<FontFaceSetLoadEvent<EventTarget>>
        get() = definedExternally
}
