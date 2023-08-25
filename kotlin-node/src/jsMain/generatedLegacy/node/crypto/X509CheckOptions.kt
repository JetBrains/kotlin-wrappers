// Automatically generated - do not modify!

package node.crypto

sealed external interface X509CheckOptions {
    /**
     * @default 'always'
     */
    var subject: Any? /* 'always' | 'default' | 'never' */

    /**
     * @default true
     */
    var wildcards: Boolean?

    /**
     * @default true
     */
    var partialWildcards: Boolean?

    /**
     * @default false
     */
    var multiLabelWildcards: Boolean?

    /**
     * @default false
     */
    var singleLabelSubdomains: Boolean?
}
