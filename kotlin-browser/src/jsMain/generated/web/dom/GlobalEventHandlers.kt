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
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/abort_event)
     */
    var onabort: EventHandler<UIEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationcancel_event) */
    var onanimationcancel: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationend_event) */
    var onanimationend: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationiteration_event) */
    var onanimationiteration: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/animationstart_event) */
    var onanimationstart: EventHandler<AnimationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event) */
    var onauxclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforeinput_event) */
    var onbeforeinput: EventHandler<InputEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event) */
    var onbeforetoggle: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the object loses the input focus.
     * @param ev The focus event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    var onblur: EventHandler<FocusEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/cancel_event) */
    var oncancel: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when playback is possible, but would require further buffering.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplay_event)
     */
    var oncanplay: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canplaythrough_event) */
    var oncanplaythrough: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the contents of the object or selection have changed.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
     */
    var onchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user clicks the left mouse button on the object
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    var onclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close_event) */
    var onclose: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user clicks the right mouse button in the client area, opening the context menu.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    var oncontextmenu: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event) */
    var oncopy: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/cuechange_event) */
    var oncuechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event) */
    var oncut: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user double-clicks the object.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    var ondblclick: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the source object continuously during a drag operation.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     */
    var ondrag: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the source object when the user releases the mouse at the close of a drag operation.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     */
    var ondragend: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the target element when the user drags the object to a valid drop target.
     * @param ev The drag event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     */
    var ondragenter: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
     * @param ev The drag event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     */
    var ondragleave: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the target element continuously while the user drags the object over a valid drop target.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     */
    var ondragover: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires on the source object when the user starts to drag a text selection or selected object.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     */
    var ondragstart: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event) */
    var ondrop: EventHandler<DragEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the duration attribute is updated.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/durationchange_event)
     */
    var ondurationchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the media element is reset to its initial state.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/emptied_event)
     */
    var onemptied: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the end of playback is reached.
     * @param ev The event
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended_event)
     */
    var onended: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when an error occurs during object loading.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
     */
    var onerror: Function<Unit>? /* OnErrorEventHandler */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the object receives focus.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    var onfocus: EventHandler<FocusEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event) */
    var onformdata: EventHandler<FormDataEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event) */
    var ongotpointercapture: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/input_event) */
    var oninput: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/invalid_event) */
    var oninvalid: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user presses a key.
     * @param ev The keyboard event
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    var onkeydown: EventHandler<KeyboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user releases a key.
     * @param ev The keyboard event
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    var onkeyup: EventHandler<KeyboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires immediately after the browser loads the object.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/load_event)
     */
    var onload: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when media data is loaded at the current playback position.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadeddata_event)
     */
    var onloadeddata: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the duration and dimensions of the media have been determined.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadedmetadata_event)
     */
    var onloadedmetadata: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when Internet Explorer begins looking for media data.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loadstart_event)
     */
    var onloadstart: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lostpointercapture_event) */
    var onlostpointercapture: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user clicks the object with either mouse button.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    var onmousedown: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event) */
    var onmouseenter: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event) */
    var onmouseleave: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user moves the mouse over the object.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    var onmousemove: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user moves the mouse pointer outside the boundaries of the object.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    var onmouseout: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user moves the mouse pointer into the object.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    var onmouseover: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user releases a mouse button while the mouse is over the object.
     * @param ev The mouse event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    var onmouseup: EventHandler<MouseEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event) */
    var onpaste: EventHandler<ClipboardEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when playback is paused.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause_event)
     */
    var onpause: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the play method is requested.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play_event)
     */
    var onplay: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the audio or video has started playing.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playing_event)
     */
    var onplaying: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event) */
    var onpointercancel: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event) */
    var onpointerdown: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event) */
    var onpointerenter: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event) */
    var onpointerleave: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event) */
    var onpointermove: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event) */
    var onpointerout: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event) */
    var onpointerover: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event) */
    var onpointerup: EventHandler<PointerEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs to indicate progress while downloading media data.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/progress_event)
     */
    var onprogress: EventHandler<ProgressEvent<*>>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the playback rate is increased or decreased.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ratechange_event)
     */
    var onratechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user resets a form.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
     */
    var onreset: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/resize_event) */
    var onresize: EventHandler<UIEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the user repositions the scroll box in the scroll bar on the object.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     */
    var onscroll: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event) */
    var onscrollend: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event) */
    var onsecuritypolicyviolation: EventHandler<SecurityPolicyViolationEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the seek operation ends.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeked_event)
     */
    var onseeked: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the current playback position is moved.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking_event)
     */
    var onseeking: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Fires when the current selection changes.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select_event)
     */
    var onselect: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/selectionchange_event) */
    var onselectionchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/selectstart_event) */
    var onselectstart: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/slotchange_event) */
    var onslotchange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the download has stopped.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/stalled_event)
     */
    var onstalled: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event) */
    var onsubmit: EventHandler<SubmitEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs if the load operation has been intentionally halted.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/suspend_event)
     */
    var onsuspend: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs to indicate the current playback position.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/timeupdate_event)
     */
    var ontimeupdate: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/toggle_event) */
    var ontoggle: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event) */
    var ontouchcancel: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event) */
    var ontouchend: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event) */
    var ontouchmove: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event) */
    var ontouchstart: EventHandler<TouchEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitioncancel_event) */
    var ontransitioncancel: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionend_event) */
    var ontransitionend: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionrun_event) */
    var ontransitionrun: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/transitionstart_event) */
    var ontransitionstart: EventHandler<TransitionEvent>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when the volume is changed, or playback is muted or unmuted.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volumechange_event)
     */
    var onvolumechange: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Occurs when playback stops because the next frame of a video resource is not available.
     * @param ev The event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waiting_event)
     */
    var onwaiting: EventHandler<Event>?
        get() = definedExternally
        set(value) = definedExternally

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event) */
    var onwheel: EventHandler<WheelEvent>?
        get() = definedExternally
        set(value) = definedExternally
}
