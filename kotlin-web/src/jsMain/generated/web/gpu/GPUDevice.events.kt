// Automatically generated - do not modify!

package web.gpu

import web.events.EventInstance

inline val <C : GPUDevice> C.uncapturedErrorEvent: EventInstance<GPUUncapturedErrorEvent, C, C>
    get() = EventInstance(this, GPUUncapturedErrorEvent.uncapturedError())
