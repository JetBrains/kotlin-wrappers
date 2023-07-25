package js.core

external fun BigInt(
    value: Number,
): BigInt

external fun BigInt(
    value: String,
): BigInt

inline val Number.n: BigInt
    get() = BigInt(this)

inline val String.n: BigInt
    get() = BigInt(this)
