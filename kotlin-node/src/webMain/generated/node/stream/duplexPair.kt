// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsQualifier("Stream")

package node.stream

/**
 * The utility function `duplexPair` returns an Array with two items,
 * each being a `Duplex` stream connected to the other side:
 *
 * ```js
 * const [ sideA, sideB ] = duplexPair();
 * ```
 *
 * Whatever is written to one stream is made readable on the other. It provides
 * behavior analogous to a network connection, where the data written by the client
 * becomes readable by the server, and vice-versa.
 *
 * The Duplex streams are symmetrical; one or the other may be used without any
 * difference in behavior.
 * @param options A value to pass to both {@link Duplex} constructors,
 * to set options such as buffering.
 * @since v22.6.0
 */
external fun duplexPair(options: DuplexOptions<*> = definedExternally): js.array.Tuple2<Duplex, Duplex>
