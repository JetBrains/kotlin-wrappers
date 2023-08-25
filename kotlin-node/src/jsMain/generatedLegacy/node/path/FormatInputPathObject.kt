// Automatically generated - do not modify!

package node.path

sealed external interface FormatInputPathObject {
    /**
     * The root of the path such as '/' or 'c:\'
     */
    var root: String?

    /**
     * The full directory path such as '/home/user/dir' or 'c:\path\dir'
     */
    var dir: String?

    /**
     * The file name including extension (if any) such as 'index.html'
     */
    var base: String?

    /**
     * The file extension (if any) such as '.html'
     */
    var ext: String?

    /**
     * The file name without extension (if any) such as 'index'
     */
    var name: String?
}
