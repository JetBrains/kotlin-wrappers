// Automatically generated - do not modify!

package web.errors

import js.errors.JsErrorName
import js.internal.InternalApi
import js.reflect.unsafeCast

@SubclassOptInRequired(InternalApi::class)
external interface DOMExceptionName :
    JsErrorName

inline fun DOMExceptionName(
    value: String,
): DOMExceptionName =
    unsafeCast(value)

/**
 * The index is not in the allowed range. For example, this can be thrown by the [Range] object
 */
inline val DOMExceptionName.Companion.IndexSizeError: DOMExceptionName
    get() = DOMExceptionName("IndexSizeError")

/**
 * The node tree hierarchy is not correct
 */
inline val DOMExceptionName.Companion.HierarchyRequestError: DOMExceptionName
    get() = DOMExceptionName("HierarchyRequestError")

/**
 * The object is in the wrong [Document]
 */
inline val DOMExceptionName.Companion.WrongDocumentError: DOMExceptionName
    get() = DOMExceptionName("WrongDocumentError")

/**
 * The string contains invalid characters
 */
inline val DOMExceptionName.Companion.InvalidCharacterError: DOMExceptionName
    get() = DOMExceptionName("InvalidCharacterError")

/**
 * The object cannot be modified
 */
inline val DOMExceptionName.Companion.NoModificationAllowedError: DOMExceptionName
    get() = DOMExceptionName("NoModificationAllowedError")

/**
 * The object cannot be found here
 */
inline val DOMExceptionName.Companion.NotFoundError: DOMExceptionName
    get() = DOMExceptionName("NotFoundError")

/**
 * The operation is not supported
 */
inline val DOMExceptionName.Companion.NotSupportedError: DOMExceptionName
    get() = DOMExceptionName("NotSupportedError")

/**
 * The attribute is in use
 */
inline val DOMExceptionName.Companion.InUseAttributeError: DOMExceptionName
    get() = DOMExceptionName("InUseAttributeError")

/**
 * The object is in an invalid state
 */
inline val DOMExceptionName.Companion.InvalidStateError: DOMExceptionName
    get() = DOMExceptionName("InvalidStateError")

/**
 * The string did not match the expected pattern
 */
inline val DOMExceptionName.Companion.SyntaxError: DOMExceptionName
    get() = DOMExceptionName("SyntaxError")

/**
 * The object cannot be modified in this way
 */
inline val DOMExceptionName.Companion.InvalidModificationError: DOMExceptionName
    get() = DOMExceptionName("InvalidModificationError")

/**
 * The operation is not allowed by Namespaces in XML
 */
inline val DOMExceptionName.Companion.NamespaceError: DOMExceptionName
    get() = DOMExceptionName("NamespaceError")

/**
 * The object does not support the operation or argument
 */
inline val DOMExceptionName.Companion.InvalidAccessError: DOMExceptionName
    get() = DOMExceptionName("InvalidAccessError")

/**
 * The operation is insecure
 */
inline val DOMExceptionName.Companion.SecurityError: DOMExceptionName
    get() = DOMExceptionName("SecurityError")

/**
 * A network error occurred
 */
inline val DOMExceptionName.Companion.NetworkError: DOMExceptionName
    get() = DOMExceptionName("NetworkError")

/**
 * The operation was aborted
 */
inline val DOMExceptionName.Companion.AbortError: DOMExceptionName
    get() = DOMExceptionName("AbortError")

/**
 * The given URL does not match another URL
 */
inline val DOMExceptionName.Companion.URLMismatchError: DOMExceptionName
    get() = DOMExceptionName("URLMismatchError")

/**
 * The quota has been exceeded
 */
inline val DOMExceptionName.Companion.QuotaExceededError: DOMExceptionName
    get() = DOMExceptionName("QuotaExceededError")

/**
 * The operation timed out
 */
inline val DOMExceptionName.Companion.TimeoutError: DOMExceptionName
    get() = DOMExceptionName("TimeoutError")

/**
 * The node is incorrect or has an incorrect ancestor for this operation
 */
inline val DOMExceptionName.Companion.InvalidNodeTypeError: DOMExceptionName
    get() = DOMExceptionName("InvalidNodeTypeError")

/**
 * The object cannot be cloned
 */
inline val DOMExceptionName.Companion.DataCloneError: DOMExceptionName
    get() = DOMExceptionName("DataCloneError")

/**
 * The encoding or decoding operation failed
 */
inline val DOMExceptionName.Companion.EncodingError: DOMExceptionName
    get() = DOMExceptionName("EncodingError")

/**
 * The input/output read operation failed
 */
inline val DOMExceptionName.Companion.NotReadableError: DOMExceptionName
    get() = DOMExceptionName("NotReadableError")

/**
 * The operation failed for an unknown transient reason (e.g., out of memory)
 */
inline val DOMExceptionName.Companion.UnknownError: DOMExceptionName
    get() = DOMExceptionName("UnknownError")

/**
 * A mutation operation in a transaction failed because a constraint was not satisfied
 */
inline val DOMExceptionName.Companion.ConstraintError: DOMExceptionName
    get() = DOMExceptionName("ConstraintError")

/**
 * Provided data is inadequate
 */
inline val DOMExceptionName.Companion.DataError: DOMExceptionName
    get() = DOMExceptionName("DataError")

/**
 * A request was placed against a transaction that is currently not active or is finished
 */
inline val DOMExceptionName.Companion.TransactionInactiveError: DOMExceptionName
    get() = DOMExceptionName("TransactionInactiveError")

/**
 * The mutating operation was attempted in a "readonly" transaction
 */
inline val DOMExceptionName.Companion.ReadOnlyError: DOMExceptionName
    get() = DOMExceptionName("ReadOnlyError")

/**
 * An attempt was made to open a database using a lower version than the existing version
 */
inline val DOMExceptionName.Companion.VersionError: DOMExceptionName
    get() = DOMExceptionName("VersionError")

/**
 * The operation failed for an operation-specific reason
 */
inline val DOMExceptionName.Companion.OperationError: DOMExceptionName
    get() = DOMExceptionName("OperationError")

/**
 * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
 */
inline val DOMExceptionName.Companion.NotAllowedError: DOMExceptionName
    get() = DOMExceptionName("NotAllowedError")
