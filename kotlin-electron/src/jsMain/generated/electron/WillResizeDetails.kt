package electron


external interface WillResizeDetails {
    /**
     * The edge of the window being dragged for resizing. Can be `bottom`, `left`,
     * `right`, `top-left`, `top-right`, `bottom-left` or `bottom-right`.
     */
    var edge: (WillResizeDetailsEdge)
}
