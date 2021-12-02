package react.virtual

import react.Ref

typealias SizeObserver<T> = (
    parentRef: Ref<T>,
    initialRect: Size?,
) -> Size
