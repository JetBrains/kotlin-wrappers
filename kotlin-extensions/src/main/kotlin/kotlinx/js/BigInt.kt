package kotlinx.js

sealed external interface BigInt

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

inline operator fun BigInt.unaryMinus(): BigInt =
    (-unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.plus(other: BigInt): BigInt =
    (unsafeCast<Double>() + other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.minus(other: BigInt): BigInt =
    (unsafeCast<Double>() - other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.times(other: BigInt): BigInt =
    (unsafeCast<Double>() * other.unsafeCast<Double>()).unsafeCast<BigInt>()

inline operator fun BigInt.div(other: BigInt): BigInt =
    (unsafeCast<Double>() / other.unsafeCast<Double>()).unsafeCast<BigInt>()
