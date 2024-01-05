package emotion.cache

import js.array.ReadonlyArray

typealias StylisPluginCallback = (
    element: StylisElement,
    index: Int,
    children: ReadonlyArray<StylisElement>,
    /* callback: StylisPluginCallback, */
) -> String?
