plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    // useEsModules() is required to reproduce SyntaxError: Identifier 'set' has already been declared.
    // Combined with kotlin.js.ir.output.granularity=per-file (gradle.properties), the IR backend
    // emits duplicate top-level function set/function get helpers for each of the csstype builder
    // types that inherit Record.set = definedExternally through multiple diamond interface paths.
    js {
        useEsModules()
    }
}

dependencies {
    webTestImplementation(projects.kotlinCsstype)
    webTestImplementation(libs.kotlin.test)
}

// Explicit ESM syntax check — runs before jsNodeTest so a duplicate-helper regression surfaces
// as a clear SyntaxError rather than a cryptic module-load crash from the test runner.
val nodeCheckJsTestEsm by tasks.registering(Exec::class) {
    group = "verification"
    description = "Validates ESM syntax of proof .mjs to catch duplicate set/get helper regressions"
    dependsOn("compileTestDevelopmentExecutableKotlinJs")
    commandLine(
        "node", "--check",
        layout.buildDirectory
            .file("compileSync/js/test/testDevelopmentExecutable/kotlin/${project.name}-test.mjs")
            .get().asFile.absolutePath,
    )
}

tasks.named("jsNodeTest").configure {
    dependsOn(nodeCheckJsTestEsm)
}
