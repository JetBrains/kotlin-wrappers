plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinMuiMaterial)
        api(projects.kotlinMuixTreeView)

        api(npm(jspkg.mui.lab))
    }
}
