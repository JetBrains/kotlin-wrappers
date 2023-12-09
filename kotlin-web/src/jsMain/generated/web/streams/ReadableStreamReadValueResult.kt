// Automatically generated - do not modify!

package web.streams

sealed external interface ReadableStreamReadValueResult<T> :
    ReadableStreamReadResult<T> {
    var done: Boolean /* false */
    var value: T
}
