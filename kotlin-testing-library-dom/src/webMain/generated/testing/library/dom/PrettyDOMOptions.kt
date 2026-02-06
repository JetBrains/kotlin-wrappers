// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: * as prettyFormat from "pretty-format"
import web.dom.Node

external interface PrettyDOMOptions {
    /**
     * Given a `Node` return `false` if you wish to ignore that node in the output.
     * By default, ignores `<style />`, `<script />` and comment nodes.
     */
    var filterNode: ((node: Node) -> Boolean)?
}
