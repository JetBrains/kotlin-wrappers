package react.raw

import js.array.Tuple2
import react.StateSetter

internal typealias StateInstanceRaw<T> = Tuple2<T, StateSetter<T>>
