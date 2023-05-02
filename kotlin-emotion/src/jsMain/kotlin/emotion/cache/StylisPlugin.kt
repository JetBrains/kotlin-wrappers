package emotion.cache

import js.core.ReadonlyArray

typealias StylisPlugin = (
    element: StylisElement,
    index: Int,
    children: ReadonlyArray<StylisElement>,
    callback: StylisPluginCallback,
) -> String?
