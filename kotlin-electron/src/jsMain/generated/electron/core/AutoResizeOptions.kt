package electron.core


external interface AutoResizeOptions {
    /**
     * If `true`, the view's width will grow and shrink together with the window.
     * `false` by default.
     */
    var width: Boolean?

    /**
     * If `true`, the view's height will grow and shrink together with the window.
     * `false` by default.
     */
    var height: Boolean?

    /**
     * If `true`, the view's x position and width will grow and shrink proportionally
     * with the window. `false` by default.
     */
    var horizontal: Boolean?

    /**
     * If `true`, the view's y position and height will grow and shrink proportionally
     * with the window. `false` by default.
     */
    var vertical: Boolean?
}
