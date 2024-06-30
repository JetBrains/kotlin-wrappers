// Automatically generated - do not modify!

package web.fonts

import web.events.EventInstance

inline val <C : FontFaceSet> C.loadingEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loading())

inline val <C : FontFaceSet> C.loadingDoneEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loadingDone())

inline val <C : FontFaceSet> C.loadingErrorEvent: EventInstance<FontFaceSetLoadEvent, C, C>
    get() = EventInstance(this, FontFaceSetLoadEvent.loadingError())
