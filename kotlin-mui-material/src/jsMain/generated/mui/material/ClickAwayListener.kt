// Automatically generated - do not modify!

@file:JsModule("@mui/material/ClickAwayListener")

package mui.material

external interface ClickAwayListenerProps : react.PropsWithChildren {
    /**
     * The wrapped element.
     */
    override var children: react.ReactNode? /* react.ReactElement<*>? */

    /**
     * If `true`, the React tree is ignored and only the DOM tree is considered.
     * This prop changes how portaled elements are handled.
     * @default false
     */
    var disableReactTree: Boolean?

    /**
     * The mouse event to listen to. You can disable the listener by providing `false`.
     * @default 'onClick'
     */
    var mouseEvent: ClickAwayListenerMouseEvent?

    /**
     * Callback fired when a "click away" event is detected.
     */
    var onClickAway: (event: web.uievents.UIEvent) -> Unit

    /**
     * The touch event to listen to. You can disable the listener by providing `false`.
     * @default 'onTouchEnd'
     */
    var touchEvent: ClickAwayListenerTouchEvent?
}

/**
 * Listen for click events that occur somewhere in the document, outside of the element itself.
 * For instance, if you need to hide a menu when people click anywhere else on your page.
 *
 * Demos:
 *
 * - [Click-Away Listener](https://mui.com/material-ui/react-click-away-listener/)
 * - [Menu](https://mui.com/material-ui/react-menu/)
 *
 * API:
 *
 * - [ClickAwayListener API](https://mui.com/material-ui/api/click-away-listener/)
 */
external val ClickAwayListener: react.FC<ClickAwayListenerProps>
