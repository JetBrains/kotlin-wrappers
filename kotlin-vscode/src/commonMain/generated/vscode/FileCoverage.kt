// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Contains coverage metadata for a file.
 */
open external class FileCoverage {
    /**
     * File URI.
     */
    val uri: Uri

    /**
     * Statement coverage information. If the reporter does not provide statement
     * coverage information, this can instead be used to represent line coverage.
     */
    var statementCoverage: TestCoverageCount

    /**
     * Branch coverage information.
     */
    var branchCoverage: TestCoverageCount?

    /**
     * Declaration coverage information. Depending on the reporter and
     * language, this may be types such as functions, methods, or namespaces.
     */
    var declarationCoverage: TestCoverageCount?

    /**
     * A list of {@link TestItem test cases} that generated coverage in this
     * file. If set, then {@link TestRunProfile.loadDetailedCoverageForTest}
     * should also be defined in order to retrieve detailed coverage information.
     */
    var includesTests: ReadonlyArray<TestItem>?

    /**
     * @param uri Covered file URI
     * @param statementCoverage Statement coverage information. If the reporter
     * does not provide statement coverage information, this can instead be
     * used to represent line coverage.
     * @param branchCoverage Branch coverage information
     * @param declarationCoverage Declaration coverage information
     * @param includesTests Test cases included in this coverage report, see {@link FileCoverage.includesTests}
     */
    /*
    constructor(
        uri: Uri,
        statementCoverage: TestCoverageCount,
        branchCoverage?: TestCoverageCount,
        declarationCoverage?: TestCoverageCount,
        includesTests?: TestItem[],
    )
    */

    companion object {
        /**
         * Creates a [FileCoverage] instance with counts filled in from
         * the coverage details.
         * @param uri Covered file URI
         * @param detailed Detailed coverage information
         */
        fun fromDetails(
            uri: Uri,
            details: ReadonlyArray<FileCoverageDetail>,
        ): FileCoverage
    }
}
