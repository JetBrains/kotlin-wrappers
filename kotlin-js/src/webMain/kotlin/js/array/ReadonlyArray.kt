package js.array

typealias ReadonlyArray<T> = JsArray<out T>

expect fun <T : JsAny?> ReadonlyArray<T>.getOrNull(index: Int): T?

inline operator fun <T : JsAny?> ReadonlyArray<T>.component1(): T =
    get(0)

inline operator fun <T : JsAny?> ReadonlyArray<T>.component2(): T =
    get(1)

inline operator fun <T : JsAny?> ReadonlyArray<T>.component3(): T =
    get(2)

inline operator fun <T : JsAny?> ReadonlyArray<T>.component4(): T =
    get(3)

inline operator fun <T : JsAny?> ReadonlyArray<T>.component5(): T =
    get(4)

expect operator fun <T : JsAny?> ReadonlyArray<T>.iterator(): Iterator<T>

expect fun <T : JsAny?> ReadonlyArray<T>.asSequence(): Sequence<T>

expect fun <T : JsAny?> Sequence<T>.toJsArray(): ReadonlyArray<T>

expect fun <T : JsAny?> ReadonlyArray<T>.toList(): List<T>

expect fun <T : JsAny?> List<T>.toJsArray(): ReadonlyArray<T>

expect fun <T : JsAny?> ReadonlyArray<T>.toSet(): Set<T>

expect fun <T : JsAny?> Set<T>.toJsArray(): ReadonlyArray<T>
