// Automatically generated - do not modify!

package web.errors

import js.errors.JsError
import js.errors.JsErrorName
import js.reflect.unsafeCast
import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * The **`DOMException`** interface represents an abnormal event (called an **exception**) that occurs as a result of calling a method or accessing a property of a web API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException)
 */
open external class DOMException(
    /**
     * The **`message`** read-only property of the DOMException interface returns a string representing a message or description associated with the given error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/message)
     */
    override val message: String = definedExternally,
    /**
     * The **`name`** read-only property of the DOMException interface returns a string that contains one of the strings associated with an error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/name)
     */
    val name: JsErrorName = definedExternally,
) : JsError,
    Serializable {
    companion object
}

/**
 * The index is not in the allowed range. For example, this can be thrown by the [Range] object
 */
inline val DOMException.Companion.IndexSizeError: JsErrorName
    get() = unsafeCast("IndexSizeError")

/**
 * The node tree hierarchy is not correct
 */
inline val DOMException.Companion.HierarchyRequestError: JsErrorName
    get() = unsafeCast("HierarchyRequestError")

/**
 * The object is in the wrong [Document]
 */
inline val DOMException.Companion.WrongDocumentError: JsErrorName
    get() = unsafeCast("WrongDocumentError")

/**
 * The string contains invalid characters
 */
inline val DOMException.Companion.InvalidCharacterError: JsErrorName
    get() = unsafeCast("InvalidCharacterError")

/**
 * The object cannot be modified
 */
inline val DOMException.Companion.NoModificationAllowedError: JsErrorName
    get() = unsafeCast("NoModificationAllowedError")

/**
 * The object cannot be found here
 */
inline val DOMException.Companion.NotFoundError: JsErrorName
    get() = unsafeCast("NotFoundError")

/**
 * The operation is not supported
 */
inline val DOMException.Companion.NotSupportedError: JsErrorName
    get() = unsafeCast("NotSupportedError")

/**
 * The attribute is in use
 */
inline val DOMException.Companion.InUseAttributeError: JsErrorName
    get() = unsafeCast("InUseAttributeError")

/**
 * The object is in an invalid state
 */
inline val DOMException.Companion.InvalidStateError: JsErrorName
    get() = unsafeCast("InvalidStateError")

/**
 * The string did not match the expected pattern
 */
inline val DOMException.Companion.SyntaxError: JsErrorName
    get() = unsafeCast("SyntaxError")

/**
 * The object cannot be modified in this way
 */
inline val DOMException.Companion.InvalidModificationError: JsErrorName
    get() = unsafeCast("InvalidModificationError")

/**
 * The operation is not allowed by Namespaces in XML
 */
inline val DOMException.Companion.NamespaceError: JsErrorName
    get() = unsafeCast("NamespaceError")

/**
 * The object does not support the operation or argument
 */
inline val DOMException.Companion.InvalidAccessError: JsErrorName
    get() = unsafeCast("InvalidAccessError")

/**
 * The operation is insecure
 */
inline val DOMException.Companion.SecurityError: JsErrorName
    get() = unsafeCast("SecurityError")

/**
 * A network error occurred
 */
inline val DOMException.Companion.NetworkError: JsErrorName
    get() = unsafeCast("NetworkError")

/**
 * The operation was aborted
 */
inline val DOMException.Companion.AbortError: JsErrorName
    get() = unsafeCast("AbortError")

/**
 * The given URL does not match another URL
 */
inline val DOMException.Companion.URLMismatchError: JsErrorName
    get() = unsafeCast("URLMismatchError")

/**
 * The quota has been exceeded
 */
inline val DOMException.Companion.QuotaExceededError: JsErrorName
    get() = unsafeCast("QuotaExceededError")

/**
 * The operation timed out
 */
inline val DOMException.Companion.TimeoutError: JsErrorName
    get() = unsafeCast("TimeoutError")

/**
 * The node is incorrect or has an incorrect ancestor for this operation
 */
inline val DOMException.Companion.InvalidNodeTypeError: JsErrorName
    get() = unsafeCast("InvalidNodeTypeError")

/**
 * The object can not be cloned
 */
inline val DOMException.Companion.DataCloneError: JsErrorName
    get() = unsafeCast("DataCloneError")

/**
 * The encoding or decoding operation failed
 */
inline val DOMException.Companion.EncodingError: JsErrorName
    get() = unsafeCast("EncodingError")

/**
 * The input/output read operation failed
 */
inline val DOMException.Companion.NotReadableError: JsErrorName
    get() = unsafeCast("NotReadableError")

/**
 * The operation failed for an unknown transient reason (e.g., out of memory)
 */
inline val DOMException.Companion.UnknownError: JsErrorName
    get() = unsafeCast("UnknownError")

/**
 * A mutation operation in a transaction failed because a constraint was not satisfied
 */
inline val DOMException.Companion.ConstraintError: JsErrorName
    get() = unsafeCast("ConstraintError")

/**
 * Provided data is inadequate
 */
inline val DOMException.Companion.DataError: JsErrorName
    get() = unsafeCast("DataError")

/**
 * A request was placed against a transaction that is currently not active or is finished
 */
inline val DOMException.Companion.TransactionInactiveError: JsErrorName
    get() = unsafeCast("TransactionInactiveError")

/**
 * The mutating operation was attempted in a "readonly" transaction
 */
inline val DOMException.Companion.ReadOnlyError: JsErrorName
    get() = unsafeCast("ReadOnlyError")

/**
 * An attempt was made to open a database using a lower version than the existing version
 */
inline val DOMException.Companion.VersionError: JsErrorName
    get() = unsafeCast("VersionError")

/**
 * The operation failed for an operation-specific reason
 */
inline val DOMException.Companion.OperationError: JsErrorName
    get() = unsafeCast("OperationError")

/**
 * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
 */
inline val DOMException.Companion.NotAllowedError: JsErrorName
    get() = unsafeCast("NotAllowedError")
