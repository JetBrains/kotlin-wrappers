package media

import org.w3c.dom.CanPlayTypeResult

typealias CanPlayTypeResult = CanPlayTypeResult

inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult
    get() = "".unsafeCast<CanPlayTypeResult>()

inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult
    get() = "maybe".unsafeCast<CanPlayTypeResult>()

inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult
    get() = "probably".unsafeCast<CanPlayTypeResult>()
