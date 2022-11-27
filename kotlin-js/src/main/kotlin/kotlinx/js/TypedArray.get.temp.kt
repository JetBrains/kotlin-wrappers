// TODO: remove after typed arrays conversion

package kotlinx.js

import js.typedarrays.*

inline operator fun Float32Array.get(index: Int): Float = asDynamic()[index]
inline operator fun Float64Array.get(index: Int): Double = asDynamic()[index]
inline operator fun Int16Array.get(index: Int): Short = asDynamic()[index]
inline operator fun Int32Array.get(index: Int): Int = asDynamic()[index]
inline operator fun Int8Array.get(index: Int): Byte = asDynamic()[index]
inline operator fun Uint16Array.get(index: Int): Short = asDynamic()[index]
inline operator fun Uint32Array.get(index: Int): Int = asDynamic()[index]
inline operator fun Uint8Array.get(index: Int): Byte = asDynamic()[index]
inline operator fun Uint8ClampedArray.get(index: Int): Byte = asDynamic()[index]
