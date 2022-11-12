// Automatically generated - do not modify!

package dom.events

import dom.data.DataTransfer
import kotlinx.js.ReadonlyArray

external interface InputEventInit : UIEventInit {
    var data: String?
    var dataTransfer: DataTransfer?
    var inputType: String?
    var isComposing: Boolean?
    var targetRanges: ReadonlyArray<Any /* StaticRange */>?
}

open external class InputEvent(
    type: String,
    init: InputEventInit = definedExternally,
) : UIEvent {
    val data: String?
    val dataTransfer: DataTransfer?
    val inputType: String
    val isComposing: Boolean
    fun getTargetRanges(): ReadonlyArray<Any /* StaticRange */>

    companion object
}
