package electron.core


external interface KeyboardEvent {
// Docs: https://electronjs.org/docs/api/structures/keyboard-event
    /**
     * whether an Alt key was used in an accelerator to trigger the Event
     */
    var altKey: Boolean?

    /**
     * whether the Control key was used in an accelerator to trigger the Event
     */
    var ctrlKey: Boolean?

    /**
     * whether a meta key was used in an accelerator to trigger the Event
     */
    var metaKey: Boolean?

    /**
     * whether a Shift key was used in an accelerator to trigger the Event
     */
    var shiftKey: Boolean?

    /**
     * whether an accelerator was used to trigger the event as opposed to another user
     * gesture like mouse click
     */
    var triggeredByAccelerator: Boolean?
}
