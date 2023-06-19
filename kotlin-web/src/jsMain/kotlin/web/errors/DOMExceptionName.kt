package web.errors

import js.errors.JsErrorName

/**
 * [Source](https://developer.mozilla.org/en-US/docs/Web/API/DOMException#error_names)
 */
object DOMExceptionName {

    /**
     * The index is not in the allowed range. For example, this can be thrown by the Range object
     */
    inline val IndexSizeError: JsErrorName
        get() = JsErrorName("IndexSizeError")


    /**
     * The node tree hierarchy is not correct
     */
    inline val HierarchyRequestError: JsErrorName
        get() = JsErrorName("HierarchyRequestError")


    /**
     * The object is in the wrong Document
     */
    inline val WrongDocumentError: JsErrorName
        get() = JsErrorName("WrongDocumentError")


    /**
     * The string contains invalid characters
     */
    inline val InvalidCharacterError: JsErrorName
        get() = JsErrorName("InvalidCharacterError")


    /**
     * The object cannot be modified
     */
    inline val NoModificationAllowedError: JsErrorName
        get() = JsErrorName("NoModificationAllowedError")


    /**
     * The object cannot be found here
     */
    inline val NotFoundError: JsErrorName
        get() = JsErrorName("NotFoundError")


    /**
     * The operation is not supported
     */
    inline val NotSupportedError: JsErrorName
        get() = JsErrorName("NotSupportedError")


    /**
     * The object is in an invalid state
     */
    inline val InvalidStateError: JsErrorName
        get() = JsErrorName("InvalidStateError")


    /**
     * The attribute is in use
     */
    inline val InUseAttributeError: JsErrorName
        get() = JsErrorName("InUseAttributeError")


    /**
     * The string did not match the expected pattern
     */
    inline val SyntaxError: JsErrorName
        get() = JsErrorName("SyntaxError")


    /**
     * The object cannot be modified in this way
     */
    inline val InvalidModificationError: JsErrorName
        get() = JsErrorName("InvalidModificationError")


    /**
     * The operation is not allowed by Namespaces in XML
     */
    inline val NamespaceError: JsErrorName
        get() = JsErrorName("NamespaceError")


    /**
     * The object does not support the operation or argument
     */
    inline val InvalidAccessError: JsErrorName
        get() = JsErrorName("InvalidAccessError")


    /**
     * The operation is insecure
     */
    inline val SecurityError: JsErrorName
        get() = JsErrorName("SecurityError")


    /**
     * A network error occurred
     */
    inline val NetworkError: JsErrorName
        get() = JsErrorName("NetworkError")


    /**
     * The operation was aborted
     */
    inline val AbortError: JsErrorName
        get() = JsErrorName("AbortError")


    /**
     * The given URL does not match another URL
     */
    inline val URLMismatchError: JsErrorName
        get() = JsErrorName("URLMismatchError")


    /**
     * The quota has been exceeded
     */
    inline val QuotaExceededError: JsErrorName
        get() = JsErrorName("QuotaExceededError")


    /**
     * The operation timed out
     */
    inline val TimeoutError: JsErrorName
        get() = JsErrorName("TimeoutError")


    /**
     * The node is incorrect or has an incorrect ancestor for this operation
     */
    inline val InvalidNodeTypeError: JsErrorName
        get() = JsErrorName("InvalidNodeTypeError")


    /**
     * The object can not be cloned
     */
    inline val DataCloneError: JsErrorName
        get() = JsErrorName("DataCloneError")


    /**
     * The encoding or decoding operation failed
     */
    inline val EncodingError: JsErrorName
        get() = JsErrorName("EncodingError")


    /**
     * The input/output read operation failed
     */
    inline val NotReadableError: JsErrorName
        get() = JsErrorName("NotReadableError")


    /**
     * The operation failed for an unknown transient reason (e.g. out of memory)
     */
    inline val UnknownError: JsErrorName
        get() = JsErrorName("UnknownError")


    /**
     * A mutation operation in a transaction failed because a constraint was not satisfied
     */
    inline val ConstraintError: JsErrorName
        get() = JsErrorName("ConstraintError")


    /**
     * Provided data is inadequate
     */
    inline val DataError: JsErrorName
        get() = JsErrorName("DataError")


    /**
     * A request was placed against a transaction that is currently not active or is finished
     */
    inline val TransactionInactiveError: JsErrorName
        get() = JsErrorName("TransactionInactiveError")


    /**
     * The mutating operation was attempted in a "readonly" transaction
     */
    inline val ReadOnlyError: JsErrorName
        get() = JsErrorName("ReadOnlyError")


    /**
     * An attempt was made to open a database using a lower version than the existing version
     */
    inline val VersionError: JsErrorName
        get() = JsErrorName("VersionError")


    /**
     * The operation failed for an operation-specific reason
     */
    inline val OperationError: JsErrorName
        get() = JsErrorName("OperationError")


    /**
     * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
     */
    inline val NotAllowedError: JsErrorName
        get() = JsErrorName("NotAllowedError")
}
