// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.fonts

import seskar.js.JsValue
import web.events.EventType

sealed external interface FontFaceSetLoadEventTypes_deprecated {
    @JsValue("loading")
    val LOADING: EventType<FontFaceSetLoadEvent<*>>
        get() = definedExternally

    @JsValue("loadingdone")
    val LOADING_DONE: EventType<FontFaceSetLoadEvent<*>>
        get() = definedExternally

    @JsValue("loadingerror")
    val LOADING_ERROR: EventType<FontFaceSetLoadEvent<*>>
        get() = definedExternally
}
