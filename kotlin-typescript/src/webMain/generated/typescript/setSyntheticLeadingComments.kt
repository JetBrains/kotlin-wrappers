// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.ast.Node
import typescript.ast.visitor.SynthesizedComment

external fun <T : Node> setSyntheticLeadingComments(
    node: T,
    comments: js.array.ReadonlyArray<SynthesizedComment>?,
): T
