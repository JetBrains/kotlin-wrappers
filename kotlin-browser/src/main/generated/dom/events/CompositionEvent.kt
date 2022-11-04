// Automatically generated - do not modify!

package dom.events

external interface CompositionEventInit : UIEventInit {
    var data: String?
}

open external class CompositionEvent(
    type: String,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    val data: String

    companion object
}
