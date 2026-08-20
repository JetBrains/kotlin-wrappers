// Automatically generated - do not modify!

package tanstack.react.virtual

import tanstack.virtual.core.VirtualizerOptions

@kotlinx.js.JsPlainObject
external interface ReactVirtualizerOptions<TScrollElement : web.events.EventTarget /* Element | Window */, TItemElement : web.dom.Element> :
    VirtualizerOptions<TScrollElement, TItemElement> {
    var useFlushSync: Boolean?

    /**
     * Skip React re-renders for scroll-only updates. The virtualizer writes
     * item positions (`top`/`left`) and the container size (`height`/`width`)
     * directly to the DOM, and only re-renders when the visible index range
     * or `isScrolling` changes.
     *
     * Requirements when enabled:
     * - Item elements must be `position: absolute`; in `'transform'` mode they
     *   must also be anchored with `top: 0` / `left: 0`.
     * - Item elements must NOT set the main-axis position in their style — the
     *   virtualizer owns `top` / `left` in `'position'` mode and `transform` in
     *   `'transform'` mode.
     * - The inner size container must receive `virtualizer.containerRef` and
     *   must NOT set `height` / `width` in its style.
     * - For multi-lane layouts (grids / masonry), the cross-axis position
     *   (e.g. `left: ${(item.lane * 100) / lanes}%`) is stable per item and
     *   must still be set in your JSX — only the main axis is automated.
     *
     * This flag is intended to be set once at mount. Toggling it (or
     *  `directDomUpdatesMode`) at runtime can leave stale inline styles on
     *  items and the container.
     */
    var directDomUpdates: Boolean?

    /**
     * How `directDomUpdates` positions item elements.
     * - `'transform'` (default): writes `transform: translate3d(...)`.
     *   Promotes items to their own compositor layer — usually smoother on long
     *   lists, but creates a stacking context and can interfere with
     *   `position: fixed` descendants. Item elements must still be anchored with
     *   `position: absolute`, `top: 0`, and `left: 0`.
     * - `'position'`: writes `top` / `left`. Item elements must be
     *   `position: absolute`.
     */
    var directDomUpdatesMode: (DirectDomUpdatesMode)?
}
