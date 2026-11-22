package react.raw

import js.array.Tuple2

internal typealias OptimisticInstanceRaw<T, A> = Tuple2<T, (action: A) -> Unit>
