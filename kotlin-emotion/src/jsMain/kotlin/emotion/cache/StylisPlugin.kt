package emotion.cache

import js.array.ReadonlyArray

typealias StylisPlugin = (
    element: StylisElement,
    index: Int,
    children: ReadonlyArray<StylisElement>,
    callback: StylisPluginCallback,
) -> String?
