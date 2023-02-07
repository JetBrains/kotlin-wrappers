package ringui

import react.RBuilder
import react.RHandler

fun RBuilder.Dialog(
    show: Boolean,
    handler: RHandler<DialogProps>,
) {
    Dialog {
        attrs.show = show
        handler()
    }
}
