package kotlinx.js

// typealias BigInt64Array = org.khronos.webgl.BigInt64Array
// typealias BigUint64Array = org.khronos.webgl.BigUint64Array
typealias Float32Array = org.khronos.webgl.Float32Array
typealias Float64Array = org.khronos.webgl.Float64Array
typealias Int16Array = org.khronos.webgl.Int16Array
typealias Int32Array = org.khronos.webgl.Int32Array
typealias Int8Array = org.khronos.webgl.Int8Array
typealias Uint16Array = org.khronos.webgl.Uint16Array
typealias Uint32Array = org.khronos.webgl.Uint32Array
typealias Uint8Array = org.khronos.webgl.Uint8Array
typealias Uint8ClampedArray = org.khronos.webgl.Uint8ClampedArray

inline operator fun Float32Array.get(index: Int): Float = asDynamic()[index]
inline operator fun Float64Array.get(index: Int): Double = asDynamic()[index]
inline operator fun Int16Array.get(index: Int): Short = asDynamic()[index]
inline operator fun Int32Array.get(index: Int): Int = asDynamic()[index]
inline operator fun Int8Array.get(index: Int): Byte = asDynamic()[index]
inline operator fun Uint16Array.get(index: Int): Short = asDynamic()[index]
inline operator fun Uint32Array.get(index: Int): Int = asDynamic()[index]
inline operator fun Uint8Array.get(index: Int): Byte = asDynamic()[index]
inline operator fun Uint8ClampedArray.get(index: Int): Byte = asDynamic()[index]
