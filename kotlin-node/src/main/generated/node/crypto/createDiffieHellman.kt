// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import org.khronos.webgl.ArrayBufferView

/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(
    primeLength: Number,
    generator: Any /* number | NodeJS.ArrayBufferView */ = definedExternally,
): DiffieHellman


/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(
    prime: ArrayBufferView,
): DiffieHellman


/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
): DiffieHellman


/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: Any, /* number | NodeJS.ArrayBufferView */
): DiffieHellman


/**
 * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
 * optional specific `generator`.
 *
 * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
 *
 * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
 * a `Buffer`, `TypedArray`, or `DataView` is expected.
 *
 * If `generatorEncoding` is specified, `generator` is expected to be a string;
 * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
 * @since v0.11.12
 * @param primeEncoding The `encoding` of the `prime` string.
 * @param [generator=2]
 * @param generatorEncoding The `encoding` of the `generator` string.
 */
external fun createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: String,
    generatorEncoding: BinaryToTextEncoding,
): DiffieHellman
