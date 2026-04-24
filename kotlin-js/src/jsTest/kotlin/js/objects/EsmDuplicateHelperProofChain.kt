// Proof for KT-ESM-DUPLICATE-HELPERS: Kotlin/JS IR emits duplicate top-level
// `function set` helpers in the generated .mjs when multiple regular (non-external)
// interfaces in the same compilation unit each directly inherit `Record.set = definedExternally`.
//
// Reproducing configuration: useEsModules() + kotlin.js.ir.output.granularity=per-file.
// All five interfaces live in this single source file so per-file compilation bundles
// them into ONE .mjs — five interfaces × one `function set` helper each =
// five `function set` declarations in the output → SyntaxError before the fix.

package js.objects

import kotlin.js.JsAny
import kotlin.js.JsString

// Five regular (non-external) interfaces, each directly extending Record<JsString, JsAny?>.
// Unlike external interfaces (erased at runtime), regular interfaces cause the Kotlin/JS IR
// backend to emit a top-level `function set` helper per interface in the compiled .mjs.
interface ProofBranchA : Record<JsString, JsAny?>
interface ProofBranchB : Record<JsString, JsAny?>
interface ProofBranchC : Record<JsString, JsAny?>
interface ProofBranchD : Record<JsString, JsAny?>
interface ProofBranchE : Record<JsString, JsAny?>

// Factory forces this module to be imported at runtime, triggering any duplicate-set SyntaxError.
fun createProofRecord(): ProofBranchA = unsafeJso()
