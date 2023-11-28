// Automatically generated - do not modify!

package web.errors

import js.errors.JsError
import js.errors.JsErrorName
import seskar.js.JsValue

/**
 * An abnormal event (called an exception) which occurs as a result of calling a method or accessing a property of a web API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException)
 */
open external class DOMException(
    message: String = definedExternally,
    name: JsErrorName = definedExternally,
) : JsError {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/message) */
    override val message: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/name) */
    val name: JsErrorName

    companion object {
        /**
         * The index is not in the allowed range. For example, this can be thrown by the `Range` object
         */
        @JsValue("IndexSizeError")
        val IndexSizeError: JsErrorName

        /**
         * The node tree hierarchy is not correct
         */
        @JsValue("HierarchyRequestError")
        val HierarchyRequestError: JsErrorName

        /**
         * The object is in the wrong `Document`
         */
        @JsValue("WrongDocumentError")
        val WrongDocumentError: JsErrorName

        /**
         * The string contains invalid characters
         */
        @JsValue("InvalidCharacterError")
        val InvalidCharacterError: JsErrorName

        /**
         * The object cannot be modified
         */
        @JsValue("NoModificationAllowedError")
        val NoModificationAllowedError: JsErrorName

        /**
         * The object cannot be found here
         */
        @JsValue("NotFoundError")
        val NotFoundError: JsErrorName

        /**
         * The operation is not supported
         */
        @JsValue("NotSupportedError")
        val NotSupportedError: JsErrorName

        /**
         * The object is in an invalid state
         */
        @JsValue("InvalidStateError")
        val InvalidStateError: JsErrorName

        /**
         * The attribute is in use
         */
        @JsValue("InUseAttributeError")
        val InUseAttributeError: JsErrorName

        /**
         * The string did not match the expected pattern
         */
        @JsValue("SyntaxError")
        val SyntaxError: JsErrorName

        /**
         * The object cannot be modified in this way
         */
        @JsValue("InvalidModificationError")
        val InvalidModificationError: JsErrorName

        /**
         * The operation is not allowed by Namespaces in XML
         */
        @JsValue("NamespaceError")
        val NamespaceError: JsErrorName

        /**
         * The object does not support the operation or argument
         */
        @JsValue("InvalidAccessError")
        val InvalidAccessError: JsErrorName

        /**
         * The operation is insecure
         */
        @JsValue("SecurityError")
        val SecurityError: JsErrorName

        /**
         * A network error occurred
         */
        @JsValue("NetworkError")
        val NetworkError: JsErrorName

        /**
         * The operation was aborted
         */
        @JsValue("AbortError")
        val AbortError: JsErrorName

        /**
         * The given URL does not match another URL
         */
        @JsValue("URLMismatchError")
        val URLMismatchError: JsErrorName

        /**
         * The quota has been exceeded
         */
        @JsValue("QuotaExceededError")
        val QuotaExceededError: JsErrorName

        /**
         * The operation timed out
         */
        @JsValue("TimeoutError")
        val TimeoutError: JsErrorName

        /**
         * The node is incorrect or has an incorrect ancestor for this operation
         */
        @JsValue("InvalidNodeTypeError")
        val InvalidNodeTypeError: JsErrorName

        /**
         * The object can not be cloned
         */
        @JsValue("DataCloneError")
        val DataCloneError: JsErrorName

        /**
         * The encoding or decoding operation failed
         */
        @JsValue("EncodingError")
        val EncodingError: JsErrorName

        /**
         * The input/output read operation failed
         */
        @JsValue("NotReadableError")
        val NotReadableError: JsErrorName

        /**
         * The operation failed for an unknown transient reason (e.g. out of memory)
         */
        @JsValue("UnknownError")
        val UnknownError: JsErrorName

        /**
         * A mutation operation in a transaction failed because a constraint was not satisfied
         */
        @JsValue("ConstraintError")
        val ConstraintError: JsErrorName

        /**
         * Provided data is inadequate
         */
        @JsValue("DataError")
        val DataError: JsErrorName

        /**
         * A request was placed against a transaction that is currently not active or is finished
         */
        @JsValue("TransactionInactiveError")
        val TransactionInactiveError: JsErrorName

        /**
         * The mutating operation was attempted in a "readonly" transaction
         */
        @JsValue("ReadOnlyError")
        val ReadOnlyError: JsErrorName

        /**
         * An attempt was made to open a database using a lower version than the existing version
         */
        @JsValue("VersionError")
        val VersionError: JsErrorName

        /**
         * The operation failed for an operation-specific reason
         */
        @JsValue("OperationError")
        val OperationError: JsErrorName

        /**
         * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
         */
        @JsValue("NotAllowedError")
        val NotAllowedError: JsErrorName
    }
}
