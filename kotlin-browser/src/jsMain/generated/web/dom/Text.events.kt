// Automatically generated - do not modify!

package web.dom

import web.events.EventInstance
import web.events.EventType
import web.uievents.DragEvent
import web.uievents.PointerEvent

inline val <C : Text> C.dragEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, EventType("drag"))

inline val <C : Text> C.dragEndEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, EventType("dragend"))

inline val <C : Text> C.dragStartEvent: EventInstance<DragEvent, C, Node>
    get() = EventInstance(this, EventType("dragstart"))

inline val <C : Text> C.pointerCancelEvent: EventInstance<PointerEvent, C, Node>
    get() = EventInstance(this, EventType("pointercancel"))
