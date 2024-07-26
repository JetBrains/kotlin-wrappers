// Automatically generated - do not modify!

@file:JsModule("@actions/github")

package actions.github

import js.objects.ReadonlyRecord

external fun getOctokit(
    token: String,
    options: ReadonlyRecord<String, Any> /* OctokitOptions */ = definedExternally,
    vararg additionalPlugins: Function<Any>, /* OctokitPlugin */
): dynamic /* InstanceType<typeof GitHub> */
