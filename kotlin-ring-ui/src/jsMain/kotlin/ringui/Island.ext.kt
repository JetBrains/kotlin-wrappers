package ringui

import react.RBuilder
import react.RHandler

fun RBuilder.Island(
    header: String,
    handler: RHandler<IslandContentProps>,
) {
    Island {
        IslandHeader {
            attrs.border = true

            +header
        }
        IslandContent(handler)
    }
}
