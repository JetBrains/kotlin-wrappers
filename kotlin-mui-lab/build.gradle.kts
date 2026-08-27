plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinMuiMaterial)
        api(projects.kotlinMuixTreeView)

        npm(jspkg.mui.lab)
    }
}
