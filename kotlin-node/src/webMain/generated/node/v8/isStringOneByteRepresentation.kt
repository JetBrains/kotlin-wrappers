// Automatically generated - do not modify!

@file:JsModule("node:v8")

package node.v8

/**
 * V8 only supports `Latin-1/ISO-8859-1` and `UTF16` as the underlying representation of a string.
 * If the `content` uses `Latin-1/ISO-8859-1` as the underlying representation, this function will return true;
 * otherwise, it returns false.
 *
 * If this method returns false, that does not mean that the string contains some characters not in `Latin-1/ISO-8859-1`.
 * Sometimes a `Latin-1` string may also be represented as `UTF16`.
 *
 * ```js
 * const { isStringOneByteRepresentation } = require('node:v8');
 *
 * const Encoding = {
 *   latin1: 1,
 *   utf16le: 2,
 * };
 * const buffer = Buffer.alloc(100);
 * function writeString(input) {
 *   if (isStringOneByteRepresentation(input)) {
 *     buffer.writeUint8(Encoding.latin1);
 *     buffer.writeUint32LE(input.length, 1);
 *     buffer.write(input, 5, 'latin1');
 *   } else {
 *     buffer.writeUint8(Encoding.utf16le);
 *     buffer.writeUint32LE(input.length * 2, 1);
 *     buffer.write(input, 5, 'utf16le');
 *   }
 * }
 * writeString('hello');
 * writeString('你好');
 * ```
 * @since v23.10.0, v22.15.0
 */
external fun isStringOneByteRepresentation(content: String): Boolean
