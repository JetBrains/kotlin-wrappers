// Automatically generated - do not modify!

@file:JsModule("@actions/core")

package actions.core

import js.core.ReadonlyArray
import js.promise.Promise

external class Summary {
    constructor()

    /**
     * Writes text in the buffer to the summary buffer file and empties buffer. Will append by default.
     *
     * @param {SummaryWriteOptions} [options] (optional) options for write operation
     *
     * @returns {Promise<Summary>} summary instance
     */
    fun write(options: SummaryWriteOptions = definedExternally): Promise<Summary>

    /**
     * Clears the summary buffer and wipes the summary file
     *
     * @returns {Summary} summary instance
     */
    fun clear(): Promise<Summary>

    /**
     * Returns the current summary buffer as a string
     *
     * @returns {string} string of summary buffer
     */
    fun stringify(): String

    /**
     * If the summary buffer is empty
     *
     * @returns {boolen} true if the buffer is empty
     */
    fun isEmptyBuffer(): Boolean

    /**
     * Resets the summary buffer without writing to summary file
     *
     * @returns {Summary} summary instance
     */
    fun emptyBuffer(): Summary

    /**
     * Adds raw text to the summary buffer
     *
     * @param {string} text content to add
     * @param {boolean} [addEOL=false] (optional) append an EOL to the raw text (default: false)
     *
     * @returns {Summary} summary instance
     */
    fun addRaw(
        text: String,
        addEOL: Boolean = definedExternally,
    ): Summary

    /**
     * Adds the operating system-specific end-of-line marker to the buffer
     *
     * @returns {Summary} summary instance
     */
    fun addEOL(): Summary

    /**
     * Adds an HTML codeblock to the summary buffer
     *
     * @param {string} code content to render within fenced code block
     * @param {string} lang (optional) language to syntax highlight code
     *
     * @returns {Summary} summary instance
     */
    fun addCodeBlock(
        code: String,
        lang: String = definedExternally,
    ): Summary

    /**
     * Adds an HTML list to the summary buffer
     *
     * @param {string[]} items list of items to render
     * @param {boolean} [ordered=false] (optional) if the rendered list should be ordered or not (default: false)
     *
     * @returns {Summary} summary instance
     */
    fun addList(
        items: ReadonlyArray<String>,
        ordered: Boolean = definedExternally,
    ): Summary

    /**
     * Adds an HTML table to the summary buffer
     *
     * @param {SummaryTableCell[]} rows table rows
     *
     * @returns {Summary} summary instance
     */
    fun addTable(rows: ReadonlyArray<SummaryTableRow>): Summary

    /**
     * Adds a collapsable HTML details element to the summary buffer
     *
     * @param {string} label text for the closed state
     * @param {string} content collapsable content
     *
     * @returns {Summary} summary instance
     */
    fun addDetails(
        label: String,
        content: String,
    ): Summary

    /**
     * Adds an HTML image tag to the summary buffer
     *
     * @param {string} src path to the image you to embed
     * @param {string} alt text description of the image
     * @param {SummaryImageOptions} options (optional) addition image attributes
     *
     * @returns {Summary} summary instance
     */
    fun addImage(
        src: String,
        alt: String,
        options: SummaryImageOptions = definedExternally,
    ): Summary

    /**
     * Adds an HTML section heading element
     *
     * @param {string} text heading text
     * @param {number | string} [level=1] (optional) the heading level, default: 1
     *
     * @returns {Summary} summary instance
     */
    fun addHeading(
        text: String,
        level: Number = definedExternally,
    ): Summary

    fun addHeading(
        text: String,
        level: String = definedExternally,
    ): Summary

    /**
     * Adds an HTML thematic break (<hr>) to the summary buffer
     *
     * @returns {Summary} summary instance
     */
    fun addSeparator(): Summary

    /**
     * Adds an HTML line break (<br>) to the summary buffer
     *
     * @returns {Summary} summary instance
     */
    fun addBreak(): Summary

    /**
     * Adds an HTML blockquote to the summary buffer
     *
     * @param {string} text quote text
     * @param {string} cite (optional) citation url
     *
     * @returns {Summary} summary instance
     */
    fun addQuote(
        text: String,
        cite: String = definedExternally,
    ): Summary

    /**
     * Adds an HTML anchor tag to the summary buffer
     *
     * @param {string} text link text/content
     * @param {string} href hyperlink
     *
     * @returns {Summary} summary instance
     */
    fun addLink(
        text: String,
        href: String,
    ): Summary
}
