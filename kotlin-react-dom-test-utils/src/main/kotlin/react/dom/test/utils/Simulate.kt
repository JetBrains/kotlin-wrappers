@file:JsModule("react-dom/test-utils")
@file:JsNonModule

package react.dom.test.utils

import web.animations.AnimationEventInit
import web.clipboard.ClipboardEventInit
import web.cssom.TransitionEventInit
import web.events.EventInit
import web.events.ProgressEventInit
import web.uievents.*

/**
 * Simulate an event dispatch on a DOM node with optional `eventData` event data.
 * `Simulate` has a method for every event that React understands.
 */
external object Simulate {
    val abort: EventSimulator<EventInit>
    val animationEnd: EventSimulator<AnimationEventInit>
    val animationIteration: EventSimulator<AnimationEventInit>
    val animationStart: EventSimulator<AnimationEventInit>
    val blur: EventSimulator<FocusEventInit>
    val canPlay: EventSimulator<EventInit>
    val canPlayThrough: EventSimulator<EventInit>
    val change: EventSimulator<EventInit>
    val click: EventSimulator<MouseEventInit>
    val compositionEnd: EventSimulator<EventInit>
    val compositionStart: EventSimulator<EventInit>
    val compositionUpdate: EventSimulator<EventInit>
    val contextMenu: EventSimulator<MouseEventInit>
    val copy: EventSimulator<ClipboardEventInit>
    val cut: EventSimulator<ClipboardEventInit>
    val doubleClick: EventSimulator<MouseEventInit>
    val drag: EventSimulator<DragEventInit>
    val dragEnd: EventSimulator<DragEventInit>
    val dragEnter: EventSimulator<DragEventInit>
    val dragExit: EventSimulator<DragEventInit>
    val dragLeave: EventSimulator<DragEventInit>
    val dragOver: EventSimulator<DragEventInit>
    val dragStart: EventSimulator<DragEventInit>
    val drop: EventSimulator<DragEventInit>
    val durationChange: EventSimulator<EventInit>
    val emptied: EventSimulator<EventInit>
    val encrypted: EventSimulator<EventInit>
    val ended: EventSimulator<EventInit>
    val error: EventSimulator<EventInit>
    val focus: EventSimulator<FocusEventInit>
    val input: EventSimulator<EventInit>
    val invalid: EventSimulator<EventInit>
    val keyDown: EventSimulator<KeyboardEventInit>
    val keyPress: EventSimulator<KeyboardEventInit>
    val keyUp: EventSimulator<KeyboardEventInit>
    val load: EventSimulator<EventInit>
    val loadStart: EventSimulator<EventInit>
    val loadedData: EventSimulator<EventInit>
    val loadedMetadata: EventSimulator<EventInit>
    val mouseDown: EventSimulator<MouseEventInit>
    val mouseEnter: EventSimulator<MouseEventInit>
    val mouseLeave: EventSimulator<MouseEventInit>
    val mouseMove: EventSimulator<MouseEventInit>
    val mouseOut: EventSimulator<MouseEventInit>
    val mouseOver: EventSimulator<MouseEventInit>
    val mouseUp: EventSimulator<MouseEventInit>
    val paste: EventSimulator<ClipboardEventInit>
    val pause: EventSimulator<EventInit>
    val play: EventSimulator<EventInit>
    val playing: EventSimulator<EventInit>
    val progress: EventSimulator<ProgressEventInit>
    val rateChange: EventSimulator<EventInit>
    val scroll: EventSimulator<EventInit>
    val seeked: EventSimulator<EventInit>
    val seeking: EventSimulator<EventInit>
    val select: EventSimulator<EventInit>
    val stalled: EventSimulator<EventInit>
    val submit: EventSimulator<EventInit>
    val suspend: EventSimulator<EventInit>
    val timeUpdate: EventSimulator<EventInit>
    val touchCancel: EventSimulator<TouchEventInit>
    val touchEnd: EventSimulator<TouchEventInit>
    val touchMove: EventSimulator<TouchEventInit>
    val touchStart: EventSimulator<TouchEventInit>
    val transitionEnd: EventSimulator<TransitionEventInit>
    val volumeChange: EventSimulator<EventInit>
    val waiting: EventSimulator<EventInit>
    val wheel: EventSimulator<WheelEventInit>
}
