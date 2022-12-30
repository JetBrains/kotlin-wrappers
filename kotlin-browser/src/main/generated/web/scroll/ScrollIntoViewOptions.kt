package web.scroll

sealed external interface ScrollIntoViewOptions :
    ScrollOptions {
    var block: ScrollLogicalPosition?
    var inline: ScrollLogicalPosition?
}
