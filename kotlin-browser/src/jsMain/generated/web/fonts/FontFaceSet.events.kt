// Automatically generated - do not modify!

package web.fonts

import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event)
 */
inline val <C : FontFaceSet> C.loadingEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loading())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event)
 */
inline val <C : FontFaceSet> C.loadingDoneEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loadingDone())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event)
 */
inline val <C : FontFaceSet> C.loadingErrorEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loadingError())
