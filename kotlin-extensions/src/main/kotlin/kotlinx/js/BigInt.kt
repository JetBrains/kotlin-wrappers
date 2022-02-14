package kotlinx.js

sealed external interface BigInt

external fun BigInt(
    value: Number,
): BigInt

external fun BigInt(
    value: String,
): BigInt
