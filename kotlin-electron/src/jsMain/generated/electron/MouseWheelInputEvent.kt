package electron


external interface MouseWheelInputEvent : MouseInputEvent {
    // Docs: https://electronjs.org/docs/api/structures/mouse-wheel-input-event
    var accelerationRatioX: Double?
    var accelerationRatioY: Double?
    var canScroll: Boolean?
    var deltaX: Double?
    var deltaY: Double?
    var hasPreciseScrollingDeltas: Boolean?

    /**
     * The type of the event, can be `mouseWheel`.
     */
    @Deprecated(message = "use mouseWheelType", level = DeprecationLevel.HIDDEN)
    override var type: InputEventType

    @JsName("type")
    var mouseWheelType: (String /* 'mouseWheel' */)
    var wheelTicksX: Double?
    var wheelTicksY: Double?
}
