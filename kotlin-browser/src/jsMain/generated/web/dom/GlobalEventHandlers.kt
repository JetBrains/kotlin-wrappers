// Automatically generated - do not modify!

package web.dom

import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.csp.SecurityPolicyViolationEvent
import web.cssom.TransitionEvent
import web.events.Event
import web.events.EventHandler
import web.events.ProgressEvent
import web.html.FormDataEvent
import web.html.SubmitEvent
import web.uievents.*

external interface GlobalEventHandlers {
    /**
     * Fires when the user aborts the download.
     * @param ev The event.
     */
    var onabort: EventHandler<UIEvent>?
    var onanimationcancel: EventHandler<AnimationEvent>?
    var onanimationend: EventHandler<AnimationEvent>?
    var onanimationiteration: EventHandler<AnimationEvent>?
    var onanimationstart: EventHandler<AnimationEvent>?
    var onauxclick: EventHandler<MouseEvent>?
    var onbeforeinput: EventHandler<InputEvent>?

    /**
     * Fires when the object loses the input focus.
     * @param ev The focus event.
     */
    var onblur: EventHandler<FocusEvent>?
    var oncancel: EventHandler<Event>?

    /**
     * Occurs when playback is possible, but would require further buffering.
     * @param ev The event.
     */
    var oncanplay: EventHandler<Event>?
    var oncanplaythrough: EventHandler<Event>?

    /**
     * Fires when the contents of the object or selection have changed.
     * @param ev The event.
     */
    var onchange: EventHandler<Event>?

    /**
     * Fires when the user clicks the left mouse button on the object
     * @param ev The mouse event.
     */
    var onclick: EventHandler<MouseEvent>?
    var onclose: EventHandler<Event>?

    /**
     * Fires when the user clicks the right mouse button in the client area, opening the context menu.
     * @param ev The mouse event.
     */
    var oncontextmenu: EventHandler<MouseEvent>?
    var oncopy: EventHandler<ClipboardEvent>?
    var oncuechange: EventHandler<Event>?
    var oncut: EventHandler<ClipboardEvent>?

    /**
     * Fires when the user double-clicks the object.
     * @param ev The mouse event.
     */
    var ondblclick: EventHandler<MouseEvent>?

    /**
     * Fires on the source object continuously during a drag operation.
     * @param ev The event.
     */
    var ondrag: EventHandler<DragEvent>?

    /**
     * Fires on the source object when the user releases the mouse at the close of a drag operation.
     * @param ev The event.
     */
    var ondragend: EventHandler<DragEvent>?

    /**
     * Fires on the target element when the user drags the object to a valid drop target.
     * @param ev The drag event.
     */
    var ondragenter: EventHandler<DragEvent>?

    /**
     * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     * @param ev The drag event.
     */
    var ondragleave: EventHandler<DragEvent>?

    /**
     * Fires on the target element continuously while the user drags the object over a valid drop target.
     * @param ev The event.
     */
    var ondragover: EventHandler<DragEvent>?

    /**
     * Fires on the source object when the user starts to drag a text selection or selected object.
     * @param ev The event.
     */
    var ondragstart: EventHandler<DragEvent>?
    var ondrop: EventHandler<DragEvent>?

    /**
     * Occurs when the duration attribute is updated.
     * @param ev The event.
     */
    var ondurationchange: EventHandler<Event>?

    /**
     * Occurs when the media element is reset to its initial state.
     * @param ev The event.
     */
    var onemptied: EventHandler<Event>?

    /**
     * Occurs when the end of playback is reached.
     * @param ev The event
     */
    var onended: EventHandler<Event>?

    /**
     * Fires when an error occurs during object loading.
     * @param ev The event.
     */
    var onerror: Function<Unit>? /* OnErrorEventHandler */

    /**
     * Fires when the object receives focus.
     * @param ev The event.
     */
    var onfocus: EventHandler<FocusEvent>?
    var onformdata: EventHandler<FormDataEvent>?
    var ongotpointercapture: EventHandler<PointerEvent>?
    var oninput: EventHandler<Event>?
    var oninvalid: EventHandler<Event>?

    /**
     * Fires when the user presses a key.
     * @param ev The keyboard event
     */
    var onkeydown: EventHandler<KeyboardEvent>?

    /**
     * Fires when the user releases a key.
     * @param ev The keyboard event
     */
    var onkeyup: EventHandler<KeyboardEvent>?

    /**
     * Fires immediately after the browser loads the object.
     * @param ev The event.
     */
    var onload: EventHandler<Event>?

    /**
     * Occurs when media data is loaded at the current playback position.
     * @param ev The event.
     */
    var onloadeddata: EventHandler<Event>?

    /**
     * Occurs when the duration and dimensions of the media have been determined.
     * @param ev The event.
     */
    var onloadedmetadata: EventHandler<Event>?

    /**
     * Occurs when Internet Explorer begins looking for media data.
     * @param ev The event.
     */
    var onloadstart: EventHandler<Event>?
    var onlostpointercapture: EventHandler<PointerEvent>?

    /**
     * Fires when the user clicks the object with either mouse button.
     * @param ev The mouse event.
     */
    var onmousedown: EventHandler<MouseEvent>?
    var onmouseenter: EventHandler<MouseEvent>?
    var onmouseleave: EventHandler<MouseEvent>?

    /**
     * Fires when the user moves the mouse over the object.
     * @param ev The mouse event.
     */
    var onmousemove: EventHandler<MouseEvent>?

    /**
     * Fires when the user moves the mouse pointer outside the boundaries of the object.
     * @param ev The mouse event.
     */
    var onmouseout: EventHandler<MouseEvent>?

    /**
     * Fires when the user moves the mouse pointer into the object.
     * @param ev The mouse event.
     */
    var onmouseover: EventHandler<MouseEvent>?

    /**
     * Fires when the user releases a mouse button while the mouse is over the object.
     * @param ev The mouse event.
     */
    var onmouseup: EventHandler<MouseEvent>?
    var onpaste: EventHandler<ClipboardEvent>?

    /**
     * Occurs when playback is paused.
     * @param ev The event.
     */
    var onpause: EventHandler<Event>?

    /**
     * Occurs when the play method is requested.
     * @param ev The event.
     */
    var onplay: EventHandler<Event>?

    /**
     * Occurs when the audio or video has started playing.
     * @param ev The event.
     */
    var onplaying: EventHandler<Event>?
    var onpointercancel: EventHandler<PointerEvent>?
    var onpointerdown: EventHandler<PointerEvent>?
    var onpointerenter: EventHandler<PointerEvent>?
    var onpointerleave: EventHandler<PointerEvent>?
    var onpointermove: EventHandler<PointerEvent>?
    var onpointerout: EventHandler<PointerEvent>?
    var onpointerover: EventHandler<PointerEvent>?
    var onpointerup: EventHandler<PointerEvent>?

    /**
     * Occurs to indicate progress while downloading media data.
     * @param ev The event.
     */
    var onprogress: EventHandler<ProgressEvent<*>>?

    /**
     * Occurs when the playback rate is increased or decreased.
     * @param ev The event.
     */
    var onratechange: EventHandler<Event>?

    /**
     * Fires when the user resets a form.
     * @param ev The event.
     */
    var onreset: EventHandler<Event>?
    var onresize: EventHandler<UIEvent>?

    /**
     * Fires when the user repositions the scroll box in the scroll bar on the object.
     * @param ev The event.
     */
    var onscroll: EventHandler<Event>?
    var onsecuritypolicyviolation: EventHandler<SecurityPolicyViolationEvent>?

    /**
     * Occurs when the seek operation ends.
     * @param ev The event.
     */
    var onseeked: EventHandler<Event>?

    /**
     * Occurs when the current playback position is moved.
     * @param ev The event.
     */
    var onseeking: EventHandler<Event>?

    /**
     * Fires when the current selection changes.
     * @param ev The event.
     */
    var onselect: EventHandler<Event>?
    var onselectionchange: EventHandler<Event>?
    var onselectstart: EventHandler<Event>?
    var onslotchange: EventHandler<Event>?

    /**
     * Occurs when the download has stopped.
     * @param ev The event.
     */
    var onstalled: EventHandler<Event>?
    var onsubmit: EventHandler<SubmitEvent>?

    /**
     * Occurs if the load operation has been intentionally halted.
     * @param ev The event.
     */
    var onsuspend: EventHandler<Event>?

    /**
     * Occurs to indicate the current playback position.
     * @param ev The event.
     */
    var ontimeupdate: EventHandler<Event>?
    var ontoggle: EventHandler<Event>?
    var ontouchcancel: EventHandler<TouchEvent>?
    var ontouchend: EventHandler<TouchEvent>?
    var ontouchmove: EventHandler<TouchEvent>?
    var ontouchstart: EventHandler<TouchEvent>?
    var ontransitioncancel: EventHandler<TransitionEvent>?
    var ontransitionend: EventHandler<TransitionEvent>?
    var ontransitionrun: EventHandler<TransitionEvent>?
    var ontransitionstart: EventHandler<TransitionEvent>?

    /**
     * Occurs when the volume is changed, or playback is muted or unmuted.
     * @param ev The event.
     */
    var onvolumechange: EventHandler<Event>?

    /**
     * Occurs when playback stops because the next frame of a video resource is not available.
     * @param ev The event.
     */
    var onwaiting: EventHandler<Event>?
    var onwheel: EventHandler<WheelEvent>?
}
