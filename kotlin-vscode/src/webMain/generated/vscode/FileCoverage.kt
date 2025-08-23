// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Contains coverage metadata for a file.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage)
 */
open external class FileCoverage {
    /**
     * File URI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.uri)
     */
    val uri: Uri

    /**
     * Statement coverage information. If the reporter does not provide statement
     * coverage information, this can instead be used to represent line coverage.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.statementCoverage)
     */
    var statementCoverage: TestCoverageCount

    /**
     * Branch coverage information.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.branchCoverage)
     */
    var branchCoverage: TestCoverageCount?

    /**
     * Declaration coverage information. Depending on the reporter and
     * language, this may be types such as functions, methods, or namespaces.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.declarationCoverage)
     */
    var declarationCoverage: TestCoverageCount?

    /**
     * A list of [test cases][TestItem] that generated coverage in this
     * file. If set, then [TestRunProfile.loadDetailedCoverageForTest]
     * should also be defined in order to retrieve detailed coverage information.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.includesTests)
     */
    var includesTests: ReadonlyArray<TestItem>?

    /**
     * @param uri Covered file URI
     * @param statementCoverage Statement coverage information. If the reporter
     * does not provide statement coverage information, this can instead be
     * used to represent line coverage.
     * @param branchCoverage Branch coverage information
     * @param declarationCoverage Declaration coverage information
     * @param includesTests Test cases included in this coverage report, see [FileCoverage.includesTests]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.constructor)
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
         * @param details Detailed coverage information
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCoverage.fromDetails)
         */
        fun fromDetails(
            uri: Uri,
            details: ReadonlyArray<FileCoverageDetail>,
        ): FileCoverage
    }
}
