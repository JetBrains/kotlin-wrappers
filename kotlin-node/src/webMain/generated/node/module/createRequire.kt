// Automatically generated - do not modify!

@file:JsModule("node:module")

package node.module

import web.url.URL

/**
 * @since v12.2.0
 * @param path Filename to be used to construct the require
 * function. Must be a file URL object, file URL string, or absolute path
 * string.
 */
external fun createRequire(path: String): Require

/**
 * @since v12.2.0
 * @param path Filename to be used to construct the require
 * function. Must be a file URL object, file URL string, or absolute path
 * string.
 */
external fun createRequire(path: URL): Require
