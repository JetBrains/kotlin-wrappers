// Automatically generated - do not modify!

package web.dom

import web.events.EventInstance
import web.uievents.DragEvent
import web.uievents.PointerEvent

inline val <C : Text> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.drag())

inline val <C : Text> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragEnd())

inline val <C : Text> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, DragEvent.dragStart())

inline val <C : Text> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, PointerEvent.pointerCancel())
