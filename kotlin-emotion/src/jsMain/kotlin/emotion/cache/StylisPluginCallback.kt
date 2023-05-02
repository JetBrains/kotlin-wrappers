package emotion.cache

import js.core.ReadonlyArray

typealias StylisPluginCallback = (
    element: StylisElement,
    index: Int,
    children: ReadonlyArray<StylisElement>,
    /* callback: StylisPluginCallback, */
) -> String?
